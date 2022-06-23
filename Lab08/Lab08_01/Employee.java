public class Employee {
    private int getSalary;
    private static String employee;

    public Employee() {
    }

    public Employee(int salary, String employee) {
        this.getSalary = salary;
        this.employee = employee;
    }

    public int getTotalSalary() {
        return getSalary;
    }

    public void setTotalSalary(int totalSalary) {
        this.getSalary = totalSalary;
    }

    public String getEmployee() {
        return employee;
    }

    public void setEmployee(String employee) {
        this.employee = employee;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "salary=" + getSalary +
                ", employee='" + employee + '\'' +
                '}';
    }

    public int getSalary() {
        return 0;
    }
}
