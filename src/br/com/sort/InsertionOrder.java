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
		long key;
		int i;

		for (int j = 1; j < list.size(); j++) {
			key = list.get(j);

			for (i = j - 1; (i >= 0) && (list.get(i) > key); i--) {
				list.set(i + 1, list.get(i));
			}

			list.set(i + 1, key);
		}

		return list;
	}
}
