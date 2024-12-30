/*
 * Will Time Out, simulation will not work on this problem
 */

package GhoaBudgeting;

import java.io.*;
import java.util.*;

public class TimeOutGhoaBudgeting 
{
    public static void main(String[] args) throws IOException
    {
        //IO Files
        BufferedReader re = new BufferedReader( new FileReader("GhoaBudgeting\\Input.txt") );
        PrintWriter p = new PrintWriter("GhoaBudgeting\\Output.txt");

        //Reading Data
        int bal = Integer.parseInt( re.readLine() );
        int t = Integer.parseInt( re.readLine() );
        TreeSet<Integer> cost = new TreeSet<Integer>();
        StringTokenizer line = new StringTokenizer( re.readLine() );
        for(int i = 0; i < t; i++)
            cost.add( Integer.valueOf(line.nextToken()) );

        //Processing Data and Finding best solution
        int[] ans = {Integer.MAX_VALUE, Integer.MAX_VALUE}; /*[remaining balance, payments]*/
        while( ! cost.isEmpty() )
        {
            int[] curr = distribute(cost, bal);
            if( curr[1] < ans[1] ) //lower required payments
                ans = curr;
            if( curr[1] == ans[1] && curr[0] > ans[0] ) //maximum payment with same payments
                ans = curr;
            cost.removeLast();
        }
        
        //Outputing Result
        System.out.print(ans[0] + " " + ans[1]);

        //Closing IO Files
        re.close();
        p.close();
    }

    public static int[] distribute(TreeSet<Integer> demands, int balance)
    {
        int payCt = 0;

        for( Integer cost : demands.descendingSet() )
        {
            if(cost == 0) continue;
            payCt += balance / cost;
            balance = balance % cost;
        }
        
        return new int[] {balance, payCt};
    }

}
