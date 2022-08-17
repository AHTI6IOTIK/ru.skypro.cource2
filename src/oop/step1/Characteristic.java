package oop.step1;

import java.util.Objects;

public class Characteristic {
    private final String name;
    private final int power;

    protected Characteristic(String name, int power) {
        if (power < 0 || power > 100) {
            throw new IllegalArgumentException("Incorrect characteristic range power value: " + power);
        }

        this.name = name;
        this.power = power;
    }

    public String getName() {
        return name;
    }

    public int getPower() {
        return power;
    }

    @Override
    public String toString() {
        return String.format("%s = %s", name, power);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Characteristic)) return false;
        Characteristic that = (Characteristic) o;
        return power == that.power && name.equals(that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, power);
    }
}
