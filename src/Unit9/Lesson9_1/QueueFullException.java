package Unit9.Lesson9_1;

// Исключение, указывающее на переполнение очереди
public class QueueFullException extends Exception {
    int size;

    public QueueFullException(int size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "\nОчередь заполнена. Максимальный размер очереди " + size;
    }
}