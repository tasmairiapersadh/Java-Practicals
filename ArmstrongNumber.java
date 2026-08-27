//Import scanner
import java.util.Scanner;

class Armstrong {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      
      //Input
      System.out.print("Enter a number: ");
      int num = input.nextInt();   
      int original = num;          
      int total = 0;

      // count digits
      int length = 0;
      int temp = num;
      while (temp > 0) {
         length++;
         temp /= 10; //removes the last digit of temp
      } //Counts the number of digits

      // calculate sum of digits^length
      //Work from the back and remove digits as you go through the number
      temp = num;
      while (temp > 0) {
         int digit = temp % 10;    // get last digit
         int power = 1;
            for (int i = 0; i < length; i++) {
               power *= digit;        //Add the digit to the power of the total
         }
         total += power;
         temp /= 10;               // remove last digit
      }

      // check Armstrong
      if (total == original) {
         System.out.println(original + " is an Armstrong Number.");
      } else {
         System.out.println(original + " is NOT an Armstrong Number.");
      }
   }
}