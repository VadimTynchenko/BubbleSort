package Lesson5;

public class First {
    public static void main(String[] args) {
        double[] num = new double[12];

        for (int i = 0; i < num.length; i++) {
            num[i] = i;
        }

        for (double res : num) {
            System.out.print(res + " ");
        }

        System.out.println();

        double[] num2 = {1.1, 1.2, 1.3, 1.4, 1.5, 1.6, 1.7, 1.8, 1.9, 2.0, 2.1, 2.2};

        for (double res :
                num2) {
            System.out.print(res + " ");
        }
    }
}
