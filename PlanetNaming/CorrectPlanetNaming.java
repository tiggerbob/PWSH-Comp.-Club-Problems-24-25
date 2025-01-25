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
             *  - First Letter Capital -> Destorys Earth at the Beginning of the Name
             *  - Check Letter of Namer -> Destory an "Earth"
             *  - Have Odd Digits if Odd Capital Letters -> Destory an "Earth"
             *  - Check for "Earth" -> Then replace remaining undestoryed "Earth"
             */
            
            //Getting name
            String name = re.readLine();
            //System.out.println("For the line: " + (i+2) );

            //Storing num changes
            int tempChange = 0;
            //Storing changes changes that will destroy "Earth"s
            int overEarthCt = 0;
            //Determine if Capital from Namer's name is Added
            boolean capAdded = false;

            //Keeping Track of Numbers and Captials
            int capCt = 0;
            int numCt = 0;

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
                if( j == 0 && (65 > chr || chr > 90) ) 
                {
                    tempChange++;
                    if( (name.length() >= 5)  && name.substring(0,5).equalsIgnoreCase("Earth") )
                        overEarthCt++; 
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
                overEarthCt++;
            }


            //Checking if can replace namer letter or number at beginning, asusming it is Earth
            //    captial check                                       name capital added     make sure earth overlaps                              
            if( !('A' <= name.charAt(0) && name.charAt(0) <= 'Z') && capAdded && (earthCt - overEarthCt) < 0 )
            {
                tempChange--;
                if( (5 <= name.length()) && (name.substring(0,5).equalsIgnoreCase("Earth")) ) overEarthCt++;
            //        earth check                                                                        odd rule check                      make sure earth overlap
            }else if( (5 <= name.length()) && name.substring(0,5).equalsIgnoreCase("Earth") && capCt % 2 == 1 && numCt % 2 == 0 && (earthCt - overEarthCt) < 0 )
            {
                overEarthCt++;
            }

            //Adding Addition Earths if the previous changes have not overrode enough earths
            tempChange += (earthCt > overEarthCt)? earthCt - overEarthCt : 0;
                
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
