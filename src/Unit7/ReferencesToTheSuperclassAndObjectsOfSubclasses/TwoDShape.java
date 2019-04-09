package Unit7.ReferencesToTheSuperclassAndObjectsOfSubclasses;

public class TwoDShape {
    private double width;
    private double height;

    // Конструктор по умолчанию
    TwoDShape() {
        width = height = 0;
    }

    // Параметризированный конструктор
    TwoDShape(double width, double height) {
        this.width = width;
        this.height = height;
    }

    // Создать объект с одинаковыми значениями
    // переменных экземпляра width и height
    TwoDShape(double x) {
        width = height = x;
    }

    // Создать один объект на основе другого
    TwoDShape(TwoDShape ob) {
        width = ob.width;
        height = ob.height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    void showDim() {
        System.out.println("Ширина и высота = " + width + " " + height);
    }
}

// Подкласс для представления треугольников,
// производных от суперкласса TwoDShape
class Triangle extends TwoDShape {
    private String style;

    // Конструктор по умолчанию
    Triangle() {
        super();
        style = "none";
    }

    // Параметризированный конструктор

    Triangle(double width, double height, String style) {
        super(width, height);
        this.style = style;
    }

    // Конструктор с одним аргументом
    Triangle(double x) {
        super(x);
        style = "закрашенный";
    }

    // Создать один объект на основе другого
    Triangle(Triangle ob) {
        super(ob); // Передача объекта конструктору класса TwoDShape
        style = ob.style;
    }

    double area() {
        return getHeight() * getWidth() / 2;
    }

    void showStyle() {
        System.out.println("Треугольник " + style);
    }
}

class Shapes {
    public static void main(String[] args) {
        Triangle t1 = new Triangle(12.0, 8.0, "закрашенный");

        // Создать копию обхекта t1
        Triangle t2 = new Triangle(t1);

        System.out.println("Информация о t1:");
        t1.showStyle();
        t1.showDim();
        System.out.println("Площадь = " + t1.area());

        System.out.println();

        System.out.println("Информация о t2:");
        t2.showStyle();
        t2.showDim();
        System.out.println("Площадь = " + t2.area());
    }
}
