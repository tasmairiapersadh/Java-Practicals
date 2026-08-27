//Write a program that accepts 6 real numbers as input and displays true if the numbers
//are strictly ascending or descending (with respect to the order they were entered) or false
//otherwise.

//Import scanner
import java.util.Scanner;

class Order {
   public static void main(String[] args) {
   //Create scanner object
   Scanner input = new Scanner(System.in);
   
   //Prompt user for numbers
   System.out.print("Enter first number: ");
   int num1 = input.nextInt();
   System.out.print("Enter second number: ");
   int num2 = input.nextInt();
   System.out.print("Enter third number: ");
   int num3 = input.nextInt();
   System.out.print("Enter fourth number: ");
   int num4 = input.nextInt();
   System.out.print("Enter fifth number: ");
   int num5 = input.nextInt();
   System.out.print("Enter sixth number: ");
   int num6 = input.nextInt();
   
   //Determine if ascending or descending
   if ((num1 < num2 && num2 < num3 && num3 < num4 && num4 < num5 && num5 < num6) || (num1 > num2 && num2 > num3 && num3 > num4 && num4 > num5 && num5 > num6)) {
         System.out.println("True");   
   } else {
         System.out.println("False");
   }
   }
}