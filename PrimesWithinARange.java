import java.util.Scanner;

class PrimeRange {
   public static void main(String[] args) {
   //Create scanner object
   Scanner input = new Scanner(System.in);
   
   int count = 0;
   int highest = -999;
   int lowest = 999;
   
   System.out.print("Enter starting number: ");
   int start = input.nextInt();
   System.out.print("Enter ending number: ");
   int end = input.nextInt();
   System.out.println("Prime Numbers");
   
   int countFactors = 0;
      for(int i = start;i <= end; i++) {
            countFactors = 0;
               for(int j = 1;j <= i; j++) {
                  if (i % j == 0) {
                     countFactors++;
                  }
               }
            
               if (countFactors == 2) {
                 System.out.println(i);
                 count++;
                  if (i > highest) {
                     highest = i;
                  }
                  if (i < lowest) {
                     lowest = i;
                  }
               }      
      }
   
   System.out.println("Total Prime Numbers: " + count);
   System.out.println("Smallest Prime: " +  lowest); 
   System.out.println("Largest Prime: " +  highest);  
   }   
}