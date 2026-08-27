 // Import the Scanner class
import java.util.Scanner;

class Display {
   public static void main(String[] args) {
      // Created the Scanner object
      Scanner input = new Scanner(System.in);
      
      // Prompt user for number
      System.out.print("Enter a number of values: ");
      int num = input.nextInt();
      //Declare array
      double[] values = new double[num];
         
         //Take input
         for(int i = 0; i < values.length; i++) {
            System.out.print("Enter value " + (i+1) + ": ");
            values[i] = input.nextDouble();   
         }
      
         //Display
         for(int i = values.length - 1; i >= 0; i--) { 
            if (i != 0) {
               System.out.print(values[i] + ",");
            } else {
               System.out.print(values[i]);
            }
         }
      
      }
}