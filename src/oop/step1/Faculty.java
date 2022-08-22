package oop.step1;

public class Faculty extends Hogwarts {
    public Faculty(String name, Student[] students) {
       super(name, students);
    }

    @Override
    protected StudentPrinterInterface getPrinter(int flag) {
        if (flag == 0) {
            return new EqualsStudentPrinter();
        }

        return new OneStrongestStudentPrinter();
    }

    @Override
    public void compareAndPrint(Student oneStudent, Student twoStudent) {
        System.out.printf("Сравниваем студентов %sа\n", getName());
        super.compareAndPrint(oneStudent, twoStudent);
    }
}
