// Importing DecimalFormat to format the gross salary with 2 digits after the decimal point
import java.text.DecimalFormat;

public class PayrollSystem {
    private EmployeeArray employeeArray;

    public PayrollSystem(EmployeeArray employeeArray) {
        this.employeeArray = employeeArray;
    }

    // Method to display the gross salary of all employees
    public String displayAllEmployeesGrossSalary() {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < employeeArray.size; i++) {
            Employee employee = employeeArray.employees[i];
            if (employeeArray.employees[i] != null) {
                double grossSalary = calculateGrossSalary(employee);

                DecimalFormat df = new DecimalFormat("#.00");
                String formattedGrossSalary = df.format(grossSalary);

                result.append("ID: ").append(employee.getId())
                        .append("\nName: ").append(employee.getFullName())
                        .append("\nTitle: ").append(employee.getEmployeeTitle())
                        .append("\nGross Salary: ").append(formattedGrossSalary)
                        .append("\n-------------\n");
            }
        }
        return result.toString();
    }

    // Method to calculate the gross salary of an employee
    public double calculateGrossSalary(Employee employee) {
        double salary = employee.getRateOfPay() * employee.getHoursWorked();
        double gratuity = salary + (salary * 0.3);

        if (employee.getEmployeeTitle().equals("CEO")) {
            salary += salary * 0.3;
        } else if (employee.getEmployeeTitle().equals("Human Resource Officer") || employee.getEmployeeTitle().equals("Accounts officer")) {
            salary += salary + (salary * 0.15);
        }

        double leaveDays = employee.getLeaveDays() * 3;
        double tax = salary * employee.taxRate;
        double grossSalary = (salary + gratuity - tax) - leaveDays;

        return grossSalary * 4;
    }

    // Method to display the gross salary of an employee based on their ID
    public String displaySalaryById(String id) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < employeeArray.size; i++) {
            Employee employee = employeeArray.employees[i];
            if (employeeArray.employees[i] != null && employee.getId().equals(id)) {
                double grossSalary = calculateGrossSalary(employee);

                DecimalFormat df = new DecimalFormat("#.00");
                String formattedGrossSalary = df.format(grossSalary);

                result.append("ID: ").append(employee.getId())
                        .append("\nName: ").append(employee.getFullName())
                        .append("\nTitle: ").append(employee.getEmployeeTitle())
                        .append("\nGross Salary: ").append(formattedGrossSalary).append("\n");
                return result.toString();
            }
        }
        result.append("Employee with ID ").append(id).append(" not found");
        return result.toString();
    }
}
