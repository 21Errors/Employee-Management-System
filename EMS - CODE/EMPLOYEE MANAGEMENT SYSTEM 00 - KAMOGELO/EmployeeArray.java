public class EmployeeArray {
    public Employee[] employees; 
    public int size;
    public final int MAX_SIZE = 15;

    // Constructor to initialize the array and size
    public EmployeeArray() {
        employees = new Employee[MAX_SIZE]; 
        size = 0; 
    }

    // Method to add an employee to the array
    public void addEmployee(Employee employee) {
        if (size < MAX_SIZE) { 
            employees[size] = employee; 
            size++; 
        } else {
            System.out.println("Error: Array is full"); 
        }
    }

    // Method to update an employee by ID
    public void updateEmployee(String id) {
        boolean found = false; 
       
        // Iterate over the array to find the employee with the specified ID
        for (int i = 0; i < size; i++) {
            if (employees[i] != null && employees[i].getId().equals(id)) {
                found = true; 
                employees[i] = null; 
                System.out.println("Employee with ID " + id + " has been deleted.");
                break;
            }
        }
        
        if (!found) {
            System.out.println("Error: Employee with ID " + id + " not found."); 
        }
    }
}
