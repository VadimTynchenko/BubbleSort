package Unit5.TernaryOperator;

public class NoZeroDiv {
    public static void main(String[] args) {
        int result;

        for (int i = -5; i < 6; i++) {
            // деление на ноль запрещается
            result = i != 0 ? 100 / i : 0;
            if (i != 0) {
                System.out.println("100 / " + i + " равно " + result);
            }

        }
    }
}
