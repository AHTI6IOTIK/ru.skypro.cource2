package oop.step2.upper.step5;

public class Veterinarian {
    public void treatAnimal(Animal animal) {
        System.out.println("Животное на приеме");
        System.out.printf("Ест: %s находится: %s%n", animal.getFood(), animal.getLocation());
    }
}
