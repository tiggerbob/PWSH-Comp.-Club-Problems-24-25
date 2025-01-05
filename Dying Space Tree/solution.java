import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt(); // num testcases

        for (int t = 0; t < n; t++) {
            // testcase input
            int favorite = scan.nextInt();
            int height = scan.nextInt();
            int nodes = (int) Math.pow(2, height) - 1;
            int[] tree = new int[nodes];
            for (int i = 0; i < nodes; i++) {
                tree[i] = scan.nextInt();
            }

            // logic
            for (int d = height; d > 0; d--) {
                int tempHeight = height - d + 1;
                int killedNodeIdx = (int) Math.pow(2, tempHeight) - 2;

                if (favorite <= tree[killedNodeIdx]) {
                    System.out.println(d); // solution
                    break;
                }
            }
        }
    }
}
