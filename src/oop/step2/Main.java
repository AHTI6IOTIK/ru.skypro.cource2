package oop.step2;

public class Main {
    public static void main(String[] args) {
        CheckableInterface car = new Car("car1", 4);
        CheckableInterface[] checkableTransports = new CheckableInterface[]{
            new Car("car2", 4),
            new Bicycle("bicycle1", 2),
            new Bicycle("bicycle2", 2),
            new Truck("truck1", 6),
            new Truck("truck2", 8)
        };
        ServiceStation station = new ServiceStation();
        station.check(car);
        station.check(checkableTransports);
    }
}
