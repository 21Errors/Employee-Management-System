public class TesterTester{

   public static void main(String[] args){
   
      EmployeeArray array = new EmployeeArray();
      
      Employee employee = new Employee();
      
      EmployeeTitleSearcher title = new EmployeeTitleSearcher(array);

      EmployeeGenderDisplayer genderDisplayer = new EmployeeGenderDisplayer(array);
      
      PayrollSystem pSystem = new PayrollSystem(array);
      
      EmployeeCityOrTownCounter EmpCityOrTownObj = new EmployeeCityOrTownCounter(array);
      
      EmployeeDetailsDisplayer display = new EmployeeDetailsDisplayer(array);
      
      EmployeeFileReader read = new EmployeeFileReader();
      
      System.out.println("-----------------");
      
      read.readEmployeeFile(array, "employee.txt");
      
      //title.searchByTitle("CEO");
      
      //pSystem.displaySalaryById("001");
      
      //genderDisplayer.displayAllEmployeesByGender("Male");
      
      //display.displayAllEmployeeDetails();
      
      //pSystem.displayAllEmployeesGrossSalary();
      
      //EmpCityOrTownObj.deleteEmployeesPerCityOrTown("Gaborone");
      EmpCityOrTownObj.displayNumberOfEmployeesInCityOrTown("Gaborone");
      
      //array.updateEmployee("002");
      
   }


}