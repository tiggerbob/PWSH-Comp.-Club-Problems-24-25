package PlanetNaming;

import java.util.HashSet;
import java.io.*;

public class TimeOutPlanetNaming 
{
    public static void main(String[] args) throws IOException
    {
        //Input Class
        BufferedReader re = new BufferedReader( new InputStreamReader(System.in) );
        
        //Getting Namer Letters - Caz Armadillo
        HashSet<Character> namerLetter = new HashSet<>();
        namerLetter.add('C');
        namerLetter.add('a');
        namerLetter.add('z');
        namerLetter.add('A');
        namerLetter.add('r');
        namerLetter.add('m');
        namerLetter.add('d');
        namerLetter.add('i');
        namerLetter.add('l');
        namerLetter.add('o');

        //Getting num names
        int n = Integer.parseInt(re.readLine());
        //Storing Minimum Changes
        int changes = Integer.MAX_VALUE;
        String minStr = new String();

        //Processing Names
        for(int i = 0; i < n; i++)
        {
            /*
             * Order of Logic: 
             *  - First Letter Captial
             *  - Check Letter of Namer -> Put in Location of "Earth"
             *  - Have Odd Digits if Odd Capital Letters -> can break "Earth"
             *  - Check for "Earth" -> Replace E with k
             */
            
            //Getting name
            StringBuilder name = new StringBuilder();
            name.append(re.readLine());
            String oriName = name.toString();

            //Storing num changes
            int tempChange = 0;
            
            //Doing First Letter Captial Check
            char firstChr = name.charAt(0);
            if(65 > firstChr || firstChr > 90) //none lowercase
            {
                name.insert(0, (char) (firstChr - 32) );
                tempChange++;
            }

            //Checking Namer Letters
            boolean haveEarth = true;
            for(Character letter : namerLetter)
            {
                if( ! name.toString().contains(letter.toString()) ) //Adds letter if not already found
                {
                    //finding the replacing index
                    int earthIdx = name.toString().toUpperCase().indexOf("EARTH");
                    if(earthIdx != -1)  //if "earth" exists, override e
                    {
                        name.setCharAt(earthIdx, letter);
                    }else //add to end of letter
                    {
                        name.append(letter);
                        haveEarth = false;
                    }
                    tempChange++;
                }
            }
            
            //Updating Captial Count
            int capCt = 0;
            int numCt = 0;
            for(int pos = 0; pos < name.length(); pos++)
            {
                char chr = name.charAt(pos);
                capCt += (65 <= chr && chr <= 90)? 1 : 0;
                numCt += (48 <= chr && chr <= 57)? 1 : 0;
            }
            if(capCt % 2 == 1 && numCt % 2 == 0)
            {
                name.append(0);
                tempChange++;
            }

            //Replacing Remaining Earths
            int earthIdx = name.toString().toUpperCase().indexOf("EARTH");
            while(earthIdx != -1 && haveEarth)
            {
                name.setCharAt(earthIdx, 'k');
                tempChange++;
            }

            //Updating Change
            if(tempChange < changes)
            {
                changes = tempChange;
                minStr = oriName;
            }
        }
        System.out.print(minStr);

        //Closing Input
        re.close();
        p.close();
    }
}
