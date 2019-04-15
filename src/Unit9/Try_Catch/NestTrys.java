package Unit9.Try_Catch;

// Использование вложенных блоков try
public class NestTrys {
    public static void main(String[] args) {
        int[] number = {2, 4, 8, 16, 32, 64, 128, 256, 512};
        int[] denom = {2, 0, 4, 4, 0, 8};

        try { // внешний блок try
            for (int i = 0; i < number.length; i++) {
                try { // вложенный блок try
                    System.out.println(number[i] + " / " + denom[i] +
                            "равно " + number[i] / denom[i]);
                } catch (ArithmeticException e) {
                    // Перехватить исключение
                    System.out.println("Попытка деления на ноль!");
                }
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            // Перехватить исключение
            System.out.println("Соответствующий элемент не найден!");
            System.out.println("Фатальная ошибка - выполнение программы прервано!");
        }
    }
}
