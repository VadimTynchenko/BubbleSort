package Unit7.OverrideMethod;

// Переопределение метода
class A {
    int i, j;

    A(int i, int j) {
        this.i = i;
        this.j = j;
    }

    // Отобразить переменные i и j
    void show() {
        System.out.println("i и j: " + i + " " + j);
    }
}

class B extends A {
    int k;

    B(int i, int j, int k) {
        super(i, j);
        this.k = k;
    }

    // Отображение переменной k
    void show() {       // данный метод переопределяет метод show суперкласса A
        System.out.println("k: " + k);
    }
}

class Override {
    public static void main(String[] args) {
        B subOb = new B(1, 2, 3);

        subOb.show(); // вызвать метод show() класса B
    }
}