package Strategy.Video;

public class Main {

    public static void main(String[] args) {
        EmployeeManager employeeManager = new EmployeeManager();
        employeeManager.addEmployee(new Employee("Jerry", "Persson", 2012));
        employeeManager.addEmployee(new Employee("Jens", "Persson", 2015));
        employeeManager.addEmployee(new Employee("Tomas", "Wigell", 1995));
        employeeManager.addEmployee(new Employee("Tiffany", "Persson", 2015));
        employeeManager.addEmployee(new Employee("Tyra", "Jönsson", 2000));

        System.out.println("----Sort by first name----");
        employeeManager.setStrategy("firstName");
        employeeManager.sortEmployees();
        employeeManager.printEmployees();


        System.out.println("---Sort by last name----");
        employeeManager.setStrategy("lastName");
        employeeManager.sortEmployees();
        employeeManager.printEmployees();


        System.out.println("----Sort by employment year----");
        employeeManager.setStrategy("employmentYear");
        employeeManager.sortEmployees();
        employeeManager.printEmployees();
    }
}
