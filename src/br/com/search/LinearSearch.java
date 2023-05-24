package br.com.search;

import java.util.List;
import java.util.Optional;

public class LinearSearch {

	/**
	 * Método que realiza a pesquisa percorrendo o array olhando o valor de cada
	 * posição
	 * 
	 * @author Nikolas Luiz Schmitt
	 *
	 */
	public static int search(long[] array, long target) {
		for (int i = 0; i < array.length; i++) {
			if (array[i] == target) {
				return i;
			}
		}

		return -1;
	}

	/**
	 * Método que realiza a pesquisa percorrendo a lista olhando o valor de caa
	 * posição
	 * 
	 * @author Nikolas Luiz Schmitt
	 *
	 */
	public static int search(List<Long> list, long target) {
		for (Long number : list) {
			if (number == target) {
				return list.indexOf(number);
			}
		}

		return -1;
	}

	/**
	 * Método que realiza um filtro para tentar obter um número igual ao
	 * especificado.
	 * 
	 * @author Nikolas Luiz Schmitt
	 *
	 */
	public static int searchConvenient(List<Long> list, long target) {
		Optional<Long> optional = list.stream().filter(n -> n == target).findAny();

		if (optional.isPresent()) {
			return list.indexOf(optional.get());
		}

		return -1;
	}
}
