package oop.step2.upper.step2;

public class Main {
    public static void main(String[] args) {
        ShapeInterface[] shapeInterfaces = new ShapeInterface[]{
            new Cylinder(2, 10),
            new Pyramid(10, 5),
            new Cylinder(1, 10),
            new Pyramid(10, 2),
            new Ball(2, 10),
            new Pyramid(10, 5),
            new Ball(2, 10)
        };
        Box box = new Box(100);
        for (ShapeInterface shapeInterface : shapeInterfaces) {
            boolean isSuccess = box.add(shapeInterface);
            if (!isSuccess) {
                System.out.printf(
                    "Не хватает места в коробке. Занято %s из %s, добавляется %s%n",
                    box.getOccupiedVolume(),
                    box.getVolume(),
                    shapeInterface.getVolume()
                );
                break;
            }
        }
    }
}
