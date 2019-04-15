package Unit9.Try_Catch;

// Использование средства группового перехвата исключений.
// Примечание: для компиляции этого кода требуется JDK 7
// или более поздняя версия комплекта разработчика(У меня JDK 11)
public class MultiCatch {
    public static void main(String[] args) {
        int a = 88, b = 0;
        int result;
        char[] chars = {'A', 'B', 'C'};

        for (int i = 0; i < 2; i++) {
            try {
                if (i == 0) {
                    // сгенерировать исключение ArithmeticException
                    result = a / b;
                } else {
                    // сгенерировать исключение ArrayIndexOutOfBoundsException
                    chars[5] = 'X';
                }
            }
            // В этом операторе catch организуется перехват
            // обоих исключений
            catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
                System.out.println("Перехваченное значение " + e);
            }
        }
        System.out.println("После группового перехватчика исключений");
    }
}
