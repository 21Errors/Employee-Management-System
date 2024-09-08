final public class CEO extends Employee implements Department {

    private String department; // Stores the department of the CEO

    // Constructor
    public CEO(){
        super();
    }

    public CEO(Employee employee) {
        super(employee.getId(), employee.getFirstName(), employee.getLastName(), employee.getGender(),
                employee.getAddress(), employee.getCityOrTown(), employee.getEmployeeTitle(),
                employee.getDateHired(), employee.getHoursWorked(), employee.getRateOfPay(),
                employee.getLeaveDays(), employee.hasCarAllowance(), employee.getMonthlyGratuity());
        // Additional initialization code specific to the CEO class
    }

    public CEO(String id, String firstName, String lastName, String gender, String address, String cityOrTown, String employeeTitle,
               String dateHired, double hoursWorked, double rateOfPay, int leaveDays,
               boolean carAllowance, double monthlyGratuity, String department) {
        // Call the superclass constructor using the "super" keyword
        super(id, firstName, lastName, gender, address, cityOrTown, employeeTitle, dateHired, hoursWorked, rateOfPay, leaveDays, carAllowance, monthlyGratuity);

        this.department = department ; // Set the department of the CEO
    }

    
    @Override
    // Setter for department
    public void setDepartment() {
       this.department = "Executive";
    }

    // Override the toString() method to provide a string representation of the object
    @Override
    public String toString() {
        return super.toString() + "\n" +
                "department=  " + department;
    }
}