package GhoaBudgeting;

import java.io.*;
import java.util.*;

public class CorrectGhoaBudgeting 
{
    public static void main(String[] args) throws IOException
    {
        //IO Files
        BufferedReader re = new BufferedReader( new InputStreamReader(System.in) );

        //Reading Data
        int bal = Integer.parseInt( re.readLine() );
        int t = Integer.parseInt( re.readLine() );
        if( re.readLine() != null)
            line = new StringTokenizer( re.readLine() );
        HashSet<Integer> cost = new HashSet<>();
        //Process Data and Finding Best solution
        int[] ans = {Integer.MAX_VALUE, Integer.MAX_VALUE}; /*[remaining balance, payments]*/
        for(int i = 0; i < t; i++)
        {
            //Getting Demand
            int demand = Integer.valueOf(line.nextToken());

            //Exception - repeat of same demand, demand = 0, demand is greater than balance
            if( demand == 0) continue;
            if( cost.contains(demand) ) continue;
            if( demand > bal) continue;

            //Calclating distribution of current demand
            int[] curr = {bal % demand, bal / demand};
            if(bal >= demand) reduceNum(cost, curr);

            //Checking if current demand is better than current best
            if( curr[1] < ans[1] )//lower required payments
            {
                ans = curr;
            } 
            else if( curr[1] == ans[1] && curr[0] > ans[0] ) //maximum payment with same payments
            {
                ans = curr;
            }

            //Adding to already calculated costs
            cost.add(demand);
        }
        
        //Outputing Result
        if( ans[0] ==  Integer.MAX_VALUE && ans[1] == Integer.MAX_VALUE )
            System.out.println(bal + " " + 0);
        else
            System.out.print(ans[0] + " " + ans[1]);

        //Closing IO Files
        re.close();
    }

    public static int[] reduceNum(HashSet<Integer> posNum, int[] arr)
    {
        //Finding factor starting from remaining money
        int max = arr[0];
        //Exception: if remaining is 0 , can not be simipified
        if(max == 0) return arr;

        //Simplifying array
        for(int i = max; i >= 1; i--)
        {
            if( posNum.contains(i) && arr[0] >= i ) //only if in existing numbers
            {
                int times = arr[0] / i;
                arr[0] -= i * times;
                arr[1] += times;
                i = arr[0] + 1; //Reseting the factors to be based off new remaining value
            }
        }

        //returning the simpified demand calculation
        return arr;
    }

}
