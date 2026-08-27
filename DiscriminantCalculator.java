//import scanner
import java.util.Scanner;

class Discriminant {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);

      //Input
      System.out.print("Enter a: ");
      int a = input.nextInt();
      System.out.print("Enter b: ");
      int b = input.nextInt();
      System.out.print("Enter c: ");
      int c = input.nextInt();

      //Validation
      if (a == 0) {
         System.out.println("Error");
      } else {
      //Calculate discriminant
         double discriminant = (Math.pow(b, 2) - (4 * a * c));

         if (discriminant < 0) {
            System.out.println("Roots are imaginary.");
         } else {
         //Use variable to add to longer string
         //Determine if equal or unequal
            String result = "";
            if (discriminant == 0) {
               result = "equal";
            } else if (discriminant > 0) {
               result = "unequal";
            }
            //Ternary statement 
            System.out.println("Roots are real and " + result);
         }
      }
   }
}
