package oop.step2.upper.step3;

public class Person {
    private String fullName;
    private int age;

    public Person(String fullNam, int age) {
        this.fullName = fullNam;
        this.age = age;
    }

    public Person() {
    }

    public String fullName() {
        return fullName;
    }

    public Person setFullName(String fullName) {
        this.fullName = fullName;
        return this;
    }

    public int age() {
        return age;
    }

    public Person setAge(int age) {
        this.age = age;
        return this;
    }

    public void talk() {
        if (null == fullName) {
            System.out.println("Аноним говори");
            return;
        }
        System.out.println("Person говорит");
    }
}
