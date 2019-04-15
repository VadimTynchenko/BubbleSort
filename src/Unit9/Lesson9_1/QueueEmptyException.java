package Unit9.Lesson9_1;

// Исключение, указывающее на исчерпание очереди
public class QueueEmptyException extends Exception {
    @Override
    public String toString() {
        return "\nОчередь пуста";
    }
}
