public class EmployeeDetailsDisplayer {
    private EmployeeArray employeeArray; // Reference to an instance of EmployeeArray
    
    public EmployeeDetailsDisplayer(EmployeeArray employeeArray) {
        this.employeeArray = employeeArray; // Initialize the employeeArray reference
    }
    
   
    public String displayAllEmployeeDetails() {
        StringBuilder result = new StringBuilder(); // StringBuilder to build the result string
        for (int i = 0; i < employeeArray.size; i++) {
            Employee employee = employeeArray.employees[i];
           
            if (employeeArray.employees[i] != null) {
                result.append(employee.toString()).append("\n"); 
            }
            result.append("\n---------------------------------\n"); 
        }
        return result.toString(); 
    }
}
