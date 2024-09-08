import java.util.Scanner;

public class Arithimatic {

public static void main(String args[]){

   int counter = 0;

   Scanner scanner = new Scanner(System.in);
   
   System.out.print("Please enter your first number: ");
   int num1 = scanner.nextInt();
   counter ++;
   
   System.out.print("Please enter your second number: ");
   int num2 = scanner.nextInt();
   counter ++;
   
   System.out.print("Please enter your third number: ");
   int num3 = scanner.nextInt();
   counter++;
   
   System.out.print("Please enter your fourth number: ");
   int num4 = scanner.nextInt();
   counter++;
   
   System.out.print("Please enter your fifth number: ");
   int num5 = scanner.nextInt();
   counter++;
   
   System.out.print("Please enter your sixth number: ");
   int num6 = scanner.nextInt();
   counter++;
   
   System.out.print("Please enter your seventh number: ");
   int num7 = scanner.nextInt(); 
   counter++;
   
   System.out.print("Please enter your eighth number: ");
   int num8 = scanner.nextInt();
   counter++;
   
   System.out.print("Please enter your nineth number: ");
   int num9 = scanner.nextInt();
   counter++;
   
   System.out.print("Please enter your last number: ");
   int num10 = scanner.nextInt();
   counter++;
   
   int average;
   
   average = (num1 + num2 + num3+num4+num5+num6+num7+num8+num9+num10)/ counter;
   
   System.out.println("The average of your numbers is "+ average);
   
   }

}