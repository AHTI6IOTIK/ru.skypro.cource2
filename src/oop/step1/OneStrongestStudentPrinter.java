package oop.step1;

public class OneStrongestStudentPrinter implements StudentPrinterInterface{
    @Override
    public void print(Student oneStudent, Student twoStudent) {
        System.out.printf(
            "%s сильнее чем %s\n",
            oneStudent.getName(),
            twoStudent.getName()
        );
    }
}
