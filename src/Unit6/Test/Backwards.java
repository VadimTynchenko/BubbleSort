package Unit6.Test;

// Отображение строки в обратном порядке с помощью рекурсии
class Backwards {
    private String string;

    Backwards(String s) {
        string = s;
    }

    void backWard(int idx) {
        if (idx != string.length() - 1) {
            backWard(idx + 1);
        }

        System.out.print(string.charAt(idx));
    }
}

class BDemo {
    public static void main(String[] args) {
        Backwards s = new Backwards("String to backwards");

        s.backWard(0);
    }
}
