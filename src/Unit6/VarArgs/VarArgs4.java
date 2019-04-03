package Unit6.VarArgs;

// Перегрузка метода с переменным числом аргументов
// и неопределенность в выборе перегруженной версии.
//
// В этой программе имеется ошибка
// и поэтому она не будет компилироваться.
public class VarArgs4 {
    // Использование списка аргументов переменной длины типа int.
    private static void vaTest(int... v) {
        // TODO
    }

    // Использование списка аргументов переменной длины типа int.
    private static void vaTest(boolean ... v) {
        // TODO
    }

    public static void main(String[] args) {
        vaTest(1, 2, 3); // OK
        vaTest(true, false, false); // OK

        //vaTest(); // Ошибка: неопределенность вызова
    }
}
