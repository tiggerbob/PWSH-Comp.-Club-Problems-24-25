package DNACompare;

import java.io.*;
import java.util.HashSet;

public class DNACompare 
{
    public static void main(String[] args) throws IOException
    {
        //IO Files
        BufferedReader re = new BufferedReader( new FileReader("DNACompare\\Input.txt") );
        PrintWriter p = new PrintWriter("DNACompare\\Output.txt");

        //User Data
        String childDNA =  new StringBuilder(re.readLine()).reverse().toString() ; //reversing child DNA
        int t = Integer.parseInt( re.readLine() );
        HashSet<Integer> momSet = new HashSet<>();
        HashSet<Integer> dadSet = new HashSet<>();

        //Resulting Values
        String dadDNA = "";
        int maxLenDad = -1;
        String momDNA = "";
        int maxLenMom = -1;
        
        //Testing Cases
        for(int i = 0; i < t; i++)
        {
            String currParent = re.readLine();
            int[][] data = longCommonStr(childDNA, currParent);

            if( data[2][0] + data[2][2] > data[2][1] + data[2][3] ) //Mom
            {
                if( data[0][0] > maxLenMom)
                {
                    momDNA = currParent;
                    maxLenMom = data[0][0];
                }else if(data[0][0] == maxLenMom)
                {
                    momSet.add(data[0][0]);
                }
            }
            else //Dad
            {
                if( data[0][0] > maxLenDad)
                {
                    dadDNA = currParent;
                    maxLenDad = data[0][0];
                }else if(data[0][0] == maxLenDad)
                {
                    dadSet.add(data[0][0]);
                }
            }

        }

        //Outputing Result
        p.println(momDNA);
        p.println(dadDNA);
        
        System.out.println( momSet.contains(maxLenMom) + " " + dadSet.contains(maxLenDad) );
        //Saving IO Files
        re.close();
        p.close();
        
    }

    public static int[][] longCommonStr(String strA, String strB)
    {
        //Declaring Base Counts
        int ct1A = 0;
        int ct1T = 0;
        int ct1C = 0;
        int ct1G = 0;

        int ct2A = 0;
        int ct2T = 0;
        int ct2C = 0;
        int ct2G = 0;

        //LCS Array
        int[][] LCS = new int[strA.length() + 1][strB.length() + 1];

        //Base Cases for LCS Algorithm
        for(int r = 0; r < LCS.length; r++)
            LCS[r][0] = 0;
        for(int c = 1; c < LCS[0].length; c++)
            LCS[0][c] = 0;

        //Interating over all letter combinations
        for(int r = 1; r < LCS.length; r++)
        {
            for(int c = 1; c < LCS[0].length; c++)
            {
                //Testing All Letter Combinations
                char chrA = strA.charAt(r - 1);
                char chrB = strB.charAt(c - 1);
                if(chrA == chrB) LCS[r][c] = LCS[r-1][c-1] + 1;
                else LCS[r][c] = Math.max( LCS[r-1][c], LCS[r][c-1] );
                
                //Updating Base Counts
                if(chrA == 'A') ct1A++;
                else if(chrA == 'C') ct1C++;
                else if(chrA == 'G') ct1G++;
                else if(chrA == 'T') ct1T++;

                if(chrB == 'A') ct2A++;
                else if(chrB == 'C') ct2C++;
                else if(chrB == 'G') ct2G++;
                else if(chrB == 'T') ct2T++;
            }
        }

        //Returning Long Common Length and Base Counts
        return new int[][] 
        { { LCS[strA.length()][strB.length()] },
          { ct1A / 3, ct1C / 3, ct1G / 3, ct1T / 3 },
          { ct2A / 3, ct2C / 3, ct2G / 3, ct2T / 3 }  };
    }

}
