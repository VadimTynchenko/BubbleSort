package Unit5.ForEach;

public class NoChange {
    public static void main(String[] args) {
        int[] num = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        for (int i :
                num) {
            System.out.print(i + " ");
            i = i * 10;     // эта операция не изменяет массив num,
                            // то есть for-each нужен только для чтения
        }

        System.out.println();

        for (int x :
                num) {
            System.out.print(x + " ");
        }
        System.out.println();
    }
    // в первом цикле знаение итерационной переменной  i умножается на 10,
    // но это никак не влияет на массив num
}
