package study;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

public class CollectionsTest {

	public static void main(String[] args) {
		// List<String> strs = new ArrayList<>();
		// strs.add("12");
		// strs.add("123");
		// strs.add("124");
		// strs.add("125");
		// strs.remove("12");
		//
		Set<String> sets = new HashSet<>();
		sets.add("123");
		sets.add("1234");

		Map<TestDto, Integer> map = new HashMap<>();
		map.put(new TestDto("123"), 123);
		map.put(new TestDto("1234"), 123);
		map.put(new TestDto("12345"), 123);

		map.get(new TestDto("12345"));

		// List<String> list = new LinkedList<>();
		// list.add("123");
		// list.add("1234");
	}

	static class TestDto{
		private final String name;

		public TestDto(String name) {
			this.name = name;
		}

		@Override
		public boolean equals(Object o) {
			if (this == o)
				return true;
			if (o == null || getClass() != o.getClass())
				return false;
			TestDto testDto = (TestDto)o;
			return Objects.equals(name, testDto.name);
		}

		@Override
		public int hashCode() {
			return 123456;
		}
	}
}
