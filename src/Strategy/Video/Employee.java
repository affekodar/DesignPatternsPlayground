package Strategy.Video;

public class Employee {

    private String firstName;
    private String lastName;
    private int employmentYear;

    public Employee(String firstName, String lastName, int employmentYear) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.employmentYear = employmentYear;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getEmploymentYear() {
        return employmentYear;
    }

    public void setEmploymentYear(int employmentYear) {
        this.employmentYear = employmentYear;
    }
}
