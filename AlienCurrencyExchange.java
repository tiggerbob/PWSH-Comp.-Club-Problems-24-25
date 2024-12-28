package AlienCurrencyExchange;

import java.math.BigInteger;
import java.io.*;


public class AlienCurrencyExchange 
{
    public static void main(String[] args) throws IOException
    {
        //Starting Nums
        long curEx = 7552701074431167L;
        
        //Getting Ghoa value
        BufferedReader re = new BufferedReader( new InputStreamReader(System.in) );
        long x = Long.valueOf( re.readLine() );
        int sign = (x < 0)? -1 : 1;
        x = Math.abs(x);
        

        //Getting Highest Degreee
        long temp = x;
        int deg = 0;
        while( temp > 0 )
        {
            deg++;
            temp /= 10;
        }

        //Calculating Rate
        BigInteger exRate = new BigInteger( String.valueOf(curEx) );
        BigInteger sum = new BigInteger("0");
        while(x > 0)
        {
            //Calculating the individual number position
            long tenPow = (int) Math.pow(10,deg-1);
            BigInteger placeVal = new BigInteger( String.valueOf(x / tenPow * tenPow) );

            //Calculating exchange at current place value
            BigInteger placeCurEx = exRate.multiply(placeVal);

            //Adding to next currency exchange
            sum = sum.add(placeCurEx);

            //recalculating exchange rate
            exRate = exRate.multiply( new BigInteger("4") );
            exRate = exRate.divide( new BigInteger("5") );
            
            //reduceing x and highest degree
            x -= placeVal.longValue();
            deg--;
        }

        if(sign < 0)
            System.out.println("-" + sum);
        else
            System.out.println(sum);
    }
    
}
