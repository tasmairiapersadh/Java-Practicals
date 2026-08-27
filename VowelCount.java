// Import the Scanner class
import java.util.Scanner;

class VowelCount {
   public static void main(String[] args) {
      // Created the Scanner object
      Scanner input = new Scanner(System.in);
      
      // Array to track vowel counts
      //0->a, 1->e, 2->i, 3->o, 4->u
        int[] vowelCount = new int[5];
        
      // Prompt user for message
      System.out.println("Enter your message: ");
      String message = input.next();
      
         //Vowel count
         for (int i = 0; i < message.length(); i++) {
            char ch = Character.toLowerCase(message.charAt(i));
            if (ch == 'a') {
               vowelCount[0]++;
            } else if (ch == 'e') {
               vowelCount[1]++;
            } else if (ch == 'i') {
               vowelCount[2]++;
            } else if (ch == 'o') {
               vowelCount[3]++;
            } else if (ch == 'u') {
               vowelCount[4]++;
            }
         }
      
      // Display results
        System.out.println("Vowel count:");
        System.out.println("a: " + vowelCount[0]);
        System.out.println("e: " + vowelCount[1]);
        System.out.println("i: " + vowelCount[2]);
        System.out.println("o: " + vowelCount[3]);
        System.out.println("u: " + vowelCount[4]);     
      }
}