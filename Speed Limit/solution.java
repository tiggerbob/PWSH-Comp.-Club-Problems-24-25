import java.util.Scanner;

public class SpaceshipSpeedCheck {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read the number of test cases
        int n = scanner.nextInt();
        scanner.nextLine();  // Consume the newline character
        
        // Process each test case
        for (int i = 0; i < n; i++) {
            String speeds = scanner.nextLine();  // Read the space-separated speed readings
            String[] speedArray = speeds.split(" ");  // Split the string into individual speeds
            
            // Check each speed reading
            for (String speedStr : speedArray) {
                int speed = Integer.parseInt(speedStr);  // Convert the string to an integer
                
                // Check if the speed is safe or unsafe
                if (speed >= 10 && speed <= 100) {
                    System.out.print("safe ");
                } else {
                    System.out.print("unsafe ");
                }
            }
            System.out.println();  // Print a new line after each test case
        }
        
        scanner.close();  // Close the scanner
    }
}
