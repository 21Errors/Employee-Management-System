public class EmployeeTitleSearcher {

    private EmployeeArray employeeArray; 
    private String title; 

    public EmployeeTitleSearcher(EmployeeArray employeeArray) {
        this.employeeArray = employeeArray;
    }

    
    public String searchByTitle(String title) {
        StringBuilder result = new StringBuilder(); // StringBuilder to store the search results
        boolean found = false; 
        for (int i = 0; i < employeeArray.size; i++) {
            Employee employee = employeeArray.employees[i];
            if (employeeArray.employees[i] != null && employee.getEmployeeTitle().equals(title)) {
                
                found = true;
                result.append(employee.toString()).append("\n------------------------------------------\n"); // Append employee information to the result
            }
        }

        if (!found) {
            result.append("No employees found with the title: ").append(title);
        }
        return result.toString(); // Return the search results as a string
    }
}
