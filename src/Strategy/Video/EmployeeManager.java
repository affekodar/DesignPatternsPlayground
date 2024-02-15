package Strategy.Video;

import java.util.ArrayList;
import java.util.Comparator;

public class EmployeeManager {
    private ArrayList<Employee> employees = new ArrayList<>();
    private String strategy = "firstName";

    public void addEmployee(Employee employee) {
        this.employees.add(employee);
    }

    public void setStrategy(String strategy) {
        this.strategy = strategy;
    }

    public void sortEmployees() {
        Comparator<Employee> comparator;
        switch (strategy) {
            case "lastName": comparator = new LastNameComparator();
            break;
            case "employmentYear": comparator = new EmploymentYearComparator();
            break;
            default:comparator = new FirstNameComparator();
        }
        employees.sort(comparator);
    }

    public void printEmployees() {
        for (Employee employee : employees) {
            System.out.println(employee.getFirstName() + " " + employee.getLastName() + " " + employee.getEmploymentYear());
        }
    }
}
