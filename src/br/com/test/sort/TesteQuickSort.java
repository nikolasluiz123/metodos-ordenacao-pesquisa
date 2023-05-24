package br.com.test.sort;

import java.time.LocalDateTime;
import java.util.List;

import br.com.reader.FileBufferedReaderHelper;
import br.com.reader.FileReaderHelper;
import br.com.reader.FileScannerReaderHelper;
import br.com.sort.QuickSort;
import br.com.utils.DurationUtils;

public class TesteQuickSort {

	public static void main(String[] args) {
		System.out.println("----------------------------------------------------------");
		System.out.println("Iniciando Processamento de Ordenacoes Rapidas");
		System.out.println();

		quickSortWithScannerReturningArray();

		System.out.println();
		
		quickSortWithScannerReturningList();

		System.out.println();

		quickSortWithBufferReturningArray();

		System.out.println();

		quickSortWithBufferReturningList();

		System.out.println();
		System.out.println("Finalizado Processamento de Ordenacoes Rapidas");
		System.out.println("----------------------------------------------------------");
	}

	public static void quickSortWithScannerReturningArray() {
		try {
			System.out.println("Iniciando o Processamento com Scanner e Array");
			System.out.println();

			String fileName = "src/NumerosOrdenarArquivo.txt";

			FileReaderHelper reader = new FileScannerReaderHelper(fileName);

			LocalDateTime dataInicio = LocalDateTime.now();

			long[] numbers = reader.readNumbersFromFileReturningArray();
			QuickSort.sort(numbers);

			LocalDateTime dataFim = LocalDateTime.now();

			System.out.println(DurationUtils.getDurationOf(dataInicio, dataFim));
			System.out.println();
			System.out.println("Finalizado o Processamento com Scanner e Array");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void quickSortWithScannerReturningList() {
		try {
			System.out.println("Iniciando o Processamento com Scanner e List");
			System.out.println();

			String fileName = "src/NumerosOrdenarArquivo.txt";

			FileReaderHelper reader = new FileScannerReaderHelper(fileName);

			LocalDateTime dataInicio = LocalDateTime.now();

			List<Long> numbers = reader.readNumbersFromFileReturningList();
			QuickSort.sort(numbers);

			LocalDateTime dataFim = LocalDateTime.now();

			System.out.println(DurationUtils.getDurationOf(dataInicio, dataFim));
			System.out.println();
			System.out.println("Finalizado o Processamento com Scanner e List");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void quickSortWithBufferReturningArray() {
		try {
			System.out.println("Iniciando o Processamento com BufferedReader e Array");
			System.out.println();

			String fileName = "src/NumerosOrdenarArquivo.txt";

			FileReaderHelper reader = new FileBufferedReaderHelper(fileName);

			LocalDateTime dataInicio = LocalDateTime.now();

			long[] numbers = reader.readNumbersFromFileReturningArray();
			QuickSort.sort(numbers);

			LocalDateTime dataFim = LocalDateTime.now();

			System.out.println(DurationUtils.getDurationOf(dataInicio, dataFim));
			System.out.println();
			System.out.println("Finalizado o Processamento com BufferedReader e Array");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void quickSortWithBufferReturningList() {
		try {
			System.out.println("Iniciando o Processamento com BufferedReader e List");
			System.out.println();

			String fileName = "src/NumerosOrdenarArquivo.txt";

			FileReaderHelper reader = new FileBufferedReaderHelper(fileName);

			LocalDateTime dataInicio = LocalDateTime.now();

			List<Long> numbers = reader.readNumbersFromFileReturningList();
			QuickSort.sort(numbers);

			LocalDateTime dataFim = LocalDateTime.now();

			System.out.println(DurationUtils.getDurationOf(dataInicio, dataFim));
			System.out.println();
			System.out.println("Finalizado o Processamento com BufferedReader e List");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
