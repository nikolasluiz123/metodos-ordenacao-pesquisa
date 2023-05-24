package br.com.test.sort;

import java.time.LocalDateTime;

import br.com.reader.FileBufferedReaderHelper;
import br.com.reader.FileReaderHelper;
import br.com.reader.FileScannerReaderHelper;
import br.com.sort.InsertionSort;
import br.com.utils.DurationUtils;

public class TesteInsertionSort {

	public static void main(String[] args) {
		System.out.println("----------------------------------------------------------");
		System.out.println("Iniciando Processamento de Ordenacoes por Insercao");
		System.out.println();

		insertionSortWithScannerReturningArray();

		System.out.println();
		
		insertionSortWithBufferReturningArray();

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
			InsertionSort.sort(numbers);
			
			LocalDateTime dataFim = LocalDateTime.now();
			
			System.out.println(DurationUtils.getDurationOf(dataInicio, dataFim));
			System.out.println();
			System.out.println("Finalizado o Processamento com Scanner e Array");
			
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
			InsertionSort.sort(numbers);
			
			LocalDateTime dataFim = LocalDateTime.now();
			
			System.out.println(DurationUtils.getDurationOf(dataInicio, dataFim));
			System.out.println();
			System.out.println("Finalizado o Processamento com BufferedReader e Array");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
