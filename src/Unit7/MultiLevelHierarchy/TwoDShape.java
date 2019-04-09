package Unit7.MultiLevelHierarchy;

// создание многоуровневой иерархии классов
public class TwoDShape {
    private double width;
    private double height;

    // Конструктор по умолчанию
    TwoDShape() {
        width = height = 0.0;
    }

    // Параметризированный конструктор

    public TwoDShape(double width, double height) {
        this.width = width;
        this.height = height;
    }

    // Создать объект с одинаковыми значениями
    // переменных экземпляра width и height
    TwoDShape(double x) {
        width = height = x;
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

    // Показать параметры высоты и ширины
    void showDim() {
        System.out.println("Ширина и высота: " + width + " " + height);
    }
}

// Расширение класса TWoDShape
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

    // Конструктор для построения треугольника с одним параметром
    Triangle(double x) {
        super(x);
        this.style = "закрашенный";
    }

    double area() {
        return getWidth() * getHeight() / 2;
    }

    void showStyle() {
        System.out.println("Треугольник " + style);
    }
}

// Расширение класса Triangle
class ColorTriangle extends Triangle {
    private String color;

    ColorTriangle(double width, double height, String style, String color) {
        super(width, height, style);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    void showColor() {
        System.out.println("Цвет - " + color);
    }
}

class Shape {
    public static void main(String[] args) {
        ColorTriangle t1 = new ColorTriangle(8.0, 12.0, "контурный", "синий");
        ColorTriangle t2 = new ColorTriangle(2.0, 2.0, "закрашенный", "красный");

        System.out.println("Информация о t1:");
        t1.showStyle();
        t1.showDim();
        t1.showColor();
        System.out.println("Площадь - " + t1.area());

        System.out.println();

        System.out.println("Информация о t2:");
        t2.showStyle();
        t2.showDim();
        t2.showColor();
        System.out.println("Площадь - " + t2.area());

    }
}