package collections.step2;

public class Main {
    public static void main(String[] args) {
        EmployeeService service = new EmployeeService();
        Employee empl1 = new Employee("empl1", 1, 100);
        Employee empl2 = new Employee("empl2", 2, 100);
        Employee empl3 = new Employee("empl3", 3, 100);
        Employee empl4 = new Employee("empl4", 4, 100);
        Employee empl5 = new Employee("empl2", 2, 100);
        service.add(empl1)
            .add(empl2)
            .add(empl3)
            .add(empl4)
            .add(empl5)
        ;
        service.printCollection();

        System.out.println(service.findByFullName("empl2"));
        System.out.println("Удаляем сотрудника: " + service.removeByFullName("empl1"));
        service.printCollection();
    }
}
