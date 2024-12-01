import java.util.Scanner;

public class LifeformCount {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the number of test cases
        int n = scanner.nextInt();
        scanner.nextLine(); // Consume the remaining newline after reading the integer

        // Loop over each test case
        for (int i = 0; i < n; i++) {
            String s = scanner.nextLine(); // Read the species code string
            
            // Count occurrences of "gleeb" and "glorb"
            int gleebCount = 0;
            int glorbCount = 0;
            
            // Count "gleeb"
            int index = 0;
            while ((index = s.indexOf("gleeb", index)) != -1) {
                gleebCount++;
                index += 5; // Move past the current "gleeb"
            }
            
            // Count "glorb"
            index = 0;
            while ((index = s.indexOf("glorb", index)) != -1) {
                glorbCount++;
                index += 5; // Move past the current "glorb"
            }
            
            // Output the result for the current test case
            System.out.println(gleebCount + " " + glorbCount);
        }

        scanner.close();
    }
}
