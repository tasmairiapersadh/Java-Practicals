import java.util.Scanner;
import java.time.Month;

class Birthday {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter ID number: ");
        String ID = input.next(); 
        displayBirthday(ID);
    }
    
    public static void displayBirthday(String idNumber) {
        // Day
        String day = idNumber.substring(4,6);
        
        // Month
        int month = Integer.parseInt(idNumber.substring(2,4)); //converts "01" to 1
        String strmonth = Month.of(month).name().toLowerCase();
        strmonth = strmonth.substring(0,1).toUpperCase() + strmonth.substring(1);
        
        // Year
        int year = Integer.parseInt(idNumber.substring(0,2));
        if (year <= 26) year += 2000;
        else year += 1900;
        
        // Output
        System.out.println("You were born on: " + day + " " + strmonth + " " + year);
    }    
}