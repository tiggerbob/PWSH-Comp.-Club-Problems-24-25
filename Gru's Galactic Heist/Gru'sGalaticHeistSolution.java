import java.util.*;

public class GalacticHeist {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Read number of planets
        int n = sc.nextInt();
        sc.nextLine();  // Consume the newline after reading the number of planets
        
        List<int[]> planets = new ArrayList<>();
        
        // Reading planets' position and attribute
        for (int i = 0; i < n; i++) {
            int position = sc.nextInt();
            String attribute = sc.next();
            sc.nextLine(); // Consume the newline after reading the attribute
            
            // Store planet position and attribute
            planets.add(new int[]{position, attribute});
        }
        
        // Read target attribute, start position, and maximum travel distance
        String targetCriterion = sc.next();
        int startPos = sc.nextInt();
        int maxDist = sc.nextInt();
        
        // Step 1: Filter planets that match the target criterion
        List<Integer> filteredPlanets = new ArrayList<>();
        for (int[] planet : planets) {
            if (planet[1].equals(targetCriterion)) {
                filteredPlanets.add(planet[0]);
            }
        }
        
        // If there are no matching planets, return 0
        if (filteredPlanets.isEmpty()) {
            System.out.println(0);
            return;
        }
        
        // Step 2: Sort the filtered planets based on their position
        Collections.sort(filteredPlanets);
        
        // Step 3: Use two pointers to find the maximum number of planets Gru can collect
        int maxCount = 0;
        int startIdx = 0;
        int currentDistance = 0;
        
        for (int endIdx = 0; endIdx < filteredPlanets.size(); endIdx++) {
            // Calculate the distance to the current planet from the start position
            currentDistance += Math.abs(filteredPlanets.get(endIdx) - startPos);
            
            // While the current total distance exceeds the allowed distance, move the start pointer
            while (currentDistance > maxDist && startIdx <= endIdx) {
                currentDistance -= Math.abs(filteredPlanets.get(startIdx) - startPos);
                startIdx++;
            }
            
            // Update the max count of planets
            maxCount = Math.max(maxCount, endIdx - startIdx + 1);
        }
        
        // Output the result
        System.out.println(maxCount);
    }
}
