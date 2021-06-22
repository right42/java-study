package study;

import java.math.BigDecimal;

public class BigDecimalTest {

	public static void main(String[] args) {

		BigDecimal bigDecimal = new BigDecimal("2.5");
		BigDecimal bigDecimal2 = new BigDecimal("2");
		BigDecimal bigDecimal3 = new BigDecimal("212312312312312414515125123123124124123123123412431.1234");

		System.out.println(bigDecimal.toString());
		System.out.println(bigDecimal2.toString());
		System.out.println(bigDecimal3.toString());
	}
}
