package oop.step1;

import java.util.Arrays;
import java.util.Objects;

public class Student {
    private final String name;
    private final Characteristic[] characteristics;

    public Student(String name, Characteristic[] characteristics) {
        this.name = name;
        this.characteristics = characteristics;
    }

    public String getName() {
        return name;
    }

    public int getSumPower() {
        int power = 0;
        for (Characteristic characteristic: characteristics) {
            power += characteristic.getPower();
        }

        return power;
    }

    public Characteristic[] getCharacteristics() {
        return characteristics;
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;
        Student student = (Student) o;
        return name.equals(student.name) && Arrays.equals(characteristics, student.characteristics);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(name);
        result = 31 * result + Arrays.hashCode(characteristics);
        return result;
    }
}
