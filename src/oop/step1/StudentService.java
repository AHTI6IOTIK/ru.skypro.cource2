package oop.step1;

import java.util.ArrayList;
import java.util.List;

public class StudentService {
    private final CharacteristicService characteristicService;

    public StudentService() {
        characteristicService = new CharacteristicService();
    }

    public Student[] createStudents(String[] names, String[][] characteristics) {
        List<Student> students = new ArrayList<>();
        for (int i = 0; i < names.length; i++) {
            students.add(new Student(
                    names[i],
                    characteristicService.createByStrings(characteristics[i])
            ));
        }

        return students.toArray(new Student[0]);
    }
}
