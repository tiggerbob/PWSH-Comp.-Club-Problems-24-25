import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Arrays;

public class Generate {
    // technical config
    public static final int FILE_NUM = 4;
    public static final String INPUT_FILE = String.format("input%d.txt", FILE_NUM);
    public static final String OUTPUT_FILE = String.format("output%d.txt", FILE_NUM);
    public static boolean PRINT = true;

    // testcase config
    public static final int NUM_TESTCASES = 10;
    public static final int MIN_HEIGHT = 3;
    public static final int HEIGHT_RANGE = 10;
    public static final int VALUE_RANGE = 1;
    public static final int MAX_VALUE = Integer.MAX_VALUE-200; // -200 is for the vibes

    // for the code to use
    public static int PREV_VALUE;

    public static void main(String[] args) throws FileNotFoundException {
        PrintWriter write = new PrintWriter(INPUT_FILE);
        write.print(generate());
        write.close();
        System.out.println("Printed to file: " + INPUT_FILE);

        Main.main(new String[] {INPUT_FILE, OUTPUT_FILE});
    }

    public static String generate() {
        StringBuilder input = new StringBuilder();
        if (PRINT) System.out.println(NUM_TESTCASES);
        input.append(NUM_TESTCASES);
        input.append("\n");

        for (int n = 0; n < NUM_TESTCASES; n++) {
            PREV_VALUE = 1; // leftmost value starting out

            int height =  (int) (Math.random() * HEIGHT_RANGE) + MIN_HEIGHT; // todo
            int nodes = (int) Math.pow(2, height) - 1;
            int[] tree = new int[nodes];

            // fill tree
            Arrays.fill(tree, Integer.MIN_VALUE);
            traverse(tree, 0);

            int favValue = tree[(int) (Math.random() * nodes)];

            // append to sb
            if (PRINT) System.out.println(favValue);
            input.append(favValue);
            input.append("\n");

            if (PRINT) System.out.println(height);
            input.append(height);
            input.append("\n");

            for (int i = 0; i < nodes; i++) {
                if (PRINT) System.out.print(tree[i] + " ");
                input.append(tree[i]);
                input.append(" ");
            }
            if (PRINT) System.out.println();
            input.append("\n");
        }

        return input.toString();
    }

    // n - num testcases
    // for n
        // int f: integer in fav node
        // int h: height of perfect bst
        // the binary tree

    public static void printTree(int[] tree, int height) {
        int idx = 0;
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < Math.pow(2, i); j++) {
                System.out.printf("%4d ", tree[idx]);
                idx++;
            }
            System.out.println();

        }

    }

    public static void traverse(int[] tree, int curr) {
        // exit case
        if (curr >= tree.length) return;

        // left
        traverse(tree, curr*2+1);

        // this
        int value = (int) (Math.random() * VALUE_RANGE + 1) + PREV_VALUE; // +1 compensates to disallow duplicate vals
        if (value > MAX_VALUE) throw new IllegalStateException("Value too big, try again. Value: " + value);
        PREV_VALUE = value;
        tree[curr] = value;

        // right
        traverse(tree, curr*2+2);
    }

    /*

     i <3 binary trees
                            0
                1                      2
         3           4            5          6
      7     8     9     10    11    12    13   14
    15 16 17 18 19 20 21 22 23 24 25 26 27 28 29 30


                            14
                6                      20
         3           9            19          21
     */
}

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
//        String input = getInput();
//        Scanner scan = new Scanner(input);

        if (args.length == 0) {
            System.out.println("OI BAD. Go run Generate, not this.");
            return;
        }

        Scanner scan = new Scanner(new File(args[0]));
        PrintWriter write = new PrintWriter(args[1]);

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
                int tempNumNodes = (int) Math.pow(2, tempHeight) - 1;
                int killedNodeIdx = tempNumNodes - 1;

                if (favorite <= tree[killedNodeIdx]) {
                    if (Generate.PRINT) System.out.println(d); // solution
                    write.println(d);
                    break;
                }
            }
        }
        System.out.println("Printed to file: " + Generate.OUTPUT_FILE);
        scan.close();
        write.close();
    }

    public static String getInput() {
        return """
                2
                5
                3
                
                3
                1 5
                0 2 4 7
                
                1
                3
                
                3
                1 5
                0 2 4 7""";
    }
}
