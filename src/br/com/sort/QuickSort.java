package br.com.sort;

import java.util.List;
import java.util.Stack;

public class QuickSort {

	public static void sort(long[] arr) {
		sort(arr, 0, arr.length - 1);
	}

	private static void sort(long[] arr, int low, int high) {
		while (low < high) {
			int pivotIndex = partition(arr, low, high);

			if (pivotIndex - low < high - pivotIndex) {
				sort(arr, low, pivotIndex - 1);
				low = pivotIndex + 1;
			} else {
				sort(arr, pivotIndex + 1, high);
				high = pivotIndex - 1;
			}
		}
	}

	private static int partition(long[] arr, int low, int high) {
		long pivot = arr[high];
		int i = low - 1;

		for (int j = low; j < high; j++) {
			if (arr[j] < pivot) {
				i++;
				swap(arr, i, j);
			}
		}

		swap(arr, i + 1, high);
		return i + 1;
	}

	private static void swap(long[] arr, int i, int j) {
		long temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	public static void sort(List<Long> numbers) {
		int low = 0;
		int high = numbers.size() - 1;

		Stack<Integer> stack = new Stack<>();
		stack.push(low);
		stack.push(high);

		while (!stack.isEmpty()) {
			high = stack.pop();
			low = stack.pop();

			int pivotIndex = partition(numbers, low, high);

			if (pivotIndex - 1 > low) {
				stack.push(low);
				stack.push(pivotIndex - 1);
			}

			if (pivotIndex + 1 < high) {
				stack.push(pivotIndex + 1);
				stack.push(high);
			}
		}
	}

	private static int partition(List<Long> numbers, int low, int high) {
		long pivot = numbers.get(high);
		int i = low - 1;

		for (int j = low; j < high; j++) {
			if (numbers.get(j) < pivot) {
				i++;
				swap(numbers, i, j);
			}
		}

		swap(numbers, i + 1, high);
		return i + 1;
	}

	private static void swap(List<Long> numbers, int i, int j) {
		long temp = numbers.get(i);
		numbers.set(i, numbers.get(j));
		numbers.set(j, temp);
	}
}
