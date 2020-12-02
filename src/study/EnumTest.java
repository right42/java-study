package study;

public class EnumTest {

    public static void main(String[] args) {

        System.out.println(Operation.PLUS.calc(1, 2));
    }

    private enum Operation {
        PLUS("+") {
            @Override
            public int calc(int a, int b) {
                return a + b;
            }
        },
        MINUS("-") {
            @Override
            public int calc(int a, int b) {
                return a - b;
            }
        };

        private final String operation;

        Operation(String operation) {
            this.operation = operation;
        }

        public abstract int calc(int a, int b);
    }
}
