# Gru's Galactic Heist
Gru, like the supervillain he is, is not satisfied with just stealing the moon and now aims to steal all the planets in the Galaxy.

Gru wants to steal planets in a specific order based on a given criterion (e.g., color, size). Each planet lies in a linear galaxy, represented by their positions along a 1D coordinate system. Gru starts at an initial position 
P and can travel to planets that meet the given criterion. When Gru steals a planet, his new starting position becomes the position of that planet. Gru wants to determine the maximum number of planets he can steal without exceeding the total distance $D$.


## Input Format:
The first line will contain a single integer $n$, representing the number of planets.

The next $n$ lines will contain $X$ integers, representing the planet's position along the galaxy and also a String $A$ being the attribute of the planet (e.g., "blue").

The line after the $n$ lines will be a String $C$ showing the attribute criterion Gru is targeting to obtain (e.g., "blue").

The line after will be an integer $P$ representing Gru's starting position.

The final line will contain the integer $D$ representing the maximum total distance Gru can travel.

## Constraints:
$1 \leq n \leq 10^5$

$− 10^9 \leq X \leq 10^9$

$1 \leq | A | \leq 10$

$− 10^9 \leq P \leq 10^9 $

$ 1 \leq D \leq 10^{12} $

## Output Format:
The output will print a single integer representing the maximum number of planets Gru can collect to match the criteria $C$ provided and traveling no more distance than total distance $D$.

## Sample Input:
```
5  
1 blue  
10 red  
3 blue  
6 green  
8 blue  
blue  
4  
10  
```
## Sample Output:
```
3
```
## Sample Case Explanation:
Gru starts at position 4 with a maximum allowed travel distance of 10 and needs to collect planets with the "blue" attribute. The blue planets are located at positions 1, 3, and 8. The total travel distance from position 4 to 1 is 3, from 1 to 3 is 1, and from 3 to 8 is 4, giving a total distance of 8, which is within the allowed limit of 10. Thus, Gru can collect all three blue planets, and the output is 3.

**Author: Yoel Han**





