package br.com.search;

import java.util.List;

public class BinaryRecursiveSearch {

	/**
	 * Pesquisa binária recursiva realizada com array de long
	 * 
	 * @author Nikolas Luiz Schmitt
	 *
	 */
	public static int search(long[] array, long target, int low, int high) {
		if (low > high) {
			return -1;
		}

		int mid = low + (high - low) / 2;

		if (array[mid] == target) {
			return mid;
		} else if (array[mid] < target) {
			return search(array, target, mid + 1, high);
		} else {
			return search(array, target, low, mid - 1);
		}
	}

	/**
	 * Pesquisa binária recursiva realizada com uma lista de long
	 * 
	 * @author Nikolas Luiz Schmitt
	 *
	 */
	public static int search(List<Long> list, long target, int low, int high) {
		if (low > high) {
			return -1;
		}

		int mid = low + (high - low) / 2;

		if (list.get(mid) == target) {
			return mid;
		} else if (list.get(mid) < target) {
			return search(list, target, mid + 1, high);
		} else {
			return search(list, target, low, mid - 1);
		}
	}
}
