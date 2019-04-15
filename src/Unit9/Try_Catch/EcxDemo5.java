package Unit9.Try_Catch;

// В операторах catch исключения подкласса должны
// предшествовать исключениям суперкласса
public class EcxDemo5 {
    public static void main(String[] args) {
        int[] number = {2, 4, 8, 16, 32, 64, 128, 256, 512};
        int[] denom = {2, 0, 4, 4, 0, 8};

        for (int i = 0; i < number.length; i++) {
            try {
                System.out.println(number[i] + " / " + denom[i] +
                        "равно " + number[i] / denom[i]);
            } catch (ArrayIndexOutOfBoundsException e) {
                // Перехватить исключение
                System.out.println("Соответствующий элемент не найден!");
            } catch (Throwable throwable) {
                System.out.println("Возникло исключение!");
            }
        }
    }
}
