package br.com.reader;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class FileReaderHelper {

	private String fileName;

	public FileReaderHelper(String fileName) {
		this.fileName = fileName;
	}

	/**
	 * Método que faz a leitura do arquivo usando o Scanner e retorna um array de
	 * long.
	 * 
	 * Essa é uma forma menos performática de fazer a leitura.
	 * 
	 * @author Nikolas Luiz Schmitt
	 *
	 */
	public long[] readNumbersFromFile() throws Exception {
		long[] numbers = null;

		File file = new File(this.fileName);
		Scanner scanner = new Scanner(file);

		int count = 0;
		while (scanner.hasNextLong()) {
			scanner.nextLong();
			count++;
		}

		scanner.close();

		numbers = new long[count];

		scanner = new Scanner(file);
		for (int i = 0; i < count; i++) {
			numbers[i] = scanner.nextLong();
		}

		scanner.close();
		
		Arrays.sort(numbers);

		return numbers;
	}

	/**
	 * Método que faz a leitura do arquivo usando um BufferedReader e retornar um
	 * array de long.
	 * 
	 * Essa é uma forma mais performática de fazer a leitura, porém, por ser um
	 * array necessita contar os registros para criar o array do tamanho correto.
	 * 
	 * @author Nikolas Luiz Schmitt
	 *
	 */
	public long[] readNumbersFromFileWithBuffer() throws Exception {
		long[] numbers = null;
		BufferedReader reader1 = new BufferedReader(new FileReader(fileName));
		int count = 0;

		while ((reader1.readLine()) != null) {
			count++;
		}

		numbers = new long[count];

		reader1.close();

		BufferedReader reader2 = new BufferedReader(new FileReader(fileName));
		String line2;
		int index = 0;

		while ((line2 = reader2.readLine()) != null) {
			numbers[index] = Long.parseLong(line2);
			index++;
		}

		reader2.close();

		Arrays.sort(numbers);
		
		return numbers;
	}

	/**
	 * Método que faz a leitura do arquivo usando um BufferedReader e retornar uma
	 * lista de Long.
	 * 
	 * Essa seria uma das melhores (se não a melhor) formas de ler os números do arquivo,
	 * com essa forma fazemos apenas uma leitura e adicionamos os números na lista.
	 * 
	 * @author Nikolas Luiz Schmitt
	 *
	 */
	public List<Long> readNumbersFromFileWithBufferReturngList() throws Exception {
		List<Long> numbers = new ArrayList<>();

		BufferedReader reader = new BufferedReader(new FileReader(fileName));
		String line;
		while ((line = reader.readLine()) != null) {
			numbers.add(Long.parseLong(line));
		}

		reader.close();
		
		numbers.sort(null);
		
		return numbers;
	}
}
