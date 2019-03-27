package Unit6.PassingAnArgumentToTheMethod;
// простые типы данных передаются по значению
public class Test1 {
    /* Этот метод не может изменить значения аргументов.
    передаваемых ему при вызове.*/

    void noChange(int i, int j) {
        i += j;
        j = -j;
    }
}

class CallByValue {
    public static void main(String[] args) {
        Test1 ob = new Test1();

        int a = 15, b = 20;

        System.out.println("a и b перед вызовом метода: " + a + " " + b);

        ob.noChange(a, b);

        System.out.println("a и b после вызова метода: " + a + " " + b);
    }
}
