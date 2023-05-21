package br.com.sort;

import java.util.List;

public class InsertionOrder {

	public static long[] order(long[] array) {
		long key;
		int i;

		for (int j = 1; j < array.length; j++) {
			key = array[j];

			for (i = j - 1; (i >= 0) && (array[i] > key); i--) {
				array[i + 1] = array[i];
			}

			array[i + 1] = key;
		}

		return array;
	}

	public static List<Long> order(List<Long> list) {
		int size = list.size();

		for (int i = 1; i < size; i++) {
			Long key = list.get(i);
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
