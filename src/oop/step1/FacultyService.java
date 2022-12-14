package oop.step1;

public class FacultyService {
    private final CharacteristicService characteristicService;

    private final StudentService studentService;

    public FacultyService() {
        characteristicService = new CharacteristicService();
        studentService = new StudentService();
    }

    public Faculty createFaculty(String facultyName, Student[] students) {
        return new Faculty(
            facultyName,
            students
        );
    }

    public Faculty getGryffindor() {
        return createFaculty(
            "Гриффиндор",
            studentService.createStudents(
                new String[]{"Гарри Поттер", "Гермиона Грейнджер", "Рон Уизли"},
                new String[][]{
                    {"Благородство=11", "Честь=11", "Храбрость=11"},
                    {"Благородство=12", "Честь=12", "Храбрость=12"},
                    {"Благородство=13", "Честь=13", "Храбрость=13"},
                }
            )
        );
    }

    public Faculty getHufflepuff() {
        return createFaculty(
            "Пуффендуй",
            studentService.createStudents(
                new String[]{"Захария Смит", "Седрик Диггори", "Джастин Финч-Флетчли"},
                new String[][]{
                    {"Трудолюбивы=21", "Верны=21", "Честны=21"},
                    {"Трудолюбивы=22", "Верны=22", "Честны=22"},
                    {"Трудолюбивы=23", "Верны=23", "Честны=23"},
                }
            )
        );
    }


    public Faculty getRavenclaw() {
        return createFaculty(
            "Когтевран",
            studentService.createStudents(
                new String[]{"Чжоу Чанг", "Падма Патил", "Маркус Белби"},
                new String[][]{
                    {"Ум=31", "Мудрость=31", "Остроумие=31", "Творчество=31"},
                    {"Ум=32", "Мудрость=30", "Остроумие=30", "Творчество=30"},
                    {"Ум=31", "Мудрость=31", "Остроумие=31", "Творчество=31"},
                }
            )
        );
    }

    public Faculty getSlytherin() {
        return createFaculty(
            "Слизерин",
            studentService.createStudents(
                new String[]{"Драко Малфой", "Грэхэм Монтегю", "Грегори Гойл"},
                new String[][]{
                    {"Хитрост=43", "Решительность=43", "Амбициозность=43", "Находчивость=43", "Жажда власти=43"},
                    {"Хитрост=42", "Решительность=42", "Амбициозность=40", "Находчивость=40", "Жажда власти=42"},
                    {"Хитрост=41", "Решительность=41", "Амбициозность=41", "Находчивость=41", "Жажда власти=41"},
                }
            )
        );
    }
}
