package Unit5.ForEach;

// использование расширенного цикла for
// для обработки двумерного массива

public class ForEach2 {
    public static void main(String[] args) {
        int sum = 0;
        int[][] num = new int[3][5];

        // ввести ряд значений в массив num
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                num[i][j] = (i + 1) * (j + 1);
            }
        }

        // Использовать разновидность for-each цикла for
        // для суммирования и отображения значений.
        // Обратить внимание на объявление переменной х
        for (int[] x :
                num) {
            for (int y :
                    x) {
                System.out.println("Значение = " + y);
                sum += y;
            }
        }

        System.out.println("Сумма = " + sum);
    }
}
