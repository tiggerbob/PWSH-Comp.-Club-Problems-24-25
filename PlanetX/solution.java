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
            for(int j = 0; j < s.length() - 4; j++)
            {
                if(s.substring(j, j+5).equals("gleeb"))
                {
                    gleebCount++;
                }
            }
            
            // Count "glorb"
            for(int j = 0; j < s.length() - 4; j++)
            {
                if(s.substring(j, j+5).equals("glorb"))
                {
                    glorbCount++;
                }
            }
            
            // Output the result for the current test case
            System.out.println(gleebCount + " " + glorbCount);
        }

        scanner.close();
    }
}
