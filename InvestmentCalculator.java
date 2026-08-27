//import scanner
import java.util.Scanner;

class Investment {
   public static void main(String[] args) {
   //Create scanner object
   Scanner input = new Scanner(System.in);
   
   //Input
   System.out.print("Enter number of years: ");
   int t = input.nextInt();
   System.out.print("Enter principal amount: ");
   double P = input.nextDouble();
   System.out.print("Enter annual interest rate (eg. 5%): ");
   double r = input.nextDouble() / 100;
   
   double A = (P * Math.pow(Math.E, r * t));
   System.out.println("Amount: R" + A);
   }
}