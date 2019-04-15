package Unit9.Throwable;

// Использование методов класса Throwable
class ExcTest {
    static void genException() {
        int[] nums = new int[4];

        System.out.println("До генерации исключения");

        // Сгенерировать исключение в связи
        // с выходом за границы массива
        nums[7] = 10;
        System.out.println("Эта строка не будет отображаться");
    }
}

public class UseThrowableMethods {
    public static void main(String[] args) {
        try {
            ExcTest.genException();
        } catch (ArrayIndexOutOfBoundsException e) {
            // Перехватить исключения
            System.out.println("Стандартное сообщение:");
            System.out.println(e);
            System.out.println("\nСтек вызовов:");
            e.printStackTrace();
        }
        System.out.println("После оператора catch");
    }
}
