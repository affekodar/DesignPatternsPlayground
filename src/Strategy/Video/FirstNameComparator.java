package Strategy.Video;

import java.util.Comparator;

public class FirstNameComparator implements Comparator<Employee> {

    @Override
    public int compare(Employee employee1, Employee employee2) {
        return employee1.getFirstName().compareTo(employee2.getFirstName());
    }
}
