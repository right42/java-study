package study;

public class Main {
    public static void main(String[] args) {
        Integer a = Integer.valueOf(128);
        Integer b = Integer.valueOf(128);

        // over cache
        System.out.println(a == b);
        System.out.println(a.equals(b));

        new StringBuffer("12").append("1");
        new StringBuilder("12").append("1").append("2");
    }
}
