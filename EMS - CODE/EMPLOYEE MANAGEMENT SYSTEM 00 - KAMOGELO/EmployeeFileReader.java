import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class EmployeeFileReader {
   
    public static void readEmployeeFile(EmployeeArray employeeArray, String fileName) {
    try {
        BufferedReader reader = new BufferedReader(new FileReader(fileName));

        String line;
        while ((line = reader.readLine()) != null) {
            String[] tokens = line.split(","); // Split the line into an array of tokens
            // Extract individual data fields from the tokens array
            String id = tokens[0];
            String firstName = tokens[1];
            String lastName = tokens[2];
            String gender = tokens[3];
            String address = tokens[4];
            String cityOrTown = tokens[5];
            String employeeTitle = tokens[6];
            String dateHired = tokens[7];
            double hoursWorked = Double.parseDouble(tokens[8]);
            double rateOfPay = Double.parseDouble(tokens[9]);
            int leaveDays = Integer.parseInt(tokens[10]);
            boolean carAllowance = Boolean.parseBoolean(tokens[11]);
            double monthlyGratuity = Double.parseDouble(tokens[12]);

            // Create a new Employee object with the extracted data
            Employee employee = new Employee(id, firstName, lastName, gender, address, cityOrTown,
                    employeeTitle, dateHired, hoursWorked, rateOfPay, leaveDays, carAllowance, monthlyGratuity);

            // polymorphisim
            switch (employeeTitle) {
                case "CEO":
                    employeeArray.addEmployee(new CEO(employee)); 
                    break;
                case "Marketing executive":
                    employeeArray.addEmployee(new MarketingExecutive(employee)); 
                    break;
                case "Support staff":
                    employeeArray.addEmployee(new SupportStaff(employee)); 
                    break;
                case "Human resource officer":
                    employeeArray.addEmployee(new HumanResourceOfficer(employee)); 
                    break;
                case "Accounts officer":
                    employeeArray.addEmployee(new AccountsOfficer(employee)); 
                    break;
                case "Temp staff":
                    employeeArray.addEmployee(new TempStaff(employee)); 
                    break;
                case "Finance manager":
                    employeeArray.addEmployee(new FinanceManager(employee)); 
                    break;
                default:
                    employeeArray.addEmployee(employee); // If the title doesn't match any of the above, add the employee object as is
            }
        }

        reader.close(); // Close the file reader

    } catch (IOException e) {
        System.err.println("Error reading from file: " + e.getMessage());
    }
    
    
   }

}


