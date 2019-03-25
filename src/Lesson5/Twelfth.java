package Lesson5;

public class Twelfth {
    public static void main(String[] args) {
        int i = 5;
        System.out.println(i);

            for (int k = 128; k > 0; k /= 2) {
                if ((i & k) != 0) System.out.print("1 ");
                else System.out.print("0 ");
        }
        System.out.println();

        i >>>= 2; // операция сдвига вправо без сдвига
        System.out.println(i);

            for (int k = 128; k > 0; k /= 2) {
                if ((i & k) != 0) System.out.print("1 ");
                else System.out.print("0 ");

        }
    }
}
