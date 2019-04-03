package Unit6.VarArgs;
// Использование массива агрументов переменной длины
// на ряду с использованием обычных аргументов.
public class VarArgs2 {

    // Здесь msg - обычный параметр,
    // а v - массив параметров переменной длины
    private static void vaTest(String msg, int... v) {
        System.out.println(msg + v.length);
        System.out.println("Содержимое: ");

        for (int i = 0; i < v.length; i++) {
            System.out.println(" args " + i + ": " + v[i]);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        vaTest("Один аргумент в массиве: ", 10);
        vaTest("Два агрумента в массиве: ", 10, 50);
        vaTest("Без аргументов в массиве: ");
    }
}
