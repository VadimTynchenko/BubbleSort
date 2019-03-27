package Unit6.OverLoad;

public class Overload {
    void ovlDemo() {
        System.out.println("Без параметров");
    }

    // Перегрузка метода ovlDemo для одного параметра типа int
    void ovlDemo(int i) {
        System.out.println("Один параметр " + i);
    }

    // Перегрузка метода ovlDemo для двух параметров типа int
    int ovlDemo(int i, int j) {
        System.out.println("Два параметра " + i + " " + j);
        return i + j;
    }

    // Перегрузка метода ovlDemo для двух параметров типа double
    double ovlDemo(double i, double j) {
        System.out.println("Два параметра " + i + " " + j);
        return i + j;
    }
}

class OverloadDemo {
    public static void main(String[] args) {
        Overload ob = new Overload();
        int resI;
        double resD;

        // Поочередно вызываем все версии метода ovlDemo()
        ob.ovlDemo();
        System.out.println();

        ob.ovlDemo(2);
        System.out.println();

        resI = ob.ovlDemo(2, 5);
        System.out.println("Результат вызова ovlDemo(2, 5): " + resI);
        System.out.println();

        resD = ob.ovlDemo(2.0, 8.0);
        System.out.println("Результат вызова ovlDemo(2.0, 8.0): " + resD);
    }
}
