package oop.step2.upper.step2;

public class Ball extends SolidOfRevolution {
    double h;

    public Ball(double radius, double h) {
        super(radius);
        this.h = h;
    }

    @Override
    public double getVolume() {
        return super.getRadius() * h;
    }
}
