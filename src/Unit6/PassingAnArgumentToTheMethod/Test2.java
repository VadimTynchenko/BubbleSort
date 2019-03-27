package Unit6.PassingAnArgumentToTheMethod;
// объекты передаются методам по ссылке
public class Test2 {

    int a, b;

    Test2(int i, int j) {
        a = i;
        b = j;
    }

    /* Передача объекта методу. Теперь переменные ob.a и ob.b
        объекта, используемого при вызове, так же будут меняться
     */
    void change(Test2 ob) {
        ob.a += ob.b;
        ob.b = - ob.b;
    }
}

class CallByRef {
    public static void main(String[] args) {
        Test2 ob = new Test2(15, 20);

        System.out.println("a и b перед вызовом метода: " + ob.a + " " + ob.b);

        ob.change(ob);

        System.out.println("a и b после вызова метода: " + ob.a + " " + ob.b);
    }
}
