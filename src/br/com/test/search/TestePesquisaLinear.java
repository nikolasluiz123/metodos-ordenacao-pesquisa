package br.com.test.search;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

import br.com.reader.FileBufferedReaderHelper;
import br.com.reader.FileReaderHelper;
import br.com.reader.FileScannerReaderHelper;
import br.com.search.LinearSearch;
import br.com.utils.DurationUtils;

public class TestePesquisaLinear {

	public static void main(String[] args) {
		System.out.println("----------------------------------------------------------");
		System.out.println("Iniciando Processamento de Pesquisas Lineares");
		System.out.println();

		linearSearchReadingWithScannerReturningArray();

		System.out.println();
		
		linearSearchReadingWithScannerReturningList();

		System.out.println();

		linearSearchReadingWithBufferReturningArray();

		System.out.println();

		linearSearchReadingWithBufferReturningList();
		
		System.out.println();
		
		convenientSearchReadingWithBufferReturningList();

		System.out.println();
		System.out.println("Finalizado Processamento de Pesquisas Lineares");
		System.out.println("----------------------------------------------------------");
	}

	/**
	 * Exemplo usando BufferedReader para ler o arquivo e trabalhando com array de
	 * longs.
	 * 
	 * @author Nikolas Luiz Schmitt
	 *
	 */
	private static void linearSearchReadingWithBufferReturningArray() {
		try {
			System.out.println("Iniciando o Processamento com BufferedReader e Array");
			System.out.println();

			String fileName = "src/NumerosOrdenarArquivo.txt";
			long searchValue = 30274553925L;

			FileReaderHelper reader = new FileBufferedReaderHelper(fileName);

			LocalDateTime dataInicio = LocalDateTime.now();

			long[] numbers = reader.readNumbersFromFileReturningArray();
			Arrays.sort(numbers);
			
			boolean achou = LinearSearch.search(numbers, searchValue);

			LocalDateTime dataFim = LocalDateTime.now();

			showResult(searchValue, achou);

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
	private static void linearSearchReadingWithBufferReturningList() {
		try {
			System.out.println("Iniciando o Processamento com BufferedReader e List");
			System.out.println();

			String fileName = "src/NumerosOrdenarArquivo.txt";
			long searchValue = 30274553925L;

			FileReaderHelper reader = new FileBufferedReaderHelper(fileName);

			LocalDateTime dataInicio = LocalDateTime.now();

			List<Long> numbers = reader.readNumbersFromFileReturningList();
			numbers.sort(null);
			
			boolean achou = LinearSearch.search(numbers, searchValue);

			LocalDateTime dataFim = LocalDateTime.now();

			showResult(searchValue, achou);

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
	private static void linearSearchReadingWithScannerReturningArray() {
		try {
			System.out.println("Iniciando o Processamento com Scanner e Array");
			System.out.println();

			String fileName = "src/NumerosOrdenarArquivo.txt";
			long searchValue = 30274553925L;

			FileReaderHelper reader = new FileScannerReaderHelper(fileName);

			LocalDateTime dataInicio = LocalDateTime.now();

			long[] numbers = reader.readNumbersFromFileReturningArray();
			Arrays.sort(numbers);

			boolean achou = LinearSearch.search(numbers, searchValue);

			LocalDateTime dataFim = LocalDateTime.now();

			showResult(searchValue, achou);

			System.out.println(DurationUtils.getDurationOf(dataInicio, dataFim));
			System.out.println();
			System.out.println("Finalizado o Processamento com Scanner e Array");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private static void linearSearchReadingWithScannerReturningList() {
		try {
			System.out.println("Iniciando o Processamento com Scanner e List");
			System.out.println();

			String fileName = "src/NumerosOrdenarArquivo.txt";
			long searchValue = 30274553925L;

			FileReaderHelper reader = new FileScannerReaderHelper(fileName);

			LocalDateTime dataInicio = LocalDateTime.now();

			List<Long> numbers = reader.readNumbersFromFileReturningList();
			numbers.sort(null);
			
			boolean achou = LinearSearch.search(numbers, searchValue);

			LocalDateTime dataFim = LocalDateTime.now();

			showResult(searchValue, achou);

			System.out.println(DurationUtils.getDurationOf(dataInicio, dataFim));
			System.out.println();
			System.out.println("Finalizado o Processamento com Scanner e List");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private static void convenientSearchReadingWithBufferReturningList() {
		try {
			System.out.println("Iniciando o Processamento com BufferedReader e List com Pesquisa Pronta");
			System.out.println();

			String fileName = "src/NumerosOrdenarArquivo.txt";
			long searchValue = 30274553925L;

			FileReaderHelper reader = new FileBufferedReaderHelper(fileName);

			LocalDateTime dataInicio = LocalDateTime.now();

			List<Long> numbers = reader.readNumbersFromFileReturningList();
			numbers.sort(null);
			
			boolean achou = LinearSearch.searchConvenient(numbers, searchValue);

			LocalDateTime dataFim = LocalDateTime.now();

			showResult(searchValue, achou);

			System.out.println(DurationUtils.getDurationOf(dataInicio, dataFim));
			System.out.println();
			System.out.println("Finalizado o Processamento com BufferedReader e List com Pesquisa Pronta");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static void showResult(long searchValue, boolean achou) {
		if (achou) {
			System.out.println("O valor " + searchValue + " foi encontrado.");
		} else {
			System.out.println("O valor " + searchValue + " nao foi encontrado.");
		}
	}

}