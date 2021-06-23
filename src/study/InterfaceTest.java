package study;

import java.util.Collection;
import java.util.Collections;

public class InterfaceTest {

	interface TestInterface{
		void test();

		default void print(){
			privateMethod();
		}

		private void privateMethod(){
			System.out.println("private Method call");
		}

		private static void privateStaticMethod(){
			System.out.println("private static method");
		}

		static void staticMethod(){
			System.out.println("static Method call");
			privateStaticMethod();
		}
	}

	public static void main(String[] args) {
		TestInterface testInterface = () -> System.out.println("테스트");

		testInterface.test();
		testInterface.print();
		TestInterface.staticMethod();
	}
}
