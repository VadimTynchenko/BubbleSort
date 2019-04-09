package Unit7.TheOrderOfCallConstructors;

class A {
    A() {
        System.out.println("Конструктор А");
    }
}

// Создать подкласс путем расширения класса А
class B extends A {
    B() {
        System.out.println("Конструктрор В");
    }
}

// Создать подкласс путем расширения класса В
class C extends B {
    C() {
        System.out.println("Конструктор С");
    }
}


class OrderOfConstruction {
    public static void main(String[] args) {
        C c = new C();
    }
}