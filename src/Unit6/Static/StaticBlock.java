package Unit6.Static;

public class StaticBlock {
    static double rootOf2;
    static double rootOf3;

    static {
        System.out.println("Внутри статического болка");
        rootOf2 = Math.sqrt(2.0);
        rootOf3 = Math.sqrt(3.0);
    }

    StaticBlock(String msg) {
        System.out.println(msg);
    }
}

class SDemo3 {
    public static void main(String[] args) {
        StaticBlock ob1 = new StaticBlock("Внутри конструктора");

        System.out.println("Квадратный корень 2.0 равен: " + StaticBlock.rootOf2);
        System.out.println("Квадратный корень 3.0 равен: " + StaticBlock.rootOf3);
    }
}
