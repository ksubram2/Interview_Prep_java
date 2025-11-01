import java.util.*;

// Employee class
class Employee {
    int id;
    String name;
    double salary;

    // Constructor
    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    // To print Employee details
    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}

public class ComparatorDemo {
    public static void main(String[] args) {

        // Create a list of employees
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee(103, "Karthik", 55000));
        employeeList.add(new Employee(101, "Arun", 48000));
        employeeList.add(new Employee(104, "Vijay", 62000));
        employeeList.add(new Employee(102, "Bala", 52000));

        System.out.println("Before Sorting:");
        employeeList.forEach(System.out::println);

        // Sort by salary
        Comparator<Employee> bySalary = Comparator.comparingDouble(e -> e.salary);
        Collections.sort(employeeList, bySalary);

        System.out.println("\nSorted by Salary (Ascending):");
        employeeList.forEach(System.out::println);

        // Sort by name
        Comparator<Employee> byName = Comparator.comparing(e -> e.name);
        Collections.sort(employeeList, byName);

        System.out.println("\nSorted by Name (Alphabetically):");
        employeeList.forEach(System.out::println);

        // Sort by id (Descending order)
        Comparator<Employee> byIdDesc = (e1, e2) -> Integer.compare(e2.id, e1.id);
        Collections.sort(employeeList, byIdDesc);

        System.out.println("\nSorted by ID (Descending):");
        employeeList.forEach(System.out::println);
    }
}
