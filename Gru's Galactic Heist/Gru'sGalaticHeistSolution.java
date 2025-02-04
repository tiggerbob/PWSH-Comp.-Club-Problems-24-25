import java.util.*;

public class GalacticHeist {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        List<Integer> positions = new ArrayList<>();
        List<String> attributes = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int position = sc.nextInt();
            String attribute = sc.next();
            sc.nextLine();
            positions.add(position);
            attributes.add(attribute);
        }
        String targetCriterion = sc.next();
        int startPos = sc.nextInt();
        int maxDist = sc.nextInt();
        
        List<Integer> filteredPlanets = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (attributes.get(i).equals(targetCriterion)) {
                filteredPlanets.add(positions.get(i));
            }
        }
        if (filteredPlanets.isEmpty()) {
            System.out.println(0);
            return;
        }
        Collections.sort(filteredPlanets);
        int maxCount = 0;
        int startIdx = 0;
        int currentDistance = 0;
        for (int endIdx = 0; endIdx < filteredPlanets.size(); endIdx++) {
            currentDistance += Math.abs(filteredPlanets.get(endIdx) - startPos);
            while (currentDistance > maxDist && startIdx <= endIdx) {
                currentDistance -= Math.abs(filteredPlanets.get(startIdx) - startPos);
                startIdx++;
            }
            maxCount = Math.max(maxCount, endIdx - startIdx + 1);
        }
        System.out.println(maxCount);
    }
}
