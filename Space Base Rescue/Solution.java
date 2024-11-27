import java.util.*;
import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] nm = br.readLine().split(" ");
        int n = Integer.parseInt(nm[0]);
        int m = Integer.parseInt(nm[1]);

        // Civilians in each room
        int[] civilians = Arrays.stream(br.readLine().split(" "))
                                .mapToInt(Integer::parseInt)
                                .toArray();

        // Adjacency list graph representation
        List<List<Integer>> graph = new ArrayList<>();
        for (int i = 0; i <= n; i++) graph.add(new ArrayList<>());

        for (int i = 0; i < m; i++) {
            String[] uv = br.readLine().split(" ");
            int u = Integer.parseInt(uv[0]);
            int v = Integer.parseInt(uv[1]);
            graph.get(u).add(v);
        }

        // Starting room
        int start = Integer.parseInt(br.readLine());

        // Perform BFS
        boolean[] visited = new boolean[n + 1];
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(start);
        visited[start] = true;

        int totalCivilians = 0;
        int reachableRooms = 0;

        while (!queue.isEmpty()) {
            int room = queue.poll();

            // Process the room
            totalCivilians += civilians[room - 1];
            reachableRooms++;

            // Visit neighbors
            for (int neighbor : graph.get(room)) {
                if (!visited[neighbor]) {
                    visited[neighbor] = true;
                    queue.offer(neighbor);
                }
            }
        }

        // Output results
        System.out.println(totalCivilians);
        System.out.println(reachableRooms);
    }
}
