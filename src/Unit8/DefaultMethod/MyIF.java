package Unit8.DefaultMethod;

public interface MyIF {
    // Объявление обычного метода интерфейса, который
    // НЕ включает определение реализации по умолчанию
    int getUserID();

    // Объявление метода по умолчанию, включающее его реализацию
    default int getAdminID() {
        return 1;
    }
}
