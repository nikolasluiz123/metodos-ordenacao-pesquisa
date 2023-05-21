package br.com.reader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
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

		return numbers;
	}

	@Override
	public long[] readNumbersFromFileReturningArray() throws Exception {
		long[] numbers = null;
		BufferedReader reader = new BufferedReader(new FileReader(getFileName()));
		int count = 0;

		while ((reader.readLine()) != null) {
			count++;
		}

		numbers = new long[count];

		String line;
		int index = 0;

		while ((line = reader.readLine()) != null) {
			numbers[index] = Long.parseLong(line);
			index++;
		}

		reader.close();

		return numbers;
	}

}
