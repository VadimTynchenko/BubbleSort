package Unit7.OverloadDemo;

// Использование динамической диспетчеризации методов
public class TwoDShape {
    private double width;
    private double height;
    private String name;

    // Конструктор по умолчанию
    public TwoDShape() {
        width = height = 0;
        name = "none";
    }

    // Параметризированный конструктор
    public TwoDShape(double width, double height, String name) {
        this.width = width;
        this.height = height;
        this.name = name;
    }

    // Создать объект с одинаковыми значениями
    // переменных экземпляра width и height
    TwoDShape(double x, String name) {
        width = height = x;
        this.name = name;
    }

    // Создать один объект на основе другого
    TwoDShape(TwoDShape ob) {
        width = ob.width;
        height = ob.height;
        name = ob.name;
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

    public String getName() {
        return name;
    }

    void showDim() {
        System.out.println("Ширина и высота = " + width + " " + height);
    }

    double area() {
        System.out.println("Метод area() должен быть переопределен");
        return 0.0;
    }
}

// Подкласс для представления треугольников,
// производный от класса TwoDShape
class Triangle extends TwoDShape {
    private String style;

    // Конструктор по умолчанию
    Triangle() {
        super();
        style = "none";
    }

    // Конструктор класса Triangle
    public Triangle(double width, double height, String style) {
        super(width, height, "треугольник");
        this.style = style;
    }

    // Конструктор с одним параметром для построение треугольника
    Triangle(double x) {
        super(x, "треугольник");
        style = "закрашенный";
    }

    // Создать один объект на основе друго
    Triangle(Triangle ob) {
        super(ob); // передать объект конструктору класса TwoDShape
        style = ob.style;
    }

    @Override
    double area() {
        return getWidth() * getHeight() / 2;
    }

    void showStyle() {
        System.out.println("Треугольник " + style);
    }
}

// Подкласс представления приямоугольников
// производный от класса TwoDShape
class Rectangle extends TwoDShape {

    // Конструктор по умолчанию
    Rectangle() {
        super();
    }

    // Конструктор класса Rectangle
    Rectangle(double width, double height) {
        super(width, height, "прямоугольник");
    }

    // Создать квадрат
    Rectangle(double x) {
        super(x, "прямоугольник");
    }

    // Создать один объект на основе другого
    Rectangle(Rectangle ob) {
        super(ob);
    }

    boolean isSquare() {
        return getWidth() == getHeight();
    }

    // Переопределение метода area()
    @Override
    double area() {
        return getHeight() * getWidth();
    }
}

class DynShapes {
    public static void main(String[] args) {
        TwoDShape[] shapes = new TwoDShape[5];

        shapes[0] = new Triangle(10.0, 5.0, "контурный");
        shapes[1] = new Rectangle(10.0);
        shapes[2] = new Rectangle(10.0, 4.0);
        shapes[3] = new Triangle(5.0);
        shapes[4] = new TwoDShape(5.0, 1.7, "фигура");

        for (TwoDShape num :
                shapes) {
            System.out.println("Объект - " + num.getName());
            System.out.println("Площадь - " + num.area());
            System.out.println();
        }
    }
}