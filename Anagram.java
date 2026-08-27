import java.util.Scanner;

class Anagrams {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first string: ");
        String string1 = input.next();  
        System.out.print("Enter second string: ");
        String string2 = input.next();  
        
        if (isAnagram(string1, string2)) {
            System.out.println("\"" + string1 + "\" and \"" 
            + string2 + "\" are anagrams");
        } else {
            System.out.println("\"" + string1 + "\" and \"" 
            + string2 + "\" are not anagrams");
        }   
    }
    
    public static boolean isAnagram(String s1, String s2) {
        // If lengths differ, they can’t be anagrams
        if (s1.length() != s2.length()) return false;

        // Frequency arrays for letters (assuming lowercase a–z)
        int[] freq1 = new int[26];
        int[] freq2 = new int[26];

        // Count characters in s1
        for (int i = 0; i < s1.length(); i++) {
            char c = Character.toLowerCase(s1.charAt(i));
            freq1[c - 'a']++;
        }

        // Count characters in s2
        for (int i = 0; i < s2.length(); i++) {
            char c = Character.toLowerCase(s2.charAt(i));
            freq2[c - 'a']++;
        }

        // Compare arrays using a boolean flag
        Boolean flag = true;
        for (int i = 0; i < 26; i++) {
            if (freq1[i] != freq2[i]) {
                flag = false;
                break;
            }
        }

        return flag;
    }
}
