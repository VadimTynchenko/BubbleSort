package Unit6.VarArgs;

// Перегрузка метода с переменным числом аргументов
public class VarArgs3 {

    private static void vaTest(int... v) { // Первая версия метода
        System.out.println("vaTest(int .. v): " + "Количество аргументов: " + v.length);
        System.out.println("Содержимое");

        for (int i = 0; i < v.length; i++) {
            System.out.println(" arg " + i + ": " + v[i]);
        }

        System.out.println();
    }

    private static void vaTest(boolean... v) { // Вторая версия метода
        System.out.println("vaTest(int .. v): " + "Количество аргументов: " + v.length);
        System.out.println("Содержимое");

        for (int i = 0; i < v.length; i++) {
            System.out.println(" arg " + i + ": " + v[i]);
        }

        System.out.println();
    }

    private static void vaTest(String msg, int... v) {
        System.out.println("vaTest(int .. v): \n" + msg + " \nКоличество аргументов: " + v.length);
        System.out.println("Содержимое");

        for (int i = 0; i < v.length; i++) {
            System.out.println(" arg " + i + ": " + v[i]);
        }

        System.out.println();
    }

    public static void main(String[] args) {
        vaTest(1, 2, 3);
        vaTest(true, false, false);
        vaTest("Сообщение", 1, 2, 3);
        vaTest("Тестирование");
    }
}
