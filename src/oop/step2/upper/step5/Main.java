package oop.step2.upper.step5;

public class Main {
    public static void main(String[] args) {
        Veterinarian veterinarian = new Veterinarian();
        Animal[] animals = new Animal[]{
            new Cat("cat food", "clinic"),
            new Dog("dog food", "clinic"),
            new Horse("horse food", "clinic"),
        };

        for (Animal animal : animals) {
            veterinarian.treatAnimal(animal);
        }
    }
}
