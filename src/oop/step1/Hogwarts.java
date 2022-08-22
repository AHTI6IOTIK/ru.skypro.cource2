package oop.step1;

public abstract class Hogwarts {
    private final String name;
    private final Student[] students;

    public Hogwarts(String name, Student[] students) {
        this.name = name;
        this.students = students;
    }

    public String getName() {
        return name;
    }

    public Student[] getStudents() {
        return students;
    }

    public Student findStudent(String studentName) {
        Student foundUser = null;

        for (Student student: students) {
            if (student.getName().equals(studentName)) {
                foundUser = student;
                break;
            }
        }

        return foundUser;
    }

    abstract protected StudentPrinterInterface getPrinter(int flag);

    public void compareAndPrint(Student oneStudent, Student twoStudent) {
        int strongerFlag = oneStudent.stronger(twoStudent);
        StudentPrinterInterface printer = getPrinter(strongerFlag);

        Student strongStudent = null;
        Student weakStudent = null;

        if (strongerFlag == 0) {
            printer.print(oneStudent, twoStudent);
            return;
        } else if (strongerFlag > 0) {
            strongStudent = twoStudent;
            weakStudent = oneStudent;
        } else {
            strongStudent = oneStudent;
            weakStudent = twoStudent;
        }
        printer.print(strongStudent, weakStudent);
    }
}