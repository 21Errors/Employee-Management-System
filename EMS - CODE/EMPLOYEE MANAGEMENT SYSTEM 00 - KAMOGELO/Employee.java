public class Employee {

    // employee attributes
    private String id;
    private String firstName;
    private String lastName;
    private String cityOrTown;
    private String dateHired;
    private String address;
    private String employeeTitle;
    private double hoursWorked;
    private double rateOfPay;
    private int leaveDays;
    private boolean carAllowance;
    private double monthlyGratuity;
    public final double taxRate = 0.2;
    private String gender;
    
    
    //non-parameter and a constructor with parameters
    
    public Employee(){
    
    }

    public Employee(String id, String firstName, String lastName, String gender, String address,String cityOrTown, String employeeTitle,
                    String dateHired, double hoursWorked, double rateOfPay, int leaveDays,
                    boolean carAllowance, double monthlyGratuity) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.address = address;
        this.cityOrTown = cityOrTown;
        this.employeeTitle = employeeTitle;
        this.dateHired = dateHired;
        this.hoursWorked = hoursWorked;
        this.rateOfPay = rateOfPay;
        this.leaveDays = leaveDays;
        this.carAllowance = carAllowance;
        this.monthlyGratuity = monthlyGratuity;
        
    }
    
    //mutators and accessors 
    
   

    public String getId() {
        return id;
    }
    
    public void setId(String id){
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }
    
    public void setFirstName(String firstName){
      this.firstName = firstName;
    
    }
    public String getLastName(){
      return lastName;
    
    }
    public void setLastName(String lastName){
      this.lastName = lastName;
      
    }
    

    public String getGender() {
        return gender;
    }
    
    public void setGender(String gender){
        this.gender = gender;
    }


    public String getAddress() {
        return address;
    }
    
    public void setAddress(String id){
        this.id = id;
    }
    
    public String getCityOrTown(){
         return cityOrTown;
    }
    
    public void setCityOrTown(String cityOrTown){
         this.cityOrTown = cityOrTown;
    }

    public String getEmployeeTitle() {
        return employeeTitle;
    }
    
    public void setEmployeeTitle(String employeeTitle){
        this.employeeTitle = employeeTitle;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }
    
    public void setHoursWorked(double hoursWorked){
        this.hoursWorked = hoursWorked;
    }


    public double getRateOfPay() {
        return rateOfPay;
    }
    
    public void setRateOfPay(double rateOfPay){
        this.rateOfPay = rateOfPay;
    }

    public int getLeaveDays() {
        return leaveDays;
    }
    
    public void setLeaveDays(int leaveDays){
        this.leaveDays = leaveDays;
    }


    public boolean hasCarAllowance() {
        return carAllowance;
    }
    
    public void setCarAllowance(boolean carAllowance){
        this.carAllowance = carAllowance;
    }


    public double getMonthlyGratuity() {
        return monthlyGratuity;
    }
    
    public void setMonthlyGratuity(double monthlyGratuity){
        this.monthlyGratuity = monthlyGratuity;
    }

    
    public String getDateHired(){
        return dateHired;
    }

    public void setDateHired (String dateHired){
        this.dateHired = dateHired;
    }
    
    public String getFullName(){
      return firstName+ " " + lastName;
    
    } 
    //toString method
    
    @Override
   public String toString() {
      return
              
              "\n id= " + id + "\n" +
              " firstName= " + firstName + "\n" +
              " lastName= " + lastName + "\n" +
              " gender= " + gender + "\n" +
              " address= " + address + "\n" +
              " cityOrTown= " + cityOrTown + "\n" +
              " employeeTitle= " + employeeTitle + "\n" +
              " dateHired= " + dateHired + "\n" +
              " hoursWorked= " + hoursWorked + "\n" +
              " City or Town= " + cityOrTown + "\n" +
              " rateOfPay= " + rateOfPay + "\n" +
              " leaveDays= " + leaveDays + "\n" +
              " carAllowance= " + carAllowance + "\n" +
              " monthlyGratuity= " + monthlyGratuity + "\n"
              
              ;
   }  

  
}

