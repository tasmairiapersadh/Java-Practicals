import java.util.Scanner;

class Reversal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String str = input.nextLine();  
        String reverse = reverseSentence(str);
        System.out.println("Reversed sentence: " + reverse);
    }

    public static String reverseSentence(String str) {
        //Punctuation
        char lastChar = str.charAt(str.length() - 1);
        String punctuation = "";
        if (lastChar == '.' || lastChar == '?' || lastChar == '!') {
            punctuation = String.valueOf(lastChar);
            str = str.substring(0, str.length() - 1);
        }
        String[] words = str.split(" ");

        String reversed = "";
         for (int i = words.length - 1; i >= 0; i--) {
               reversed += words[i];   
                  if (i > 0) {
                     reversed += " ";
                  }
         }

         //Add punctuation back
         reversed += punctuation;

         //eturn result
         return reversed;    
      }
}
