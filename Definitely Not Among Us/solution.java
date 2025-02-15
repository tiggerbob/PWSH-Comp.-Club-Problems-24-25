import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt(); // num testcases

        for (int t = 0; t < n; t++) {
            // testcase input
            int numImpostors = scan.nextInt();
            int numCrewmates = scan.nextInt();
            int numConfirmations = scan.nextInt();

            int[] numConfirmers = new int[numCrewmates]; // number who confirmed crewmate idx
            boolean[] isInnocent = new boolean[numCrewmates]; // is crewmate idx innocent?

            ArrayList<ArrayList<Integer>> confirmations = new ArrayList<>();
            for (int i = 0; i < numCrewmates; i++) {
                confirmations.add(new ArrayList<>());
            }

            for (int i = 0; i < numConfirmations; i++) {
                int confirmer = scan.nextInt()-1;
                int confirmee = scan.nextInt()-1;
                confirmations.get(confirmer).add(confirmee);
                numConfirmers[confirmee]++;
            }

            // logic
            Queue<Integer> newlyInnocent = new LinkedList<>(); // we have work to do
            for (int i = 0; i < numCrewmates; i++) {
                if (numConfirmers[i] > numImpostors) {
                    newlyInnocent.add(i);
                    isInnocent[i] = true;
                }
            }

            while (!newlyInnocent.isEmpty()) {
                int confirmer = newlyInnocent.poll();
                for (Integer crewmate : confirmations.get(confirmer)) {
                    if (!isInnocent[crewmate]) { // not previously marked inno
                        newlyInnocent.add(crewmate);
                        isInnocent[crewmate] = true;
                    }
                }
            }

            int numPrinted = 0;
            for (int i = 0; i < numCrewmates; i++) {
                if (!isInnocent[i]) {
                    System.out.println(i+1); // solution
                    numPrinted++;
                    if (numPrinted == numImpostors) {
                        break;
                    }
                }
            }
        }
    }
}
