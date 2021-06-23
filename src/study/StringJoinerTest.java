package study;

import java.util.StringJoiner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StringJoinerTest {

	public static void main(String[] args) {
		StringJoiner stringJoiner = new StringJoiner(", ", "[", "]");

		for (int i = 0; i < 5; i++) {
			stringJoiner.add(String.valueOf(i));
		}

		System.out.println(stringJoiner);

		String join = Stream.of(1, 2, 3, 4, 5)
			.map(String::valueOf)
			.collect(Collectors.joining(","));

		System.out.println(join);
	}
}
