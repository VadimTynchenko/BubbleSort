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

class Shapes {
    public static void main(String[] args) {
        Triangle t1 = new Triangle("t1", 4.0, 4.0, "закрашенный");
        Triangle t2 = new Triangle("t2", 8.0, 12.0, "контурный");

        showInfo(t1);
        showInfo(t2);
    }

    private static void showInfo(Triangle triangle) {
        System.out.println("Информация о " + triangle.name + ":");
        triangle.showStyle();
        triangle.showDim();
        triangle.area();
        System.out.println();
    }
}
