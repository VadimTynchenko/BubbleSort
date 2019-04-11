package Unit9.Try_Catch;

public class ExcDemo2 {
    public static void main(String[] args) {

        try {
            ExcTest.genException();
        }
        // А здесь исключение перехватывается
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Выход за пределы массива!");
            System.out.println(e.getMessage());
        }
        System.out.println("После оператора catch.");
    }
}
