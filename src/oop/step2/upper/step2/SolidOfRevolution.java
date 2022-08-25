package oop.step2.upper.step2;

public abstract class SolidOfRevolution implements ShapeInterface {
    private final double radius;

    public SolidOfRevolution(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }
}
