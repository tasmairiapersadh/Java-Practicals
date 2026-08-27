// Import the Scanner class
import java.util.Scanner;

class Sequences {
   public static void main(String[] args) {
      // Created the Scanner object
      Scanner input = new Scanner(System.in);
      
      //Get sizes
      System.out.print("Enter the size of array: ");
      int size = input.nextInt();
      int[] array = new int[size];
      
      //Populate array
         int value = 0;
         for (int i = 0; i < array.length; i++) {
            System.out.print("Enter value " + (i+1) + " of array 1: ");
            value = input.nextInt();
            array[i] = value;
         }
      
      //Find sequences
        int bestStart = -1;
        int bestEnd = -1; 
        int bestLength = 0;

        int i = 1; // start from index 1 (2nd element)
        while (i < size - 1) { 
            int j = i;
            //j is used to move through the loop
            //i is the beginning of the sequence we are checking

            //Find a sequence of equal values
            while (j < size && array[j] == array[i]) {
                j++; //Keep incrementing j since the value is the same
            }

            int length = j - i;//Length of the sequence

            // Check: at least 2 elements, and before/after is smaller
            if (length >= 2 && array[i-1] < array[i] && array[j] < array[i]) {
                if (length > bestLength) {
                    bestLength = length;
                    bestStart = i;
                    bestEnd = j - 1;
                }
            }

            i = j; // move to next sequence
        }
      
     //Display
     if (bestLength > 0) {
            System.out.println("Longest sequence found:");
            System.out.println("Start index: " + bestStart);
            System.out.println("End index: " + bestEnd);
            System.out.println("Length: " + bestLength);
        } else {
            System.out.println("No valid sequence found.");
        }

   }
}