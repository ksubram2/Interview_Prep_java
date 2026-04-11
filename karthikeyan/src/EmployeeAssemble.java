public class EmployeeAssemble {


    public EmployeeAssemble(int id, String department, Double Salary){

        this.id = id;
        this.department = department;
        this.Salary = Salary;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public Double getSalary() {
        return Salary;
    }

    public void setSalary(Double salary) {
        Salary = salary;
    }

    private int id;
    private String department;
    private Double Salary;




}
