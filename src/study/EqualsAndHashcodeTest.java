package study;

import java.util.Map;
import java.util.Objects;

public class EqualsAndHashcodeTest {

	public static void main(String[] args) {
		User user1 = new User("test", 23);
		User user2 = new User("test", 23);

		System.out.println(user1.equals(user2));

		System.out.println(user1);
		System.out.println(user2);
		// Map<User, String> userMaps = Map.of(user1, "test", user2, "test2");
		// System.out.println(userMaps);
	}

	static class User {
		private String name;

		private int age;

		public User(String name, int age) {
			this.name = name;
			this.age = age;
		}

		@Override
		public boolean equals(Object o) {
			if (this == o)
				return true;
			if (o == null || getClass() != o.getClass())
				return false;
			User user = (User)o;
			return age == user.age && Objects.equals(name, user.name);
		}

		@Override
		public int hashCode() {
			return Objects.hash(name, age);
		}
	}

}
