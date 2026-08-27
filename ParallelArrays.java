// Import the Scanner class
import java.util.Scanner;

class Calculations {
   public static void main(String[] args) {
      // Created the Scanner object
      Scanner input = new Scanner(System.in);
      
      //Get sizes
      System.out.print("Enter the size of both arrays: ");
      int size = input.nextInt();
      int[] array1 = new int[size];
      int[] array2 = new int[size];
      
      //Populate arrays
         int value = 0;
         for (int i = 0; i < array1.length; i++) {
            System.out.print("Enter value " + (i+1) + " of array 1: ");
            value = input.nextInt();
            array1[i] = value;
         }
         for (int i = 0; i < array2.length; i++) {
            System.out.print("Enter value " + (i+1) + " of array 2: ");
            value = input.nextInt();
            array2[i] = value;
         }
         
       //Calculations
       //1.
         int sum = 0;
         for (int i = 0; i < array1.length; i++) {
            sum = array1[i] + array2[i];
            array1[i] = sum;  
         }
       //2.
         int difference = 0;
         for (int i = 0; i < array1.length; i++) {
            difference = array1[i] - array2[i];
            array2[i] = difference;  
         }
       //3.
         difference = 0;
         for (int i = 0; i < array1.length; i++) {
            difference = array1[i] - array2[i];
            array1[i] = difference;  
         }
      
      //Display
      System.out.println("Array 1:");
         for (int i = 0; i < array1.length; i++) {
            System.out.println(array1[i]);
         }
      System.out.println("Array 2:");
         for (int i = 0; i < array2.length; i++) {
            System.out.println(array2[i]);
         }
      System.out.println("The data stored in each array has swapped!");

         
         
         
   }
}


