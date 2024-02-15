package Strategy.Video;

import java.util.Comparator;

public class LastNameComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee employee1, Employee employee2) {
        return employee1.getLastName().compareTo(employee2.getLastName());
    }
}
