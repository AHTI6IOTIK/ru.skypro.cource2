package oop.step2.upper.step2;

public class Pyramid implements ShapeInterface {
    private double s;

    private double h;

    public Pyramid(double s, double h) {
        this.s = s;
        this.h = h;
    }

    @Override
    public double getVolume() {
        return s * h;
    }
}
