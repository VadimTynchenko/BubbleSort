package Unit7.Lesson7_1;

public class TruckDemo {
    public static void main(String[] args) {
        // Создать ряд новых ТС типа Truck
        Truck semi = new Truck(2, 200, 7, 44000);
        Truck pickup= new Truck(3, 28, 12, 20000);
        OffRoad offRoad = new OffRoad(5, 40, 10, 200);
        int dist = 252;

        System.out.println("Грузовик может перевезти " + semi.getCargoCap() + " фунтов.");
        System.out.println("Для преодоления " + dist + " миль грузовику потребуется "
                                        + semi.fuelNeeded(dist) + " галлонов топлива.");
        System.out.println("На полном баке, объемом " + semi.getFuelCap()
                                        + ", грузовик сможет проехать " + semi.range() + " миль.\n");

        System.out.println("Пикап может перевезти " + pickup.getCargoCap() + " фунтов.");
        System.out.println("Для преодоления " + dist + " миль пикапу потребуется "
                                        + pickup.fuelNeeded(dist) + " галлонов топлива.");
        System.out.println("На полном баке, объемом " + pickup.getFuelCap()
                + ", пикап сможет проехать " + pickup.range() + " миль.\n");

        System.out.println("Внедорожник имеет дорожный просвет " + offRoad.getGroundClearance() + " миллиметров");
        System.out.println("Для преодоления " + dist + " миль внедорожнику потребуется "
                                        + offRoad.fuelNeeded(dist) + " галлонов топлива");
        System.out.println("На полном баке, объемом " + offRoad.getFuelCap()
                + ", внедорожник сможет проехать " + offRoad.range() + " миль.\n");
    }
}

// Расширение класса Vehicle для грузовиков
class Truck extends Vehicle{
    private int cargoCap; // грузоподъемность в фунтах

    // Конструктор класса Truck
    Truck(int passengers, int fuelCap, int mpg, int cargoCap) {
        super(passengers, fuelCap, mpg);
        this.cargoCap = cargoCap;
    }

    int getCargoCap() {
        return cargoCap;
    }
}

// Расширени класса Vehicle для внедорожников
class OffRoad extends Vehicle {
    private int groundClearance; // дорожный просвет в миллиметрах

    // Конструктор класса OffRoad

    OffRoad(int passengers, int fuelCap, int mpg, int groundClearance) {
        super(passengers, fuelCap, mpg);
        this.groundClearance = groundClearance;
    }

    int getGroundClearance() {
        return groundClearance;
    }
}

class Vehicle {
    private int passengers; // кол-во пассажиров
    private int fuelCap;    // объем топливного бака в галлонах
    private int mpg;        // потребление топлива в милях на галлон

    Vehicle(int passengers, int fuelCap, int mpg) {
        this.passengers = passengers;
        this.fuelCap = fuelCap;
        this.mpg = mpg;
    }

    // Возвратить дальность поездки ТС
    int range() {
        return mpg * fuelCap;
    }

    // Вычислить объем топлива, требующегося
    // для прохождения заданного пути
    double fuelNeeded(int miles) {
        return (double) miles / mpg;
    }

    int getFuelCap() {
        return fuelCap;
    }

}
