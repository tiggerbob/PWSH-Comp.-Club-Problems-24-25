package AlienRobery;

import java.io.*;

public class AlienRobbery 
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader re = new BufferedReader( new InputStreamReader(System.in) );
        
        //Taking in Balance
        double bal = Double.parseDouble( re.readLine() );

        //Taking in Robbery
        int t = Integer.parseInt( re.readLine() );
        
        for(int i = 0; i < t; i++)
        {
            //Taking Line Input
            double robPercent = 0.0;
            String[] arr = re.readLine().split("[\\s:]");
            /* [Num People, Hour, Minute, PM or AM] */

            //Processing Input
            robPercent += Integer.parseInt(arr[0]) * 0.1;
            /*
             * Times
             * t <= 8:00 AM -> 480 Min
             * t >= 8:00 PM -> 1200 Min
             */
            int timeMin;
            if(Integer.parseInt(arr[1]) != 12)
                timeMin = Integer.parseInt(arr[1]) * 60 + Integer.parseInt(arr[2]) + ((arr[3].equals("PM"))? 720 : 0);
            else
                timeMin = (arr[3].equals("PM"))? 720: 0;
            if( timeMin <= 480 || timeMin >= 1200 ) robPercent += 0.05;

            //If over 1, reduce to one -> can not have negative balance
            robPercent = (robPercent > 1)? 1 : robPercent;

            //Calcating Rob
            double balRob = bal * robPercent;
            bal -= balRob;

            //Outputing Amount Robbed
            System.out.printf("%.3f\n", balRob);
        }

        //Outputing Remaining Balanced
        System.out.printf("%.3f", bal);
        
        //Closing IO Files
        re.close();
    }
}
