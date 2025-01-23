import java.util.*;
import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        ArrayList<String> crewmates = new ArrayList<>(N);

        for (int i = 0; i < N; i++)
            crewmates.add(br.readLine());

        int M = Integer.parseInt(br.readLine());

        for (int i = 0; i < M; i++)
            crewmates.remove(br.readLine());

        PrintWriter pw = new PrintWriter(System.out);

        for (String missing : crewmates)
            pw.println(missing);

        pw.close();
        br.close();
    }
}
