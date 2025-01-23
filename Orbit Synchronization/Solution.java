import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int N = s.nextInt();
        int[] orbits = new int[N];

        for (int i = 0; i < N; i++) {
            orbits[i] = s.nextInt();
        }

        int total = 1;
        for (int i = 0; i < N; i++)
            total = lcm(total, orbits[i]);

        System.out.println(total);

        String individualCycles = "";

        for (int i = 0; i < N; i++)
            individualCycles += total / orbits[i] + " ";

        System.out.println(individualCycles.trim());
    }

    public static int gcd(int a, int b) {
        if (a == 0 || b == 0) {
            return a + b;
        } else {
            int max = Math.max(Math.abs(a), Math.abs(b));
            int min = Math.min(Math.abs(a), Math.abs(b));
            return gcd(max % min, min);
        }
    }

    public static int lcm(int a, int b) {
        if (a == 0 || b == 0)
            return 0;
        else {
            int gcd = gcd(a, b);
            return Math.abs(a * b) / gcd;
        }
    }
}
