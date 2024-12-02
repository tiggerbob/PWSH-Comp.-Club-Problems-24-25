# Gru's Galactic Heist
Gru, like the supervillian he is, is not satisfied with just stealing the moon and now aims to steal all the planets in the Galaxy.

Gru wants to steal the planets in a specific order based on a given criteria (e.g., color, size). Each planet lies in a linear galaxy, represented by their positions along a 1D coordinate system. Gru needs to travel to collect planets that meet the given criterion, but he has a maximum distance $D$ he can travel.

Gru wants to determine the maximum number of planets he can steal, starting from his initial position $P$, without exceeding the total distance $D$.


## Input Format:
The first line will contain a single integer $n$ $(1 \leq N \leq 10^5)$, representing the number of planets.

The next n lines will contain $X$ integer $(-10^9 \leq X \leq 10^9)$, representing the planet's position along the galaxy and also a String $A$ $(1 \leq |X| \leq 10)$ being the attribute of the planet(e.g., "blue").

The line after the $n$ lines wil be a String $C$ showing the attribute criterion gru is targeting to obtain(e.g., "blue").

The line after will be an Integer $P$ $(-10^9 \leq P \leq 10^9)$ representing Gru's starting position. 

The final line will contian integer $D$ $(1 \leq D \leq 10^12)$ representing the maximum total distance Gru can travel.

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
2
```
## Sample Case Explanation:
Gru starts at position $P$=4, and he can travel a total distance of $D$=10. Since the target plant's with attribute blue are a t positions [1,3,8], collecting plants at 3(distance 1) and 1 (distance 2) costs 3 total distance leaving only 7 units for travel. Gru cannot reach position 8 (distance 4 + 4 = 8) while staying within the current total travel limit of 7 so the maximum planets Gru can collect is 2.

**Author: Yoel Han**





