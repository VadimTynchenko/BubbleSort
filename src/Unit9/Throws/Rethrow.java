package Unit9.Throws;

// Повторное генерирование исключений
class Rethrow {
    static void genException() {
        int[] number = {2, 4, 8, 16, 32, 64, 128, 256, 512};
        int[] denom = {2, 0, 4, 4, 0, 8};

        for (int i = 0; i < number.length; i++) {
            try {
                System.out.println(number[i] + " / " + denom[i] +
                        "равно " + number[i] / denom[i]);
            } catch (ArithmeticException e) {
                // Перехватить исключение
                System.out.println("Попытка деления на ноль!");
            } catch (ArrayIndexOutOfBoundsException e) {
                // Перехватить исключение
                System.out.println("Соответствующий элемент не найден");
                throw e;
            }
        }
    }
}

class RethrowDemo {
    public static void main(String[] args) {
        try {
            Rethrow.genException();
        } catch (ArrayIndexOutOfBoundsException e) {
            // Повторно перехватить исключение
            System.out.println("Фатальная ошибка - выполнение программы прервано!");
        }
    }
}