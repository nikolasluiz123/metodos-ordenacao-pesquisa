package br.com.test.search;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

import br.com.reader.FileBufferedReaderHelper;
import br.com.reader.FileReaderHelper;
import br.com.reader.FileScannerReaderHelper;
import br.com.search.BinaryRecursiveSearch;
import br.com.utils.DurationUtils;

public class TestePesquisaBinariaRecursiva {

	public static void main(String[] args) {
		System.out.println("----------------------------------------------------------");
		System.out.println("Iniciando Processamento de Pesquisas Binarias Recursivas");
		System.out.println();

		binaryRecursiveSearchReadingWithScannerReturningArray();

		System.out.println();
		
		binaryRecursiveSearchReadingWithScannerReturningList();

		System.out.println();

		binaryRecursiveSearchReadingWithBufferReturningArray();

		System.out.println();

		binaryRecursiveSearchReadingWithBufferReturningList();

		System.out.println();
		System.out.println("Finalizado Processamento de Pesquisas Binarias Recursivas");
		System.out.println("----------------------------------------------------------");
	}
	
	/**
	 * Exemplo usando Scanner para ler o arquivo e trabalhando com um array de longs
	 * pesquisando recursivamente
	 * 
	 * @author Nikolas Luiz Schmitt
	 *
	 */
	private static void binaryRecursiveSearchReadingWithScannerReturningArray() {
		try {
			System.out.println("Iniciando o Processamento com Scanner e Array");
			System.out.println();

			String fileName = "src/NumerosOrdenarArquivo.txt";
			long searchValue = 30274553925L;

			FileReaderHelper reader = new FileScannerReaderHelper(fileName);

			LocalDateTime dataInicio = LocalDateTime.now();

			long[] numbers = reader.readNumbersFromFileReturningArray();
			Arrays.sort(numbers);
			
			int index = BinaryRecursiveSearch.search(numbers, searchValue, 0, numbers.length - 1);

			LocalDateTime dataFim = LocalDateTime.now();

			showResult(searchValue, index);

			System.out.println(DurationUtils.getDurationOf(dataInicio, dataFim));
			System.out.println();
			System.out.println("Finalizado o Processamento com Scanner e Array");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * Exemplo usando Scanner para ler o arquivo e trabalhando com uma lista de longs
	 * pesquisando recursivamente
	 * 
	 * @author Nikolas Luiz Schmitt
	 *
	 */
	private static void binaryRecursiveSearchReadingWithScannerReturningList() {
		try {
			System.out.println("Iniciando o Processamento com Scanner e List");
			System.out.println();

			String fileName = "src/NumerosOrdenarArquivo.txt";
			long searchValue = 30274553925L;

			FileReaderHelper reader = new FileScannerReaderHelper(fileName);

			LocalDateTime dataInicio = LocalDateTime.now();

			List<Long> numbers = reader.readNumbersFromFileReturningList();
			numbers.sort(null);
			
			int index = BinaryRecursiveSearch.search(numbers, searchValue, 0, numbers.size() - 1);

			LocalDateTime dataFim = LocalDateTime.now();

			showResult(searchValue, index);

			System.out.println(DurationUtils.getDurationOf(dataInicio, dataFim));
			System.out.println();
			System.out.println("Finalizado o Processamento com Scanner e List");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Exemplo usando BufferedReader para ler o arquivo e trabalhando com uma Lista
	 * de Longs pesquisando recursivamente
	 * 
	 * @author Nikolas Luiz Schmitt
	 *
	 */
	private static void binaryRecursiveSearchReadingWithBufferReturningList() {
		try {
			System.out.println("Iniciando o Processamento com BufferedReader e List");
			System.out.println();

			String fileName = "src/NumerosOrdenarArquivo.txt";
			long searchValue = 30274553925L;

			FileReaderHelper reader = new FileBufferedReaderHelper(fileName);

			LocalDateTime dataInicio = LocalDateTime.now();

			List<Long> numbers = reader.readNumbersFromFileReturningList();
			numbers.sort(null);
			
			int index = BinaryRecursiveSearch.search(numbers, searchValue, 0, numbers.size() - 1);

			LocalDateTime dataFim = LocalDateTime.now();

			showResult(searchValue, index);

			System.out.println(DurationUtils.getDurationOf(dataInicio, dataFim));
			System.out.println();
			System.out.println("Finalizado o Processamento com BufferedReader e List");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	/**
	 * Exemplo usando BufferedReader para ler o arquivo e trabalhando com array de
	 * longs pesquisando recursivamente
	 * 
	 * @author Nikolas Luiz Schmitt
	 *
	 */
	private static void binaryRecursiveSearchReadingWithBufferReturningArray() {
		try {
			System.out.println("Iniciando o Processamento com BufferedReader e Array");
			System.out.println();

			String fileName = "src/NumerosOrdenarArquivo.txt";
			long searchValue = 30274553925L;

			FileReaderHelper reader = new FileBufferedReaderHelper(fileName);

			LocalDateTime dataInicio = LocalDateTime.now();

			long[] numbers = reader.readNumbersFromFileReturningArray();
			Arrays.sort(numbers);
			
			int index = BinaryRecursiveSearch.search(numbers, searchValue, 0, numbers.length - 1);

			LocalDateTime dataFim = LocalDateTime.now();

			showResult(searchValue, index);

			System.out.println(DurationUtils.getDurationOf(dataInicio, dataFim));
			System.out.println();
			System.out.println("Finalizado o Processamento com BufferedReader e Array");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	private static void showResult(long searchValue, int index) {
		if (index != -1) {
			System.out.println("O valor " + searchValue + " foi encontrado no indice " + index + ".");
		} else {
			System.out.println("O valor " + searchValue + " nao foi encontrado.");
		}
	}

}