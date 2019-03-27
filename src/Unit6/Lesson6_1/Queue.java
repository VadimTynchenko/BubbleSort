package Unit6.Lesson6_1;

// Усовершенствованный класс очереди, предназначенный для хранения символьных значений.
class Queue {
    // эти члены класса теперь являются закрытыми
    private char[] q; // массив для хранения элементов очереди
    private int putLoc, getLoc; // индексы для вставки и извлечения элементов очереди

    Queue(int size) {
        q = new char[size + 1]; // выделение памяти для очереди
        putLoc = getLoc = 0;
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

// демонстрация использования усовершенствованного класса Queue
class QDemo {
    public static void main(String[] args) {
        Queue bigQ = new Queue(100);
        Queue smallQ = new Queue(4);
        Queue test = new Queue(10);
        char ch;
        int i;

        System.out.println("Использование очереди bigQ для сохранения алфавита");
        // поместить букквенные символы в очередь алфавита bigQ
        for (i = 0; i < 26; i++) {
            bigQ.put((char) ('A' + i));
        }

        // Извлечь буквенные символы из очереди ЬigQ и отобразить
        System.out.print("Содержимое очереди ЬigQ: ");
        for (i = 0; i < 26; i++) {
            ch = bigQ.get();
            if (ch != (char) 0) {
                System.out.print(ch);
            }
        }

        System.out.println("\n");

        System.out.println("Использование очереди smallQ для генерации ошибок");
        // Использовать очередь smallQ для генерации ошибок
        for (i = 0; i < 5; i++) {
            System.out.print("Попытка сохранения " + (char) ('Z' - i));

            smallQ.put((char) ('Z' - i));

            System.out.println();
        }
        System.out.println();

        // Дополнительные ошибки при обращении к очереди smallQ
        System.out.print("Содержимое smallQ: ");

        for (i = 0; i < 5; i++) {
            ch = smallQ.get();
            if (ch != (char) 0) {
                System.out.print(ch);
            }
        }
    }
}
