package Unit9.Throws;

// Генерирование исключения вручную
public class ThrowDemo {
    public static void main(String[] args) {
        try {
            System.out.println("До оператора throw");
            throw new ArithmeticException(); // сгенерировать исключение
        } catch (ArithmeticException e) {
            // Перехватить исключение
            System.out.println("Исключение перехвачено");
        }
        System.out.println("После блока try/catch");
    }
}
