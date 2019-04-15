package Unit9.Try_Catch;

// Применение нескольких операторов catch
public class ExcDemo4 {
    public static void main(String[] args) {
        int[] number = {2, 4, 8, 16, 32, 64, 128, 256};
        int[] denom = {2, 0, 4, 4, 0, 8};

        for (int i = 0; i < number.length; i++) {
            try {
                System.out.println(number[i] + " / " + denom[i] +
                        "равно " + number[i] / denom[i]);
            } catch (ArithmeticException e) {
                // Перехватить исключение
                System.out.println("Попытка деления на ноль!");
            } catch (IndexOutOfBoundsException e) {
                // Перехватить исключение
                System.out.println("Соответствующий элемент не найден");
            }
        }
    }
}
