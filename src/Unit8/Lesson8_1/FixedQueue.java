package Unit8.Lesson8_1;

// Класс, реализующий очередь фиксированного размера
// для хранения символов
class FixedQueue implements ICharQ {
    private char[] q; // массив для хранения элементов очереди
    private int putloc, getloc; // индексы вставляемых и извлекаемых элементов

    // Создать пустую очередь заданного размера
    public FixedQueue(int size) {
        q = new char[size + 1]; // выделить память для очереди
        putloc = getloc = 0;
    }

    // Поместить символ в очередь

    @Override
    public void put(char ch) {
        if (putloc == q.length - 1) {
            System.out.println("- Очередь переполнена.");
            return;
        }

        putloc++;
        q[putloc] = ch;
    }

    // Извлечь символ из очереди

    @Override
    public char get() {
        if (getloc == putloc) {
            System.out.println("- Очередь пуста.");
            return (char) 0;
        }

        getloc++;
        return q[getloc];
    }
}
