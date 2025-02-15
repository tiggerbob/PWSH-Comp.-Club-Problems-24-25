import java.util.Scanner;

public class Solution4 {
    private static final String VOWELS = "aeiou";
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine().trim();
        int L = input.length();
        
        int[] freq = new int[26];
        for (char c : input.toCharArray()) {
            freq[c - 'a']++;
        }
        
        int V = 0;
        int P_v = 0;
        for (char v : VOWELS.toCharArray()) {
            int cnt = freq[v - 'a'];
            V += cnt;
            P_v += cnt / 2;
        }
        
        int P_total = 0, P_cons = 0;
        for (int i = 0; i < 26; i++) {
            P_total += freq[i] / 2;
            char c = (char) (i + 'a');
            if (VOWELS.indexOf(c) == -1) {  // consonant
                P_cons += freq[i] / 2;
            }
        }
        
        int ans = 0;
        
        int maxPossible = Math.min(V, L / 3);
        
        for (int x = maxPossible; x >= 2; x--) {
            if (V < x || V > 3 * x) continue; 
            boolean possible = false;
            for (int a = 0; a <= x; a++) { 
                for (int b = 0; b <= x - a; b++) { 
                    int c = x - a - b; 
                    if (a + 2 * b + 3 * c == V) {
                        if (a <= P_cons && (b + c) <= P_v && (3 * x) <= L) {
                            possible = true;
                            break;
                        }
                    }
                }
                if (possible) break;
            }
            if (possible) {
                ans = x;
                break;
            }
        }
        
        if (ans == 0 && V > 0) {
            int cost;
            if (V % 2 == 1) {
                cost = Math.max(V, 3);
                boolean canForm = true;
                if (V == 1) {
                    if (P_cons < 1) canForm = false;
                } else {
                    boolean hasPair = false;
                    for (char v : VOWELS.toCharArray()) {
                        if (freq[v - 'a'] >= 2) { 
                            hasPair = true; 
                            break; 
                        }
                    }
                    if (!hasPair) canForm = false;
                }
                if (cost <= L && canForm) ans = 1;
            } else { //

            	int vowelTypeCount = 0;
                for (char v : VOWELS.toCharArray()) {
                    if (freq[v - 'a'] > 0) {
                        vowelTypeCount++;
                    }
                }

                if (vowelTypeCount == 1) {
                    cost = V;
                    if (cost < 3) {
                        cost = 3;
                    }
                } else {
                    cost = V + 1;
                }
                boolean hasPair = false;
                for (char v : VOWELS.toCharArray()) {
                    if (freq[v - 'a'] >= 2) { 
                        hasPair = true; 
                        break; 
                    }
                }
                if (cost <= L && hasPair) ans = 1;
            }
        }
        
        System.out.print(ans);
    }
}
