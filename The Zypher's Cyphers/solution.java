import java.util.Scanner;

public class ZypherMessageDecoder {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read the number of test cases (messages)
        int n = scanner.nextInt();
        scanner.nextLine();  // Consume the newline after the integer input
        
        int validMessages = 0;
        int invalidMessages = 0;
        
        // Loop through each message
        for (int i = 0; i < n; i++) {
            String message = scanner.nextLine().trim();
            
            // Check if the message is valid
            if (isValidMessage(message)) {
                validMessages++;
            } else {
                invalidMessages++;
            }
        }
        
        // Output the count of valid and invalid messages
        System.out.println(validMessages + " " + invalidMessages);
        
        scanner.close();
    }

    // Method to check if a message is valid
    public static boolean isValidMessage(String message) {
        // Message should contain at least one '1' and one '0'
        if (!message.contains("1") || !message.contains("0")) {
            return false;
        }
        
        // Message should not start or end with consecutive '0's or '1's
        if (message.startsWith("00") || message.startsWith("11") ||
            message.endsWith("00") || message.endsWith("11")) {
            return false;
        }
        
        return true;
    }
}
