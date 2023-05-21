package br.com;

import java.time.LocalDateTime;
import java.util.List;

import br.com.reader.FileReaderHelper;
import br.com.search.BinarySearch;

public class TestePesquisaBinaria {

	public static void main(String[] args) {
		binarySearchReadingWithBufferReturningList();
		
		System.out.println();
		
		binarySearchReadingWithBufferReturningArray();
		
		System.out.println();
		
		binarySearchReadingWithScannerReturningArray();
	}
	
	/**
	 * Exemplo usando BufferedReader para ler o arquivo e trabalhando
	 * com uma Lista de Longs
	 * 
	 * @author Nikolas Luiz Schmitt
	 *
	 */
	private static void binarySearchReadingWithBufferReturningList() {
		try {
			System.out.println("----------------------------------------------------------");
			System.out.println("Iniciando Processamento com BufferedReader e List");
			System.out.println();
			
			String fileName = "src/NumerosOrdenarArquivo.txt";
			long searchValue = 30274553925L;

			FileReaderHelper reader = new FileReaderHelper(fileName);

			LocalDateTime dataInicio = LocalDateTime.now();
			
			List<Long> numbers = reader.readNumbersFromFileWithBufferReturngList();

			int index = BinarySearch.binarySearch(numbers, searchValue);

			LocalDateTime dataFim = LocalDateTime.now();

			showResult(searchValue, index);

			System.out.println(DurationUtils.getDurationOf(dataInicio, dataFim));
			System.out.println();
			System.out.println("Finalizado o Processamento com BufferedReader e List");
			System.out.println("----------------------------------------------------------");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * Exemplo usando BufferedReader para ler o arquivo e trabalhando com
	 * array de longs.
	 * 
	 * @author Nikolas Luiz Schmitt
	 *
	 */
	private static void binarySearchReadingWithBufferReturningArray() {
		try {
			System.out.println("----------------------------------------------------------");
			System.out.println("Iniciando Processamento com BufferedReader e Array");
			System.out.println();
			
			String fileName = "src/NumerosOrdenarArquivo.txt";
			long searchValue = 30274553925L;

			FileReaderHelper reader = new FileReaderHelper(fileName);

			LocalDateTime dataInicio = LocalDateTime.now();
			
			long[] numbers = reader.readNumbersFromFileWithBuffer();

			int index = BinarySearch.binarySearch(numbers, searchValue);

			LocalDateTime dataFim = LocalDateTime.now();

			showResult(searchValue, index);

			System.out.println(DurationUtils.getDurationOf(dataInicio, dataFim));
			System.out.println();
			System.out.println("Finalizado o Processamento com BufferedReader e Array");
			System.out.println("----------------------------------------------------------");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * Exemplo usando Scanner para ler o arquivo e trabalhando com um
	 * array de longs
	 * 
	 * @author Nikolas Luiz Schmitt
	 *
	 */
	private static void binarySearchReadingWithScannerReturningArray() {
		try {
			System.out.println("----------------------------------------------------------");
			System.out.println("Iniciando Processamento com Scanner e Array");
			System.out.println();
			
			String fileName = "src/NumerosOrdenarArquivo.txt";
			long searchValue = 30274553925L;

			FileReaderHelper reader = new FileReaderHelper(fileName);

			LocalDateTime dataInicio = LocalDateTime.now();
			
			long[] numbers = reader.readNumbersFromFile();

			int index = BinarySearch.binarySearch(numbers, searchValue);

			LocalDateTime dataFim = LocalDateTime.now();

			showResult(searchValue, index);

			System.out.println(DurationUtils.getDurationOf(dataInicio, dataFim));
			System.out.println();
			System.out.println("Finalizado o Processamento com Scanner e Array");
			System.out.println("----------------------------------------------------------");
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