package oop.step2;

public class Car extends BaseMotorTransport {
    public Car(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    public void updateTyre() {
        System.out.println("Меняем покрышку авто");
    }

    public void checkEngine() {
        System.out.println("Проверяем двигатель авто");
    }
}
