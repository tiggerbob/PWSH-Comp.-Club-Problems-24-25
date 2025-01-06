package PlanetNaming;

import java.util.HashSet;
import java.io.*;

public class CorrectPlanetNaming 
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
             *  - First Letter Captial -> Destorys Earth at the Beginning of the Name
             *  - Check Letter of Namer -> Destory an "Earth"
             *  - Have Odd Digits if Odd Capital Letters -> Destory an "Earth"
             *  - Check for "Earth" -> Then replace remaining undestoryed "Earth"
             */
            
            //Getting name
            String name = re.readLine();
            System.out.println("For the name: " + name);

            //Storing num changes
            int tempChange = 0;
            //Storing changes changes that will destroy "Earth"s
            int overEarthCt = 0;
            //Determine if Capital from Namer's name is Added
            boolean capAdded = false;

            //Checking Namers' Letters
            for(Character letter : namerLetter)
            {
                if( ! name.toString().contains(letter.toString()) ) //Adds letter if not already found
                {
                    tempChange++;
                    overEarthCt++;
                    if(65 <= letter && letter <= 90 && ! capAdded) capAdded = true;
                }
            }

            //Keeping Track of Numbers and Captials
            int capCt = 0;
            int numCt = 0;
            //Keeping Track of Earth Counts
            int earthCt = 0;

            //Interating thourgh name
            for(int j = 0; j < name.length(); j++)
            {
                //Updating Captial and Number Counts
                char chr = name.charAt(j);
                capCt += (65 <= chr && chr <= 90)? 1 : 0;
                numCt += (48 <= chr && chr <= 57)? 1 : 0;
                
                //first letter not uppercase
                if(j == 0 && (65 > chr || chr > 90) ) 
                {
                    tempChange++;
                    //May override Earth becuase can change captial letter from E, assuming Earth is in the beginning
                    if( (name.length() >= 5)  && name.substring(0,5).equalsIgnoreCase("Earth") )
                        overEarthCt++; 
                    continue;
                }

                //Updating Earth Count
                if( (j + 5 <= name.length()) && name.substring(j,j+5).equalsIgnoreCase("Earth") )
                {
                    earthCt++;
                    continue;
                }
            }

            //Determining if an addition number is required if Odd number of Capitals
            if(capCt % 2 == 1 && numCt % 2 == 0)
            {
                tempChange++;
            }

            //Adding Addition Earths if the previous changes have not overrode enought earths
            tempChange += (earthCt > overEarthCt)? earthCt - overEarthCt : 0;

            //Checking if can replace captial namer letter at beginning, asusming it is Earth
            if( name.substring(0,5).equalsIgnoreCase("Earth") && capAdded )
            {
                tempChange--;
            }

            //Updating Change
            if(tempChange < changes)
            {
                changes = tempChange;
                minStr = name;
            }
        }
        System.out.print(minStr);

        //Closing Input
        re.close();
    }

}
