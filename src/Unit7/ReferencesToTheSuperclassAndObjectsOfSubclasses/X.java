package Unit7.ReferencesToTheSuperclassAndObjectsOfSubclasses;

// Обращение к объекту подкласса по
// ссылочной переменной суперкласса
class X {
    int a;

    X(int a) {
        this.a = a;
    }
}

class Y extends X {
    int b;

    Y(int a, int b) {
        super(a);
        this.b = b;
    }
}

class SupSubRef {
    public static void main(String[] args) {
        X x = new X(10);
        X x2;

        Y y = new Y(5, 6);

        x2 = y; // Допустимо, так как обе переменные одного типа
        System.out.println("x2.a = " + x2.a);

        // В классе Х известны только члены класса Х
        x2.a = 19; // Допустимо

        System.out.println("x2.a = " + x2.a);
//        x2.b = 10; // Ошибка, так как переменная b не является членом класса Х
    }
}