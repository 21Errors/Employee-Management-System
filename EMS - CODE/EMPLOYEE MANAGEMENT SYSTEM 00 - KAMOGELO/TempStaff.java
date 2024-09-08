public class TempStaff extends Employee implements Department{

    private String department; // The department of the human resource officer

    public TempStaff(){
        super();
    }

    public TempStaff(Employee employee) {
        super(employee.getId(), employee.getFirstName(), employee.getLastName(), employee.getGender(),
                employee.getAddress(), employee.getCityOrTown(), employee.getEmployeeTitle(),
                employee.getDateHired(), employee.getHoursWorked(), employee.getRateOfPay(),
                employee.getLeaveDays(), employee.hasCarAllowance(), employee.getMonthlyGratuity());
        // Additional initialization code specific to the HumanResourceOfficer class
    }

    public TempStaff(String id, String firstName, String lastName, String gender, String address, String cityOrTown, String employeeTitle,
                                String dateHired, double hoursWorked, double rateOfPay, int leaveDays,
                                boolean carAllowance, double monthlyGratuity, String department) {
        // Constructor that initializes the HumanResourceOfficer object with the given attributes
        super(id, firstName, lastName, gender, address, cityOrTown, employeeTitle, dateHired, hoursWorked, rateOfPay, leaveDays, carAllowance, monthlyGratuity);
        this.department = department;
    }

    
    @Override
    public void setDepartment() {
        this.department = "Accounts";
    }

    @Override
    public String toString() {
        // Overrides the toString method to include the department information
        return super.toString() + "\n" +
                "department= " + department;
    }
}