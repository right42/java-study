package study;

import java.util.Optional;
import java.util.OptionalInt;

public class OptionalTest {

	public static void main(String[] args) {
		String str = "123";
		Optional<String> value = Optional.ofNullable(str);

		value.orElse("123");
		String s = value.orElseGet(() -> "test");

		OptionalInt optionalInt = OptionalInt.of(1);
		System.out.println(optionalInt.isPresent());
	}
}
