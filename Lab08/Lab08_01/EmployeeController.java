//        "Create a class Employee with a method salary to return employee’s salary
//        There are 2 types of employee: Full time employee and contract employee
//        Full time employee has salary is 50000 and contract employee has salary 40000
//        Write a method to accept a list of Employee and calculate total salary
//        For example, company has 3 FTE and 2 contractor"

import java.util.Arrays;
import java.util.List;

public class EmployeeController extends Employee {

    public static void main(String[] args) {
        Employee FT1 = new FullTimeEmployee();
        Employee FT2 = new FullTimeEmployee();
        Employee FT3 = new FullTimeEmployee();
        Employee CE1 = new ContractEmployee();
        Employee CE2 = new ContractEmployee();

        EmployeeController employeeController = new EmployeeController();
        int salary = employeeController.calculateSalary(Arrays.asList(FT1, FT2, FT3, CE1, CE2));
        System.out.println("Total salary: " + salary);
    }
    public int calculateSalary(List<Employee> employees) {
        int totalSalary = 0;
        for (Employee employee : employees) {
            totalSalary += employee.getSalary();
        }
        return totalSalary;
    }

}


