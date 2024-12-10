import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;


class FindKthDigitTest {
	private String readFile(String filePath) throws IOException {
		return new String(Files.readAllBytes(Paths.get(filePath)));
	}

	private static Stream<Object[]> testCases() throws IOException {
		String testCasesDir = "src/test/cses_testfiles/";

		return Files.list(Paths.get(testCasesDir))
				.filter(path -> path.toString().endsWith(".in"))
				.map(path -> new Object[]{path.toString(), path.toString().replace(".in", ".out")})
				.filter(pair -> Files.exists(Paths.get(pair[1].toString())))
				.toList()
				.stream();
	}

	@ParameterizedTest(name = "Test {index}: {0}")
	@MethodSource("testCases")
	void testFromFiles(String inputFile, String outputFile) throws IOException {
		String input = readFile(inputFile);
		String expectedOutput = readFile(outputFile).trim();

		String[] inputLines = input.split("\n");
		int q = Integer.parseInt(inputLines[0]);

		StringBuilder actualOutput = new StringBuilder();
		for (int i = 1; i <= q; i++) {
			long k = Long.parseLong(inputLines[i]);
			actualOutput.append(FindKthDigit.findKthDigit(k)).append("\n");
		}

		assertEquals(expectedOutput, actualOutput.toString().trim());
	}

}