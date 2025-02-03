import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int maxHits = scan.nextInt();
        int hours = scan.nextInt();

        hourloop: for (int h = 0; h < hours; h++) {
            // hour input
            int lengthMissile = scan.nextInt();
            int xMissile = scan.nextInt();
            int yMissile = scan.nextInt();
            int numAsteroids = scan.nextInt();

            // hour logic
            for (int a = 0; a < numAsteroids; a++) {
                int radiusAsteroid = scan.nextInt();
                int xAsteroid = scan.nextInt(); // center x coord of asteroid idx
                int yAsteroid = scan.nextInt(); // center y coord of asteroid idx

                System.out.println(collision(lengthMissile, xMissile, yMissile, radiusAsteroid, xAsteroid, yAsteroid));

                if (!collision(lengthMissile, xMissile, yMissile, radiusAsteroid, xAsteroid, yAsteroid)) {
                    maxHits--;
                    if (maxHits == 0) {
                        System.out.println(h+1); // solution 1
                        break hourloop;
                    }
                }
            }
        }
        if (maxHits > 0) {
            System.out.println("We made it!"); // solution 2
        }
    }

    private static boolean collision(int lM, int xM, int yM, int rA, int xA, int yA) {
        double lMH = (double) lM / 2;

        int dx = Math.abs(xA - xM); // distance x between square-center, circle-center
        int dy = Math.abs(yA - yM); // distance y between square-center, circle-center

        // easy determinations
        if (dx > lMH + rA || dy > lMH + rA) return false; // totally too far in at least 1 direction
        if (dx <= lMH || dy <= lMH) return true; // totally too close in at least 1 direction

        // corner unsure area
        double dc2 = (lMH-dx)*(lMH-dx) + (lMH-dy)*(lMH-dy); // distance formula with square-corner xy, circle-center xy
        return dc2 <= rA*rA;
    }
}
