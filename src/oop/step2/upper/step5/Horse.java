package oop.step2.upper.step5;

public class Horse extends Animal {
    public Horse(String food, String location) {
        super(food, location);
    }

    @Override
    public void makeNoise() {
        System.out.println("Лошадь спит");
    }

    @Override
    public void eat() {
        System.out.println("Лошадь ест");
    }

    @Override
    public void sleep() {
        System.out.println("Лошадь спит");
    }
}
