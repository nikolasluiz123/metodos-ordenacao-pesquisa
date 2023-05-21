package br.com.reader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FileBufferedReaderHelper extends FileReaderHelper {

	public FileBufferedReaderHelper(String fileName) {
		super(fileName);
	}

	@Override
	public List<Long> readNumbersFromFileReturningList() throws Exception {
		List<Long> numbers = new ArrayList<>();

		BufferedReader reader = new BufferedReader(new FileReader(getFileName()));
		String line;
		while ((line = reader.readLine()) != null) {
			numbers.add(Long.parseLong(line));
		}

		reader.close();

		numbers.sort(null);

		return numbers;
	}

	@Override
	public long[] readNumbersFromFileReturningArray() throws Exception {
		long[] numbers = null;
		BufferedReader reader1 = new BufferedReader(new FileReader(getFileName()));
		int count = 0;

		while ((reader1.readLine()) != null) {
			count++;
		}

		numbers = new long[count];

		reader1.close();

		BufferedReader reader2 = new BufferedReader(new FileReader(getFileName()));
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

}
