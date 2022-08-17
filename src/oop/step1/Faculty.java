package oop.step1;

import java.util.Objects;

public class Faculty {
    private final String name;
    private final Characteristic[] characteristics;
    private final Student[] students;

    public Faculty(String name, Characteristic[] characteristics, Student[] students) {
        this.name = name;
        this.characteristics = characteristics;
        this.students = students;
    }

    public String getName() {
        return name;
    }

    public Characteristic[] getCharacteristics() {
        return characteristics;
    }

    public Student[] getStudents() {
        return students;
    }

    public Student compare(PrintStudent printStudent) {
        Student previousStudent = null;
        Student bestStudent = null;

        for (Student student: students) {
            if (!Objects.isNull(printStudent)) {
                printStudent.printStudent(student);
            }

            if (Objects.isNull(bestStudent)) {
                bestStudent = student;
                continue;
            }

            if (bestStudent.getSumPower() < student.getSumPower()) {
                previousStudent = bestStudent;
                bestStudent = student;
            }
        }

        if (
            !Objects.isNull(printStudent)
            && !Objects.isNull(bestStudent)
        ) {
            printStudent.printCompareStudents(name, bestStudent, previousStudent);
        }

        return bestStudent;
    }
}
