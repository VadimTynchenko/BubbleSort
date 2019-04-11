package Unit9.Try_Catch;

// Демонстрация обработки исключений
public class ExcDemo1 {
    public static void main(String[] args) {
        int[] num = new int[4];

        try {
            System.out.println("До генерации исключения.");

            num[7] = 10;
            System.out.println("Эта строка не будет отоброжаться.");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Выход за пределы массива");
            System.out.println("\n" + e.getMessage());
        }

        System.out.println("\nПосле выхода из блока catch");
    }
}
