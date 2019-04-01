package Unit6.Static;
// Применение статического метода
public class StaticMethod {
    static int val = 1024; // статическая переменная

    // Статический метод
    static int valDiv2() {
        return val / 2;
    }
}

class SDemo2 {
    public static void main(String[] args) {
        System.out.println("Значение StaticMethod.val: " + StaticMethod.val);
        System.out.println("Значение StaticMethod.valDiv2(): " + StaticMethod.valDiv2());

        StaticMethod.val = 4;
        System.out.println("Значение StaticMethod.val: " + StaticMethod.val);
        System.out.println("Значение StaticMethod.valDiv2(): " + StaticMethod.valDiv2());
    }
}
