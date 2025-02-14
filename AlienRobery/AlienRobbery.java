package AlienRobery;

import java.io.*;
import java.math.BigDecimal;
import java.math.MathContext;

public class AlienRobbery 
{
    public static void main(String[] args) throws IOException
    {
        //Timing
        long startTime = System.nanoTime();
        
        //IO Files
        BufferedReader re = new BufferedReader( new FileReader("AlienRobery\\Input.txt") );
        PrintWriter output = new PrintWriter("AlienRobery\\Output.txt");
        
        //Taking in Balance
        BigDecimal bal = new BigDecimal( re.readLine() );

        //Taking in Robbery
        int t = Integer.parseInt( re.readLine() );
        
        for(int i = 0; i < t; i++)
        {
            //Taking Line Input
            int robPercent = 0;
            String[] arr = re.readLine().split("[\\s:]");
            /* [Num People, Hour, Minute, PM or AM] */

            //Processing Input 
            //n
            robPercent += Integer.parseInt(arr[0]) * 10;
            /*
             * Times
             * t <= 8:00 AM -> 480 Min
             * t >= 8:00 PM -> 1200 Min
             */
            int timeMin;
            if( Integer.parseInt(arr[1]) != 12 )
                timeMin = Integer.parseInt(arr[1]) * 60 + Integer.parseInt(arr[2]) + ((arr[3].equals("PM"))? 720 : 0);
            else
                timeMin = Integer.parseInt(arr[1]) * 60 + Integer.parseInt(arr[2]) + ((arr[3].equals("AM"))? 720 : 0);
            if( timeMin <= 480 || timeMin >= 1200 ) robPercent += 5;

            //If over 100%, reduce to one -> can not have negative balance
            robPercent = (robPercent > 100)? 100 : robPercent;

            //Calculating Amount Robbed
            BigDecimal rob = new BigDecimal(bal.toString());
            rob = rob.divide(new BigDecimal(100));
            rob = rob.multiply(new BigDecimal(robPercent));
            bal = bal.subtract(rob);

            //Outputing Amount Robbed
            output.println( round3Dig(rob) );
        }

        //Outputing Remaining Balanced
        output.println( round3Dig(bal) );

        //Timing
        long endTime = System.nanoTime();
        System.out.println("Time is: " + (endTime-startTime) /(double) 1000000000 + " seconds");
        
        //Closing IO Files
        re.close();
        output.close();
    }

    public static BigDecimal round3Dig(BigDecimal old)
    {
        //Creating the return big decimal
        //Adds one to ensure correct count of digits
        BigDecimal ret = old.add(new BigDecimal(1)).stripTrailingZeros();
        
        //Getting Where decimal points is
        int dot = ret.toString().indexOf(".");
        int numDecs = ret.toString().length() - dot - 1;

        //Formating to make sure include exactly 3 decimal spots
        if( dot == -1 ) //Missing all trailing zeros
            return ret.divide(new BigDecimal(1000)).multiply(new BigDecimal(1000)).subtract(new BigDecimal(1));
        if( numDecs == 2 )  //missing two trailing zeros 
            return ret.divide(new BigDecimal(10)).multiply(new BigDecimal(10)).subtract(new BigDecimal(1));
        if( numDecs == 1 ) //missing one trailing zero
            return ret.divide(new BigDecimal(100)).multiply(new BigDecimal(100)).subtract(new BigDecimal(1));
        //3 or more deciamal places
        else return ret.round(new MathContext(ret.precision() - (numDecs - 3)) ).subtract(new BigDecimal(1));
    }
    
}
