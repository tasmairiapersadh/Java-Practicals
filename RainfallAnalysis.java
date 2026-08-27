import java.util.Scanner;

class RainfallDataAnalysis {
   public static void main(String[] args) {
   //Create scanner object
   Scanner input = new Scanner(System.in);
   
   int count = 0;
   double total = 0.0;
   double highest = -999.0;
   double lowest = 999.0;
   
   System.out.println("Enter rainfall amount (-1 to stop):");
   System.out.print("");
   double rainfall = input.nextDouble();
   
      while (rainfall != -1) {
         count++;
         total += rainfall;
            if (rainfall > highest) {
               highest = rainfall;
            }
            if (rainfall < lowest) {
               lowest = rainfall;
            }
         System.out.print("");
         rainfall = input.nextDouble();
      }
   
   double average = total / count; 
   System.out.println("Rainfall Summary");
   System.out.println("Total Readings: " + count);
   System.out.println("Total Rainfall: " + total + " mm");
   System.out.println("Average Rainfall: " +  average + " mm");
   System.out.println("Highest Rainfall: " +  highest + " mm");
   System.out.println("Lowest Rainfall: " +  lowest + " mm");   
   }   
}