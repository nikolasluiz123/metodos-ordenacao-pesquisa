package br.com.sort;

import java.util.List;

public class InsertionSort {

	public static long[] sort(long[] array) {
		for (int i = 1; i < array.length; i++) {
			long key = array[i];
			int j = i - 1;

			while (j >= 0 && array[j] > key) {
				array[j + 1] = array[j];
				j--;
			}

			array[j + 1] = key;
		}

		return array;
	}

	public static List<Long> sort(List<Long> list) {
		for (int i = 1; i < list.size(); i++) {
			long key = list.get(i);
			int j = i - 1;

			while (j >= 0 && list.get(j) > key) {
				list.set(j + 1, list.get(j));
				j--;
			}

			list.set(j + 1, key);
		}

		return list;
	}
}
