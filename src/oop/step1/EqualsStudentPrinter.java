package oop.step1;

public class EqualsStudentPrinter implements StudentPrinterInterface{
    @Override
    public void print(Student oneStudent, Student twoStudent) {
        System.out.printf(
            "Студенты %s и %s, равны по силе\n",
            oneStudent.getName(),
            twoStudent.getName()
        );
    }
}
