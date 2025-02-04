import java.util.*;

public class AsteroidMiner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int F = scanner.nextInt();
        Asteroid[] asteroids = new Asteroid[n];
        for (int i = 0; i < n; i++) {
            int resources = scanner.nextInt();
            int fuelCost = scanner.nextInt();
            asteroids[i] = new Asteroid(resources, fuelCost);
        }

        Arrays.sort(asteroids, (a, b) -> Double.compare(b.efficiency(), a.efficiency()));
        int totalResources = 0;
        int remainingFuel = F;
        for (Asteroid asteroid : asteroids) {
            if (remainingFuel >= asteroid.fuelCost) {
                totalResources += asteroid.resources;
                remainingFuel -= asteroid.fuelCost;
            }
        }
        System.out.println(totalResources);
        scanner.close();
    }
    static class Asteroid {
        int resources;
        int fuelCost;

        Asteroid(int resources, int fuelCost) {
            this.resources = resources;
            this.fuelCost = fuelCost;
        }
        double efficiency() {
            return (double) resources / fuelCost;
        }
    }
}
