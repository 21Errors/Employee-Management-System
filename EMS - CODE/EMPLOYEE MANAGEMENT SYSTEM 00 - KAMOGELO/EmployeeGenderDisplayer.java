public class EmployeeGenderDisplayer {

    private EmployeeArray employeeArray;

    public EmployeeGenderDisplayer(EmployeeArray employeeArray) {
        this.employeeArray = employeeArray;
    }
    
   
    public String displayAllEmployeesByGender(String gender) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < employeeArray.size; i++) {
            Employee employee = employeeArray.employees[i];
            if (employeeArray.employees[i] != null && employee.getGender().equals(gender)) {
                result.append("\n---------------------------------\n");
                result.append(employee.toString()).append("\n");
            }
        }
        return result.toString();
    }
}
