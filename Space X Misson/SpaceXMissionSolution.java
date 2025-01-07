// Space X Mission: Check if the landing is safe based on thrust values

import java.util.Scanner;

public class SpaceXMission {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt(); // Number of thrust values
        if (N == 0) {
            System.out.println("SAFE"); // No thrust values means the rocket stays balanced
            return;
        }

        int sum = 0;
        for (int i = 0; i < N; i++) {
            sum += scanner.nextInt();
        }

        if (sum == 0) {
            System.out.println("SAFE");
        } else {
            System.out.println("NOT SAFE");
        }

        scanner.close();
    }
}
