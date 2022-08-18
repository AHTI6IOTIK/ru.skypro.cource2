package oop.step1;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        FacultyService facultyService = new FacultyService();

        Faculty gryffindor = facultyService.getGryffindor();
        System.out.println(Arrays.toString(gryffindor.getStudents()));
        gryffindor.compareAndPrint(
            gryffindor.findStudent("Гарри Поттер"),
            gryffindor.findStudent("Рон Уизли")

        );

        Faculty hufflepuff = facultyService.getHufflepuff();
        Faculty ravenclaw = facultyService.getRavenclaw();
        System.out.println();
        ravenclaw.compareAndPrint(
            ravenclaw.findStudent("Чжоу Чанг"),
            ravenclaw.findStudent("Маркус Белби")
        );

        Faculty slytherin = facultyService.getSlytherin();
        System.out.println();
        slytherin.compareAndPrint(
            slytherin.findStudent("Грегори Гойл"),
            slytherin.findStudent("Драко Малфой")
        );
    }
}
