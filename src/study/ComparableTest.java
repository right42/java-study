package study;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableTest {

	public static void main(String[] args) {
		List<Student> studentList = new ArrayList<>();

		studentList.add(new Student(12));
		studentList.add(new Student(18));
		studentList.add(new Student(16));
		studentList.add(new Student(13));

		Collections.sort(studentList);

		System.out.println(studentList);
	}

	static class Student implements Comparable<Student> {

		private int age;

		public Student(int age) {
			this.age = age;
		}

		@Override
		public int compareTo(Student o) {
			return this.age - o.age;
		}

		@Override
		public String toString() {
			return "Student{" +
				"age=" + age +
				'}';
		}
	}
}
