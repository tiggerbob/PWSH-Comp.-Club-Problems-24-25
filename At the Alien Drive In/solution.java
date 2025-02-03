import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int orders = scan.nextInt();
        double sum = 0;
        
        scan.nextLine();
        
        Map<String, Double> curencies = new HashMap<String, Double>() {{
            put("Moobie", 17.00);
            put("Kryp", .01);
            put("Piddle", 8.00);
            put("Snoodie", 2.00);
            put("Flux", 22.00);
        }};
        
        for(int i = 0; i < orders; i++){
            sum += scan.nextDouble() * curencies.get(scan.next());
            scan.nextLine();
            
        }
        
        System.out.println(sum);
        
            

    }
}
