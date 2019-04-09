package Unit7.BasicsOfInheritance;
// Простая иерархия классов

// Класс, описывающий двумерные объекты
class TwoDShape {
    double height;
    double width;
    String name;

    TwoDShape(double height, double width, String name) {
        this.height = height;
        this.width = width;
        this.name = name;
    }

    void showDim() {
        System.out.println("Ширина и высота: " + width + " " + height);
    }
}

// Подкласс для представления треугольников,
// производный от класса TwoDShape
class Triangle extends TwoDShape {
    private String style;

    Triangle(String name, double height, double width, String style) {
        super(height, width, name); // вызов конструктора суперкласса
        this.style = style;
    }

    void area() {
        System.out.println("Площадь = " + width * height / 2);   // Из класса Triangle можно обратиться
                                                    // к членам класса TwoDShape так, как если
                                                    // это были бы его собственные члены
    }

    void showStyle() {
        System.out.println("Треугольник " + style);
    }

}

class Rectangle extends TwoDShape {

    Rectangle(String name, double height, double width) {
        super(height, width, name);
    }

    void isSquare() {
        if (height == width) System.out.println("Квадрат");
        else System.out.println("Не квадрат");
    }

    void area() {
        System.out.println("Площадь = " + width * height);
    }
}

class Shapes {
    public static void main(String[] args) {
        Triangle t1 = new Triangle("t1", 4.0, 4.0, "закрашенный");
        Triangle t2 = new Triangle("t2", 8.0, 12.0, "контурный");
        Rectangle r1 = new Rectangle("r1", 10, 10);
        Rectangle r2 = new Rectangle("r2", 20, 5);

        showInfoTriangle(t1);
        showInfoTriangle(t2);
        showInfoRectangle(r1);
        showInfoRectangle(r2);

    }

    private static void showInfoRectangle(Rectangle rectangle) {
        System.out.println("Информация о " + rectangle.name + ":");
        rectangle.isSquare();
        rectangle.showDim();
        rectangle.area();
        System.out.println();
    }

    private static void showInfoTriangle(Triangle triangle) {
        System.out.println("Информация о " + triangle.name + ":");
        triangle.showStyle();
        triangle.showDim();
        triangle.area();
        System.out.println();
    }
}
