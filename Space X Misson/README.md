# Space X Misson

Elon is trying to land his Falcon 9 back on Earth. In order for it to 
land safely back on the launch site, it uses its innovative thrusts to 
manipulate its dropping speed. It uses upward thrusts to resist 
the drop and downward thrusts to accelerate the drop. It also can 
have zero thrust as a neutral state for landing. In order to know that
the rocket has landed safely, the the total sum of the thrusts 
must equal zero. Determine if the given array of thrusts ensures a 
safe landing. 


## Input Format:
The first line will contain a single integer $N$ $(0 \leq N \leq
 10^5)$, representing the number of thrust values.

The second line will contain $N$ integers of $t1, t2,... tn$ $(-10^6 \leq N \leq
 10^6)$, representing the thrust values in sequence. 

## Output Format:
The output will be a single String representing if the landing was either 
SAFE or NOT SAFE back on earth. 

## Sample Input:
```
5
3 -1 -2 0 0  
```

## Sample Output:
```
SAFE
```

## Sample Case Explanation:
The sum of the thrust values is $3 + (-1) + (-2) + 0 + 0 = 0$. Since the total is zero, the rocket has landed safely, and the output is SAFE. 

**Author: Yoel Han**





