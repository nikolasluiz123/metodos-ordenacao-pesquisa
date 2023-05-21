package br.com.reader;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class FileScannerReaderHelper extends FileReaderHelper {

	public FileScannerReaderHelper(String fileName) {
		super(fileName);
	}

	@Override
	public List<Long> readNumbersFromFileReturningList() throws Exception {
		List<Long> numbers = new ArrayList<>();
		
		File file = new File(getFileName());
		Scanner scanner = new Scanner(file);
		
		while (scanner.hasNextLong()) {
			numbers.add(scanner.nextLong());
		}
		
		scanner.close();
		
		numbers.sort(null);
		
		return numbers;
	}

	@Override
	public long[] readNumbersFromFileReturningArray() throws Exception {
		long[] numbers = null;

		File file = new File(getFileName());
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

}
