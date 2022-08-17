package oop.step1;

import java.util.Arrays;
import java.util.Objects;

public class PrintStudent {
    public void printStudent(Student student) {
        System.out.printf(
            "%s {%s}%n",
            student.getName(),
            Arrays.toString(student.getCharacteristics())
        );
    }

    public void printCompareStudents(String nameFaculty, Student firstStudent, Student nextStudent) {
        String bestStudentName = firstStudent.getName();
        String nextStudentName = "";
        if (!Objects.isNull(nextStudent)) {
            nextStudentName = nextStudent.getName();
        }
        System.out.printf(
            "%s лучший %sец, чем %s\n",
            bestStudentName,
            nameFaculty,
            nextStudentName
        );
    }
}
