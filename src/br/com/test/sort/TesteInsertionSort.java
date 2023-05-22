package br.com.test.sort;

import java.time.LocalDateTime;
import java.util.List;

import br.com.reader.FileBufferedReaderHelper;
import br.com.reader.FileReaderHelper;
import br.com.reader.FileScannerReaderHelper;
import br.com.sort.InsertionOrder;
import br.com.utils.DurationUtils;

public class TesteInsertionSort {

	public static void main(String[] args) {
		System.out.println("----------------------------------------------------------");
		System.out.println("Iniciando Processamento de Ordenacoes por Insercao");
		System.out.println();

		insertionSortWithScannerReturningArray();

		System.out.println();
		
		insertionSortWithScannerReturningList();

		System.out.println();
		
		insertionSortWithBufferReturningArray();

//		Preciso descobrir o motivo de estar 'travando'
//		System.out.println();
//		
//		insertionSortWithBufferReturningList();

		System.out.println();
		System.out.println("Finalizado Processamento de Ordenacoes por Insercao");
		System.out.println("----------------------------------------------------------");
	}

	public static void insertionSortWithScannerReturningArray() {
		try {
			System.out.println("Iniciando o Processamento com Scanner e Array");
			System.out.println();

			String fileName = "src/NumerosOrdenarArquivo.txt";

			FileReaderHelper reader = new FileScannerReaderHelper(fileName);

			LocalDateTime dataInicio = LocalDateTime.now();

			long[] numbers = reader.readNumbersFromFileReturningArray();
			InsertionOrder.order(numbers);
			
			LocalDateTime dataFim = LocalDateTime.now();
			
			System.out.println(DurationUtils.getDurationOf(dataInicio, dataFim));
			System.out.println();
			System.out.println("Finalizado o Processamento com Scanner e Array");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void insertionSortWithScannerReturningList() {
		try {
			System.out.println("Iniciando o Processamento com Scanner e List");
			System.out.println();

			String fileName = "src/NumerosOrdenarArquivo.txt";

			FileReaderHelper reader = new FileScannerReaderHelper(fileName);

			LocalDateTime dataInicio = LocalDateTime.now();

			List<Long> numbers = reader.readNumbersFromFileReturningList();
			InsertionOrder.order(numbers);
			
			LocalDateTime dataFim = LocalDateTime.now();
			
			System.out.println(DurationUtils.getDurationOf(dataInicio, dataFim));
			System.out.println();
			System.out.println("Finalizado o Processamento com Scanner e List");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void insertionSortWithBufferReturningArray() {
		try {
			System.out.println("Iniciando o Processamento com BufferedReader e Array");
			System.out.println();

			String fileName = "src/NumerosOrdenarArquivo.txt";

			FileReaderHelper reader = new FileBufferedReaderHelper(fileName);

			LocalDateTime dataInicio = LocalDateTime.now();

			long[] numbers = reader.readNumbersFromFileReturningArray();
			InsertionOrder.order(numbers);
			
			LocalDateTime dataFim = LocalDateTime.now();
			
			System.out.println(DurationUtils.getDurationOf(dataInicio, dataFim));
			System.out.println();
			System.out.println("Finalizado o Processamento com BufferedReader e Array");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void insertionSortWithBufferReturningList() {
		try {
			System.out.println("Iniciando o Processamento com BufferedReader e List");
			System.out.println();

			String fileName = "src/NumerosOrdenarArquivo.txt";

			FileReaderHelper reader = new FileBufferedReaderHelper(fileName);

			LocalDateTime dataInicio = LocalDateTime.now();

			List<Long> numbers = reader.readNumbersFromFileReturningList();
			InsertionOrder.order(numbers);
			
			LocalDateTime dataFim = LocalDateTime.now();
			
			System.out.println(DurationUtils.getDurationOf(dataInicio, dataFim));
			System.out.println();
			System.out.println("Finalizado o Processamento com BufferedReader e List");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
