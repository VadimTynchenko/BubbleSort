package Unit7.BasicsOfInheritance;
// Использование ключевого слова super для
// предотвращения сокрытия имен
class A {
    int i;
}

// Создать подкласс, расширяющий класс A
class B extends A {
    private int i; // Эта переменная i сокрывает переменную i из суперкласса А

    B(int a, int b) {
        super.i = a; // Переменная i класса A
        i = b;       // Переменная i класса B
    }

    void show() {
        System.out.println("i в суперклассе A: " + super.i);
        System.out.println("i в подклассе B: " + i);
    }
}

class UseSuper {
    public static void main(String[] args) {
        B subOB = new B(1, 2);

        subOB.show();
    }
}
