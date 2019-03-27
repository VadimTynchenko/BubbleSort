package Unit5.ForEach;

public class ForEach {
    public static void main(String[] args) {
        int[] num = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum = 0;

        // Использовать разновидность for-each цикла for
        // для суммирования и отображения значений
        for (int x : num) {
            System.out.println("Значение х = " + x);
            sum += x;
        }

        System.out.println("Сумма = " + sum + "\n");

        // использование прерывания цикла с помощью brake

        sum = 0;
        for (int x :
                num) {
            System.out.println("Значение х = " + x);
            sum += x;
            if (x == 5) break;
        }

        System.out.println("Сумма = " + sum);
    }

}
