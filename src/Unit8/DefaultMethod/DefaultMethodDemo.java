package Unit8.DefaultMethod;

// Использование метода по умолчанию интерфейса MyIF
public class DefaultMethodDemo {
    public static void main(String[] args) {
        MyIFImp obj = new MyIFImp();

        // Вызов метода getUserID() возможен потому, что он
        // явно реализован  в классе MyIFImp
        System.out.println("Идентификатор пользователя: " + obj.getUserID());

        // Вызов метода getAdminID() также возможет потому, поскольку
        // предоставляется его реализация по умолчанию в
        System.out.println("Идентификатор админа: " + obj.getAdminID());
    }
}
