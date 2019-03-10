package controller.utils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

public class StreamConverter {
	public static String inputStreamString(InputStream inputStream) throws IOException {

		StringBuilder stringBuilder = new StringBuilder();
		String line = null;

		try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, StandardCharsets.UTF_8))) {
			while ((line = bufferedReader.readLine()) != null) {
				stringBuilder.append(line);
			}
		}

		return stringBuilder.toString();
	}
}