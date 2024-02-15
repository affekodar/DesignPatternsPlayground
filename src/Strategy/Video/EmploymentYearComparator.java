package Strategy.Video;

import java.util.Comparator;

public class EmploymentYearComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee employee1, Employee employee2) {
        return employee1.getEmploymentYear() - employee2.getEmploymentYear();
    }
}
