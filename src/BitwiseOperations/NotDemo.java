package BitwiseOperations;

public class NotDemo {
    public static void main(String[] args) {
        byte b = -34;

        for (int t = 128; t > 0; t /= 2) {
            if ((b & t) != 0) System.out.print("1 ");
            else System.out.print("0 ");
        }

        System.out.println();

        // обратить состояние всех битов
        b = (byte) ~b;

        for (int i = 128; i > 0; i /= 2) {
            if ((b & i) != 0) System.out.print("1 ");
            else System.out.print("0 ");
        }
    }
}
