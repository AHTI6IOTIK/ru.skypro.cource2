package oop.step2.upper.step5;

public abstract class Animal {
    private final String food;
    private final String location;

    public Animal(String food, String location) {
        this.food = food;
        this.location = location;
    }

    public String getFood() {
        return food;
    }

    public String getLocation() {
        return location;
    }

    abstract public void makeNoise();

    abstract public void eat();

    abstract public void sleep();
}
