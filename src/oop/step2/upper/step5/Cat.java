package oop.step2.upper.step5;

public class Cat extends Animal {
    public Cat(String food, String location) {
        super(food, location);
    }

    @Override
    public void makeNoise() {
        System.out.println("Кот спит");
    }

    @Override
    public void eat() {
        System.out.println("Кот ест");
    }

    @Override
    public void sleep() {
        System.out.println("Кот спит");
    }
}
