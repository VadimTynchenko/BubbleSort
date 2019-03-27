package Unit6.AccessModifiers;

class MyClass {

    private int alpha;
    public int beta;
    int gamma; // модификатор доступа по умолчанию

    void setAlpha(int alpha) {
        this.alpha = alpha;
    }

    int getAlpha() {
        return alpha;
    }
}

class AccessDemo {
    public static void main(String[] args) {
        MyClass ob = new MyClass();

        /* доступ к переменной alpha возможен
        только с помощью специального метода
         */
        ob.setAlpha(-99);
        System.out.println("ob.alpha: " + ob.getAlpha());

        // обратиться к переменной alpha так как показано ниже нельзя
        // ob.alpha = 10 // alpha - закрытая переменная

        ob.beta = 10;
        ob.gamma = 1; // эти обращения вполне допустимы так как данные переменные являются открытыми

        System.out.println("ob.beta: " + ob.beta);
        System.out.println("ob.gamma: " + ob.gamma);
    }
}
