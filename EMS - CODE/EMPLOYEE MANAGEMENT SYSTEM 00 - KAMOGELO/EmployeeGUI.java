import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class EmployeeGUI extends JFrame implements ActionListener {

    //createing instances, to be able to call methods in these classes
    private EmployeeArray array = new EmployeeArray();
    private EmployeeTitleSearcher title = new EmployeeTitleSearcher(array);
    private EmployeeGenderDisplayer genderDisplayer = new EmployeeGenderDisplayer(array);
    private PayrollSystem pSystem = new PayrollSystem(array);
    private EmployeeCityOrTownCounter EmpCityOrTownObj = new EmployeeCityOrTownCounter(array);
    private EmployeeDetailsDisplayer display = new EmployeeDetailsDisplayer(array);
    private EmployeeFileReader read = new EmployeeFileReader();
    
    private JTextArea textArea;
    
    public EmployeeGUI() {
        super("Employee GUI");
        setLayout(new BorderLayout());
        
        textArea = new JTextArea();
        add(new JScrollPane(textArea), BorderLayout.CENTER);
        
        //creating a button panel
        
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(8, 1));
        
        //adding buttons to the panel
        JButton readButton = new JButton("Read employee file");
        readButton.addActionListener(this);
        buttonPanel.add(readButton);
        
        JButton searchButton = new JButton("Search by title");
        searchButton.addActionListener(this);
        buttonPanel.add(searchButton);
        
        JButton salaryButton = new JButton("Display salary by ID");
        salaryButton.addActionListener(this);
        buttonPanel.add(salaryButton);
        
        JButton genderButton = new JButton("Display employees by gender");
        genderButton.addActionListener(this);
        buttonPanel.add(genderButton);
        
        JButton detailsButton = new JButton("Display all employee details");
        detailsButton.addActionListener(this);
        buttonPanel.add(detailsButton);
        
        JButton grossSalaryButton = new JButton("Display all employees gross salary");
        grossSalaryButton.addActionListener(this);
        buttonPanel.add(grossSalaryButton);
        
        JButton deleteButton = new JButton("Delete employees per city or town");
        deleteButton.addActionListener(this);
        buttonPanel.add(deleteButton);
        
        JButton displayCityOrTownButton = new JButton("Display number of employees in city or town");
        displayCityOrTownButton.addActionListener(this);
        buttonPanel.add(displayCityOrTownButton);
        add(buttonPanel, BorderLayout.EAST);
        
        setSize(800, 600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();
        
        //handle buttons clicks based on command
        
        if (command.equals("Read employee file")) {
            read.readEmployeeFile(array, "employee.txt");
            textArea.append("Employee file read\n");
        } else if (command.equals("Search by title")) {
            String titleString = JOptionPane.showInputDialog(this, "Enter title to search for:");
            textArea.append(title.searchByTitle(titleString));
        } else if (command.equals("Display salary by ID")) {
            String idString = JOptionPane.showInputDialog(this, "Enter ID to display salary for:");
            textArea.append( pSystem.displaySalaryById(idString));
        } else if (command.equals("Display employees by gender")) {
            String genderString = JOptionPane.showInputDialog(this, "Enter gender to display employees for:");
            
            textArea.append(genderDisplayer.displayAllEmployeesByGender(genderString));
        } else if (command.equals("Display all employee details")) {
           
            textArea.append(display.displayAllEmployeeDetails());
        } else if (command.equals("Display all employees gross salary")) {
            
            textArea.append(pSystem.displayAllEmployeesGrossSalary());
        } else if (command.equals("Delete employees per city or town")) {
            String cityOrTownString = JOptionPane.showInputDialog(this, "Enter city or town to delete employees from:");
            
            textArea.append(EmpCityOrTownObj.deleteEmployeesPerCityOrTown(cityOrTownString));
        } else if (command.equals("Display number of employees in city or town")) {
            String cityOrTownString = JOptionPane.showInputDialog(this, "Enter city or town to display number of employees in:");
            
            textArea.append(EmpCityOrTownObj.displayNumberOfEmployeesInCityOrTown(cityOrTownString));
        }
    }
    //main method inorder to run the GUI application
    public static void main(String[] args) {
        new EmployeeGUI();
    }
}

