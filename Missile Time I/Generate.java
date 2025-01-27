import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Generate {
    // technical config
    public static final int FILE_NUM = 1;
    public static final String INPUT_FILE = String.format("missile_time_testcases/input/input%2d.txt", FILE_NUM);
    public static final String OUTPUT_FILE = String.format("missile_time_testcases/output/output%2d.txt", FILE_NUM);
    public static boolean PRINT = true;

    // testcase config
    public static final int MIN_HOURS = 1;
    public static final int MAX_HOURS = 15;

    public static final int MIN_MAX_HITS = 0;
    public static final int MAX_MAX_HITS = 10;

    public static final int MIN_MISSILE_LENGTH = 1;
    public static final int MAX_MISSILE_LENGTH = 10;

    public static final int MIN_MISSILE_XY = 1;
    public static final int MAX_MISSILE_XY = 10;

   public static final int MIN_NUM_ASTEROIDS = 0;
   public static final int MAX_NUM_ASTEROIDS = 10;

    public static final int MIN_ASTEROID_RADIUS = 1;
    public static final int MAX_ASTEROID_RADIUS = 10;

    public static final int MIN_ASTEROID_XY = 1;
    public static final int MAX_ASTEROID_XY = 10;

    public static void main(String[] args) throws FileNotFoundException {
        PrintWriter write = new PrintWriter(INPUT_FILE);
        write.print(generate());
        write.close();
        System.out.println("Printed to file: " + INPUT_FILE);

        Main.main(new String[] {INPUT_FILE, OUTPUT_FILE});
    }

    public static String generate() {
        StringBuilder input = new StringBuilder();

        // generate ship info
        int numHours = (int) (Math.random() * (MAX_HOURS - MIN_HOURS + 1) + MIN_HOURS);
        int maxHits = (int) (Math.random() * (MAX_MAX_HITS - MIN_MAX_HITS + 1) + MIN_MAX_HITS);

        // append ship info to input
        input.append(numHours).append("\n");
        input.append(maxHits).append("\n");

        // print ship info
        if (PRINT) {
            System.out.println(numHours);
            System.out.println(maxHits);
        }

        for (int n = 0; n < numHours; n++) {
            // generate missile info
            int length = (int) (Math.random() * (MAX_MISSILE_LENGTH - MIN_MISSILE_LENGTH + 1) + MIN_MISSILE_LENGTH);
            int x = (int) (Math.random() * (MAX_MISSILE_XY - MIN_MISSILE_XY + 1) + MAX_MISSILE_XY);
            int y = (int) (Math.random() * (MAX_MISSILE_XY - MIN_MISSILE_XY + 1) + MAX_MISSILE_XY);
            int numAsteroids = (int) (Math.random() * (MAX_NUM_ASTEROIDS - MIN_NUM_ASTEROIDS + 1) + MAX_NUM_ASTEROIDS);

            // append missile info to input
            input.append(length).append("\n");
            input.append(x).append("\n");
            input.append(y).append("\n");
            input.append(numAsteroids).append("\n");

            // print ship info
            if (PRINT) {
                System.out.println(length);
                System.out.println(x);
                System.out.println(y);
                System.out.println(numAsteroids);
            }

            // generate asteroid info
            for (int i = 0; i < numAsteroids; i++) {
                int radius = (int) (Math.random() * (MAX_ASTEROID_RADIUS - MIN_ASTEROID_RADIUS + 1) + MAX_ASTEROID_RADIUS);
                int xA = (int) (Math.random() * (MAX_ASTEROID_XY - MIN_ASTEROID_XY + 1) + MAX_ASTEROID_XY);
                int yA = (int) (Math.random() * (MAX_ASTEROID_XY - MIN_ASTEROID_XY + 1) + MAX_ASTEROID_XY);

                // append asteroid info to input
                input.append(radius).append(" ");
                input.append(xA).append(" ");
                input.append(yA).append("\n");

                // print asteroid info
                if (PRINT) {
                    System.out.print(radius + " ");
                    System.out.print(xA + " ");
                    System.out.println(yA);
                }
            }
        }
        return input.toString();
    }
}

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {

        if (args.length == 0) {
            System.out.println("OI BAD. Go run Generate, not this.");
            return;
        }

        Scanner scan = new Scanner(new File(args[0]));
        PrintWriter write = new PrintWriter(args[1]);

        int maxHits = scan.nextInt();
        int hours = scan.nextInt();

        for (int h = 0; h < hours; h++) {
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

                if (!collision(lengthMissile, xMissile, yMissile, radiusAsteroid, xAsteroid, yAsteroid)) {
                    maxHits--;
                    if (maxHits == 0) {
                        write.println(h+1); // solution 1
                        if (Generate.PRINT) System.out.println(h+1);
                        break;
                    }
                }
            }
        }
        if (maxHits > 0) {
            write.println("We made it!"); // solution 2
            if (Generate.PRINT) System.out.println("We made it!");
        }

        System.out.println("Printed to file: " + Generate.OUTPUT_FILE);
        scan.close();
        write.close();
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
