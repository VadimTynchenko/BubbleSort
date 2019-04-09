package Unit7.OverrideMethod;

// Методы с разными сигнатурами не переопределяются, а перегружаются
public class A2 {
    int i, j;

    public A2(int i, int j) {
        this.i = i;
        this.j = j;
    }

    // Отобразить переменные i и j
    void show() {
        System.out.println("i и j: " + i + " " + j);
    }
}

// Создание подкласса путем расширения класса А
class B2 extends A {
    private int k;

    B2(int i, int j, int k) {
        super(i, j);
        this.k = k;
    }

    // Перегрузить метод show()
    void show(String msg) {
        System.out.println(msg + k);
    }
}

class Overload {
    public static void main(String[] args) {
        B2 ob = new B2(1, 2, 3);

        ob.show(); // Вызывается метод show() из класса А
        ob.show("k = "); // Вызывается перегруженный метод show() из класса B
    }
}