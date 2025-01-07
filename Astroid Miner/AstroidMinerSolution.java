import java.util.*;

public class AsteroidMiner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the number of asteroids and the total fuel capacity
        int n = scanner.nextInt();
        int F = scanner.nextInt();

        // Create an array to store asteroid information
        Asteroid[] asteroids = new Asteroid[n];

        // Input asteroid data (resources and fuel cost)
        for (int i = 0; i < n; i++) {
            int resources = scanner.nextInt();
            int fuelCost = scanner.nextInt();
            asteroids[i] = new Asteroid(resources, fuelCost);
        }

        // Sort asteroids by their resource-to-fuel ratio in descending order
        Arrays.sort(asteroids, (a, b) -> Double.compare(b.efficiency(), a.efficiency()));

        // Calculate the maximum resources that can be collected
        int totalResources = 0;
        int remainingFuel = F;

        for (Asteroid asteroid : asteroids) {
            if (remainingFuel >= asteroid.fuelCost) {
                totalResources += asteroid.resources;
                remainingFuel -= asteroid.fuelCost;
            }
        }

        // Output the total resources collected
        System.out.println(totalResources);

        scanner.close();
    }

    // Define a class for asteroid with resources and fuel cost
    static class Asteroid {
        int resources;
        int fuelCost;

        Asteroid(int resources, int fuelCost) {
            this.resources = resources;
            this.fuelCost = fuelCost;
        }

        // Calculate the efficiency (resources per unit fuel)
        double efficiency() {
            return (double) resources / fuelCost;
        }
    }
}
