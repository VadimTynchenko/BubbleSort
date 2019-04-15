package Unit9.Finally;

// Использование блока finally
class UseFinally {
    static void genException(int what) {
        int t;
        int[] num = new int[2];

        System.out.println("Полученно " + what);
        try {
            switch (what) {
                case 0:
                    t = 10 / what; // сгенерировать ошибку деления на ноль
                    break;
                case 1:
                    num[4] = 4; // сгенерировать ошибку обращения к массиву
                    break;
                case 2:
                    return; // возвратиться из блока try
            }
        } catch (ArithmeticException e) {
            // Перехватить исключение
            System.out.println("Попытка деления на ноль!");
            return; // Вернуться из блока catch
        } catch (ArrayIndexOutOfBoundsException e) {
            // Перехватить исключение
            System.out.println("Соответствующий элемент не найден!");
        } finally {
            System.out.println("Выход из блока try");
        }
    }
}

class FinallyDemo {
    public static void main(String[] args) {

        for (int i = 0; i < 3; i++) {
            UseFinally.genException(i);
            System.out.println();
        }
    }
}
