import java.util.Scanner;

class Palindrome {
   public static void main(String[] args) {
   //Create scanner object
   Scanner input = new Scanner(System.in);
   
   //Input
   System.out.println("Enter a number:");
   String num = input.next();
   
   //Palindrome
   String reverse = "";
      for(int i = num.length() - 1;i >= 0; i--) {
         reverse += num.charAt(i);
      } 
     
//.equals checks the content of a string instead of comparing
//the string character by character
      if (num.equals(reverse)) {
         System.out.print(num + " is a Palindrome.");
      }  else {
         System.out.print(num + " is NOT a Palindrome.");
      } 
           
   }
}
