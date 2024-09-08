public class EmployeeCityOrTownCounter {
    private EmployeeArray employeeArray; // Reference to an instance of EmployeeArray
    private String cityOrTown; // The city or town for which the count is calculated
    
    public EmployeeCityOrTownCounter(EmployeeArray employeeArray) {
        this.employeeArray = employeeArray; // Initialize the employeeArray reference
    }
    
    /**
     * Method to display the number of employees in a specific city or town.
     * @param cityOrTown The city or town for which the count is calculated.
     */
    public String displayNumberOfEmployeesInCityOrTown(String cityOrTown) {
        int count = 0; // Counter variable to keep track of the number of employees
        for (int i = 0; i < employeeArray.size; i++) {
            Employee employee = employeeArray.employees[i];
            // Check if the employee is not null and their cityOrTown matches the specified cityOrTown
            if (employeeArray.employees[i] != null && employee.getCityOrTown().equals(cityOrTown)) {
                count++; // Increment the count
            }
        }
        return "Number of employees in " + cityOrTown + ": " + count + "\n";
    }
    
    
    public String deleteEmployeesPerCityOrTown(String cityOrTown) {
        boolean found = false; // Flag to track if any employees are found for the specified cityOrTown
        int size = employeeArray.size; 
        for (int i = 0; i < size; i++) {
            Employee employee = employeeArray.employees[i];
            // Check if the employee is not null and their cityOrTown matches the specified cityOrTown
            if (employee != null && employee.getCityOrTown().equals(cityOrTown)) {
                employeeArray.employees[i] = null; 
                found = true; 
            }
        }
        if (found) {
            return "All employees in " + cityOrTown + " have been deleted.\n";
        } else {
            return "No employees in " + cityOrTown + " found.\n";
        }
    }
}
