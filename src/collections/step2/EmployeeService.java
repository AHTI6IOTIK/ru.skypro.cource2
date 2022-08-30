package collections.step2;

import java.util.HashMap;
import java.util.Map;

public class EmployeeService {
    private final static Map<String, Employee> employeeMap = new HashMap<>();

    public EmployeeService add(Employee employee) {
        employeeMap.put(employee.getFullName(), employee);
        return this;
    }

    public Employee findByFullName(String fullName) {
        return employeeMap.get(fullName);
    }

    public Employee removeByFullName(String fullName) {
        return employeeMap.remove(fullName);
    }

    public void printCollection() {
        System.out.println(employeeMap);
    }
}
