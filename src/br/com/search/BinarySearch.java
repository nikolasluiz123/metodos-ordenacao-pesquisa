package br.com.search;

import java.util.List;

public final class BinarySearch {

	/**
	 * Pesquisa binárias realizada com array de long
	 * 
	 * @author Nikolas Luiz Schmitt
	 *
	 */
	public static int binarySearch(long[] array, long target) {
		int left = 0;
		int right = array.length - 1;

		while (left <= right) {
			int mid = left + (right - left) / 2;

			if (array[mid] == target) {
				return mid;
			} else if (array[mid] < target) {
				left = mid + 1;
			} else {
				right = mid - 1;
			}
		}

		return -1;
	}
	
	/**
	 * Pesquisa binária realizada com uma lista de long
	 * 
	 * @author Nikolas Luiz Schmitt
	 *
	 */
	public static int binarySearch(List<Long> list, long target) {
        int left = 0;
        int right = list.size() - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (list.get(mid) == target) {
                return mid;
            } else if (list.get(mid) < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return -1;
    }
}
