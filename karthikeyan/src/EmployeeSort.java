import java.util.*;
import java.util.stream.Collectors;

public class EmployeeSort {

    public static void main(String[] args) {

        EmployeeAssemble emp1 = new EmployeeAssemble(1, "IT", 20000.00);
        EmployeeAssemble emp2 = new EmployeeAssemble(2, "IT", 30000.00);
        EmployeeAssemble emp3 = new EmployeeAssemble(3, "Account", 40000.00);

        List<EmployeeAssemble> emp = Arrays.asList(emp1,emp2,emp3);

        Map<String, Optional<EmployeeAssemble>> result = emp.
                stream().
                collect(Collectors.groupingBy(EmployeeAssemble::getDepartment, Collectors.maxBy(Comparator.comparingDouble(EmployeeAssemble::getSalary))));
        result.forEach((d,e)-> System.out.println(d + " -> " + e.get().getDepartment() + e.get().getSalary()));




    }
}
