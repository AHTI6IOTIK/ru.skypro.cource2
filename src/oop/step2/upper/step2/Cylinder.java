package oop.step2.upper.step2;

public class Cylinder extends SolidOfRevolution {
    double h;

    public Cylinder(double radius, double h) {
        super(radius);
        this.h = h;
    }

    @Override
    public double getVolume() {
        return super.getRadius() * h;
    }
}
