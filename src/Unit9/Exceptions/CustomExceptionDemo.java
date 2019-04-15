package Unit9.Exceptions;

// Использование специально созданного исключения

// Создать исключение
class NonIntResultException extends Exception {
    private int n;
    private int d;

    NonIntResultException(int n, int d) {
        this.n = n;
        this.d = d;
    }

    @Override
    public String toString() {
        return "Результат операции " + n + " / " +
                d + " не является целым числом";
    }
}

public class CustomExceptionDemo {
    public static void main(String[] args) {
        // в массиве number содержатся нечетные числа
        int[] number = {4, 8, 15, 32, 64, 127, 256, 512};
        int[] denom = {2, 0, 4, 4, 0, 8};

        for (int i = 0; i < number.length; i++) {
            try {
                if ((number[i] % 2) != 0)
                    throw new NonIntResultException(number[i], denom[i]);
                System.out.println(number[i] + " / " + denom[i] +
                        "равно " + number[i] / denom[i]);
            } catch (ArithmeticException e) {
                System.out.println("Попытка деления на ноль!");
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Соответствующий элемент не найден");
            } catch (NonIntResultException e) {
                System.out.println(e);
            }
        }
    }
}
