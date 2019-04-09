package Unit7.PolymorphismSupportInOverrides;

// Демонстрация динамической диспетчеризации методов
class Sup {
    void who() {
        System.out.println("who() в Sup");
    }
}

class Sub1 extends Sup {
    void who() {
        System.out.println("who() в Sup1");
    }
}

class Sub2 extends Sup {
    void who() {
        System.out.println("who() в Sup2");
    }
}

class DynDispDemo {
    public static void main(String[] args) {
        Sup superOb = new Sup();
        Sub1 subOb1 = new Sub1();
        Sub2 subOb2 = new Sub2();

        Sup supRef;

        supRef = superOb;
        supRef.who();

        supRef = subOb1;
        supRef.who();

        supRef = subOb2;
        supRef.who();
        /*
        В каждом из этих вызовов выбор версии who()
        осуществляется по типу объекта,
        на которую он ссылается
        во время выполнения программы.
         */
    }
}