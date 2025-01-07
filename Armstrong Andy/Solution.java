import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        int j = sc.nextInt();
        
        // num of strong numbers
        int count = 0;

        for (int num = i; num <= j; num++) {
        	
            // Check if the number is either prime or armstrong
            if (isPrime(num) || isArmstrong(num)) {
                count++;
            }
        }

        // output num of armstrong numbers
        System.out.println(count);
    }
    
    // method for checking if prime
    public static boolean isPrime(int num) {
        if (num <= 1) 
        	return false;
        
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    // method for check if armstrong number
    public static boolean isArmstrong(int num) {
    	
        int ogNum = num;
        int sum = 0;
        int numOfDigits = String.valueOf(num).length();
        
        while (num > 0) {
            int digit = num % 10;
            sum += Math.pow(digit, numOfDigits);
            num /= 10;
        }
        
        return sum == ogNum;
    }
}

