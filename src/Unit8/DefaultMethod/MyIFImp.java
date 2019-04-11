package Unit8.DefaultMethod;

// Реализация интерейса MyIF
public class MyIFImp implements MyIF {
    // Реализации подлежит только метод getUserID() интерфейса MyIF.
    // Делать это для метода getAdminID() необязательно, поскольку
    // при необходимости может быть искользована его реализация,
    // заданная по умолчанию.


    @Override
    public int getUserID() {
        return 100;
    }
}
