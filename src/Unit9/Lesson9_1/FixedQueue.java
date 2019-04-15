package Unit9.Lesson9_1;

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
    public void put(char ch) throws QueueFullException { {
        if (putloc == q.length - 1) throw new QueueFullException(q.length - 1);

        putloc++;
        q[putloc] = ch;
    }
    }

    // Извлечь символ из очереди

    @Override
    public char get() throws QueueEmptyException {
        if (getloc == putloc) throw new QueueEmptyException();

        getloc++;
        return q[getloc];
    }
}
