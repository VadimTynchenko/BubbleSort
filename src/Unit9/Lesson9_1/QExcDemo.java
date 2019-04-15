package Unit9.Lesson9_1;

// Добавление обработчиков исключений в класс очереди.

// Демонстрация исключений при работе с очередью
public class QExcDemo {
    public static void main(String[] args) {
        FixedQueue q = new FixedQueue(10);
        char ch;
        int i;

        try {
            // переполнение очереди
            for (i = 0; i < 11; i++) {
                System.out.print("Попытка сохранения: " + (char) ('A' + i));
                q.put((char) ('A' + i));
                System.out.println(" - OK");
            }
            System.out.println();
        } catch (QueueFullException e) {
            System.out.println(e);
        }
        System.out.println();

        try {
            // Попытка извлечь символ из пустой очереди
            for (i = 0; i < 11; i++) {
                System.out.print("Получение очередного символа: ");
                ch = q.get();
                System.out.println(ch);
            }
        } catch (QueueEmptyException e) {
            System.out.println(e);
        }
    }
}

