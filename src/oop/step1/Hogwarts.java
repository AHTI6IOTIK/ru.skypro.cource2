package oop.step1;

import java.util.Arrays;

public class Hogwarts {

    public static void main(String[] args) {
        PrintStudent printer = new PrintStudent();
        FacultyService facultyService = new FacultyService();

        Faculty gryffindor = facultyService.getGryffindor();
        System.out.println(Arrays.toString(gryffindor.getStudents()));
        gryffindor.compare(printer);

        Faculty hufflepuff = facultyService.getHufflepuff();
        Faculty ravenclaw = facultyService.getRavenclaw();
        Faculty slytherin = facultyService.getSlytherin();
        System.out.println();
        slytherin.compare(printer);

    }
}