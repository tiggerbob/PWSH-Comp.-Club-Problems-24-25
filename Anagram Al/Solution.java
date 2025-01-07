import java.util.Scanner;

public class Solution4 {
    
    public static void main(String[] args) {

    	Scanner sc = new Scanner(System.in);
    	
    	int iter = sc.nextInt();
    	sc.nextLine();
    	String word1 = "";
    	String word2 = ""; 
    	boolean anagram;
    	int count = 0;
    	
    	for(int i = 0; i < iter; i++) {
    		Scanner scan = new Scanner(sc.nextLine());
    		word1 = scan.next();
    		word2 = scan.next();
    		anagram = true;
    		
    		 int[] letterCount = new int[26];

	        // count appearance of each letter in first string
	        for (int n = 0; n < word1.length(); n++)
	        	letterCount[word1.charAt(n) - 'a']++;

	        // subtract appearance of each letter in second string
	        for (int n = 0; n < word2.length(); n++)
	        	letterCount[word2.charAt(n) -'a']--;

	        // if all values are 0 then contain then they are anagrams
	        for (int n : letterCount) {
	            if (n != 0)
	                anagram = false;
	        }
	        
	        if(anagram)
	        	count++;
    	}
    	
    	System.out.println(count);
    }
}
