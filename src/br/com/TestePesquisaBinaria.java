package br.com;

import java.time.LocalDateTime;
import java.util.List;

import br.com.reader.FileBufferedReaderHelper;
import br.com.reader.FileReaderHelper;
import br.com.reader.FileScannerReaderHelper;
import br.com.search.BinaryInteractiveSearch;

public class TestePesquisaBinaria {

	public static void main(String[] args) {
		System.out.println("----------------------------------------------------------");
		System.out.println("Iniciando Processamento de Pesquisas Binarias");
		System.out.println();

		binarySearchReadingWithScannerReturningArray();

		System.out.println();
		
		binarySearchReadingWithScannerReturningList();

		System.out.println();
		
		binarySearchReadingWithBufferReturningArray();

		System.out.println();
		
		binarySearchReadingWithBufferReturningList();

		System.out.println();
		System.out.println("Finalizado Processamento de Pesquisas Binarias");
		System.out.println("----------------------------------------------------------");
	}

	/**
	 * Exemplo usando BufferedReader para ler o arquivo e trabalhando com array de
	 * longs.
	 * 
	 * @author Nikolas Luiz Schmitt
	 *
	 */
	private static void binarySearchReadingWithBufferReturningArray() {
		try {
			System.out.println("Iniciando o Processamento com BufferedReader e Array");
			System.out.println();

			String fileName = "src/NumerosOrdenarArquivo.txt";
			long searchValue = 30274553925L;

			FileReaderHelper reader = new FileBufferedReaderHelper(fileName);

			LocalDateTime dataInicio = LocalDateTime.now();

			long[] numbers = reader.readNumbersFromFileReturningArray();

			int index = BinaryInteractiveSearch.search(numbers, searchValue);

			LocalDateTime dataFim = LocalDateTime.now();

			showResult(searchValue, index);

			System.out.println(DurationUtils.getDurationOf(dataInicio, dataFim));
			System.out.println();
			System.out.println("Finalizado o Processamento com BufferedReader e Array");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * Exemplo usando BufferedReader para ler o arquivo e trabalhando com uma Lista
	 * de Longs
	 * 
	 * @author Nikolas Luiz Schmitt
	 *
	 */
	private static void binarySearchReadingWithBufferReturningList() {
		try {
			System.out.println("Iniciando o Processamento com BufferedReader e List");
			System.out.println();

			String fileName = "src/NumerosOrdenarArquivo.txt";
			long searchValue = 30274553925L;

			FileReaderHelper reader = new FileBufferedReaderHelper(fileName);

			LocalDateTime dataInicio = LocalDateTime.now();

			List<Long> numbers = reader.readNumbersFromFileReturningList();

			int index = BinaryInteractiveSearch.search(numbers, searchValue);

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
	 * Exemplo usando Scanner para ler o arquivo e trabalhando com um array de longs
	 * 
	 * @author Nikolas Luiz Schmitt
	 *
	 */
	private static void binarySearchReadingWithScannerReturningArray() {
		try {
			System.out.println("Iniciando o Processamento com Scanner e Array");
			System.out.println();

			String fileName = "src/NumerosOrdenarArquivo.txt";
			long searchValue = 30274553925L;

			FileReaderHelper reader = new FileScannerReaderHelper(fileName);

			LocalDateTime dataInicio = LocalDateTime.now();

			long[] numbers = reader.readNumbersFromFileReturningArray();

			int index = BinaryInteractiveSearch.search(numbers, searchValue);

			LocalDateTime dataFim = LocalDateTime.now();

			showResult(searchValue, index);

			System.out.println(DurationUtils.getDurationOf(dataInicio, dataFim));
			System.out.println();
			System.out.println("Finalizado o Processamento com Scanner e Array");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private static void binarySearchReadingWithScannerReturningList() {
		try {
			System.out.println("Iniciando o Processamento com Scanner e List");
			System.out.println();

			String fileName = "src/NumerosOrdenarArquivo.txt";
			long searchValue = 30274553925L;

			FileReaderHelper reader = new FileScannerReaderHelper(fileName);

			LocalDateTime dataInicio = LocalDateTime.now();

			List<Long> numbers = reader.readNumbersFromFileReturningList();

			int index = BinaryInteractiveSearch.search(numbers, searchValue);

			LocalDateTime dataFim = LocalDateTime.now();

			showResult(searchValue, index);

			System.out.println(DurationUtils.getDurationOf(dataInicio, dataFim));
			System.out.println();
			System.out.println("Finalizado o Processamento com Scanner e List");
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