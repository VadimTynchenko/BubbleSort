package Unit6.Lesson6_2;
// Продемонстрировать использование класса Queue
public class QDemo2 {
    public static void main(String[] args) {
        // Создать пустую очередь для хранения 10 элементов
        Queue q1 = new Queue(10);

        char[] name = {'T', 'o', 'm'};
        // Создать очередь на основе массива
        Queue q2 = new Queue(name);

        char ch;
        int i;

        // Поместить ряд символов в очередь q1
        for (i = 0; i < 10; i++) {
            q1.put((char) ('A' + i));
        }

        // Создать одну очередь на основе другой
        Queue q3 = new Queue(q1);

        // Показать очереди
        System.out.print("Содержимое q1: ");
        for (i = 0; i < 10; i++) {
            ch = q1.get();
            System.out.print(ch);
        }

        System.out.println("\n");

        System.out.print("Содержимое q2: ");
        for (i = 0; i < 3; i++) {
            ch = q2.get();
            System.out.print(ch);
        }

        System.out.println("\n");

        System.out.print("Содержимое q3: ");
        for (i = 0; i < 10; i++) {
            ch = q3.get();
            System.out.print(ch);
        }
    }
}

class Queue {
    private char[] q; // массив для хранения элементов очереди
    private int putLoc, getLoc; // индексы для вставки и извлечения элементов очереди

    Queue(int size) {
        q = new char[size + 1]; // выделение памяти для очереди
        putLoc = getLoc = 0;
    }

    // Сконструировать очередь на основе имеющегося объекта Queue
    Queue(Queue ob) {
        putLoc = ob.putLoc;
        getLoc = ob.getLoc;
        q = new char[ob.q.length];

        // Копировать элементы в очередь
        for (int i = getLoc + 1; i <= putLoc; i++) {
            q[i] = ob.q[i];
        }
    }

    // Сконструировать очередь на основе массива исходных значений
    Queue(char a[]) {
        putLoc = 0;
        getLoc = 0;
        q = new char[a.length + 1];

        for (int i = 0; i < a.length; i++) {
            put(a[i]);
        }
    }

    // Поместить символ в очередь
    void put(char ch) {
        if (putLoc == q.length - 1) {
            System.out.println(" - очередь заполнена.");
            return;
        }

        putLoc++;
        q[putLoc] = ch;
    }

    // Извлечь символ из очереди
    char get() {
        if (getLoc == putLoc) {
            System.out.println(" - очередь пуста.");
            return (char) 0;
        }

        getLoc++;
        return q[getLoc];
    }
}