import java.util.Scanner;

public class Solution {
    private static final char[] VOWELS = {'a', 'e', 'i', 'o', 'u'};
         
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        
    	  input = input.toLowerCase();
        
        // array for character counts (a-z)
        int[] charCount = new int[26];
        for (char c : input.toCharArray()) {
            charCount[c - 'a']++;
        }
        
        int palindromeCount = 0;
        
        // first use vowels 
        for (char vowel : VOWELS) {
            int vowelIndex = vowel - 'a';
            while (charCount[vowelIndex] > 0) {
                if (canFormPalindrome(charCount)) {
                    formPalindrome(charCount);
                    palindromeCount++;
                } else {
                    break;
                }
            }
        }
        
        //use remaining characters
        while (canFormPalindrome(charCount)) {
            formPalindrome(charCount);
            palindromeCount++;
        }
        
        System.out.print(palindromeCount);

    }
    
    private static boolean canFormPalindrome(int[] charCount) {
        // need at least one character with count >= 2 for ends
        // and at least one additional character (for middle)
        boolean hasPairs = false;
        int totalChars = 0;
        
        for (int count : charCount) {
            if (count >= 2) {
                hasPairs = true;
            }
            totalChars += count;
        }
        
        return hasPairs && totalChars >= 3;
    }
    
    private static void formPalindrome(int[] charCount) {
        // find first character with count >= 2 for the ends
        int endCharIndex = -1;
        for (int i = 0; i < charCount.length; i++) {
            if (charCount[i] >= 2) {
                endCharIndex = i;
                break;
            }
        }
        
        // use two of the end character
        charCount[endCharIndex] -= 2;
        
        // use one character for the middle
        for (int i = 0; i < charCount.length; i++) {
            if (i != endCharIndex && charCount[i] > 0) {
                charCount[i]--;
                break;
            }
        }
    }
}
