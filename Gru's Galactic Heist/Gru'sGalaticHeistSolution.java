import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine(); 
        List<Planet> planets = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String line = scanner.nextLine().trim();
            String[] parts = line.split(" ");
            long x = Long.parseLong(parts[0]);
            String a = parts[1];
            planets.add(new Planet(x, a));
        }
        String C = scanner.nextLine().trim();
        long P = Long.parseLong(scanner.nextLine().trim());
        long D = Long.parseLong(scanner.nextLine().trim());
        List<Long> selected = new ArrayList<>();
        for (Planet p : planets) {
            if (p.a.equals(C)) {
                selected.add(p.x);
            }
        }
        Collections.sort(selected);
        int left = 0;
        long currentDistance = 0;
        int maxCount = 0;

        for (int right = 0; right < selected.size(); right++) {
            if (right == left) {
                currentDistance = Math.abs(selected.get(right) - P);
            } else {
                currentDistance += Math.abs(selected.get(right) - selected.get(right - 1));
            }
            while (currentDistance > D) {
                currentDistance -= Math.abs(selected.get(left + 1) - selected.get(left));
                left++;
            }
            int windowSize = right - left + 1;
            if (windowSize > maxCount) {
                maxCount = windowSize;
            }
        }
        System.out.println(maxCount);
    }

    static class Planet {
        long x;
        String a;
        Planet(long x, String a) {
            this.x = x;
            this.a = a;
        }
    }
}
