package study;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class GenericTest {

	public static void main(String[] args) {
		GenericType<String> genericTest = new GenericType<>();
		genericTest.setObj("123");

		List<Car> list = new ArrayList<>();
		list.add(new Bus());
		GenericTest.bounded(list, new Bus());
	}

	public static <T extends Car> void bounded(List<T> target, T subtype) {
		T t = target.get(0);
		t.move();
	}

	static class Car {
		public void move(){
			System.out.println("car move");
		}
	}

	static class Bus extends Car{

	}

	static class GenericType<T> {
		T obj;

		public void setObj(T obj) {
			this.obj = obj;
		}

		public T getObj() {
			return obj;
		}
	}
}
