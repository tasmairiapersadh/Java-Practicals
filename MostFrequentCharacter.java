import java.util.Scanner;

class MostFrequent {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = input.nextLine(); //full sentence
        mostFrequentChar(sentence);
        input.close();
    }
  
    public static void mostFrequentChar(String sentence) {
        sentence = sentence.toLowerCase();
        int[] letters = new int[26];

        for (int i = 0; i < sentence.length(); i++) {
            char c = sentence.charAt(i);
            if (c >= 'a' && c <= 'z') {
                letters[c - 'a']++;
            }
        }
      
        int CountHighest = 0;
        for (int i = 0; i < 26; i++) {
            if (letters[i] > CountHighest) {
                CountHighest = letters[i];
            }   
        }

        String list = "Most frequent character(s): ";
        for (int i = 0; i < 26; i++) {
            if (letters[i] == CountHighest && CountHighest > 0) {
                char c = (char) (i + 'a');
                list += "\"" + c + "\" ";
            }
        }
    
        System.out.print(list);  
    }
}
