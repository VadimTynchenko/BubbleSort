package Unit9.Lesson9_1;

// Интерфейс для очереди символов
public interface ICharQ {
    // Поместить символ в очередь
    void put(char ch) throws QueueFullException;

    // Извлечь символ из очереди
    char get() throws QueueEmptyException;
}
