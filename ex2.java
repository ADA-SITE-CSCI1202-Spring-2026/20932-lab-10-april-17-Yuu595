import java.util.*;
import java.util.function.Function;

class Employee {
    String firstName, lastName;
    double salary;

    Employee(String firstName, String lastName, double salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }

    String getFirstName() { return firstName; }
    String getLastName() { return lastName; }
    double getSalary() { return salary; }
}

public class ex2 {
    public static void main(String[] args) {
        List<Employee> list = Arrays.asList(
                new Employee("John", "Smith", 1200),
                new Employee("Anna", "Brown", 1500)
        );

        Function<Employee, String> formatCard =
                e -> "Name: " + e.getLastName() + ", " + e.getFirstName() + " - Salary: $" + e.getSalary();

        Function<Employee, Double> salaryPicker = Employee::getSalary;

        for (Employee e : list) {
            System.out.println(formatCard.apply(e));
            System.out.println(salaryPicker.apply(e));
        }
    }
}