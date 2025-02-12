# **Alien Currency Exchange**
An Alien Bank currently holds a balance of $b$ Euna. However, the guards are drunk and are letting criminals through! The bank gets robbed $n$ times. Each robbery attempt involves $k$ robbers and is at time $t$. Each criminal robs $10$% of the bank's balance. An additional $5$% is robbed if it is nighttime ($8:00$ PM - $8:00$ AM, inclusive). However, there is one catch to this alien world's timing: if the hour is $12$, then the minute has to be $0$. Calculate how much each robbing attempt gets, and then output how much money remains in the bank.

## Input Format
The first line contains $b$, the balance of the bank. <br>
The next line contains $n$, the number of robbery attempts. <br>
The following $n$ lines each contain two integers: $k$, the number of robbers, and $t$, the time the bank was robbed. <br>

## Constraints
$0$ $\leq$ $b$ $\leq$ $10^{100}$ <br>
$0$ $\leq$ $n$ $\leq$ $100$ <br>
$0$ $\leq$ $k$ $\leq$ $11$ <br>
$t$ will not be written in military time. <br>

## Output Format
For each robbery attempt, output two lines. The first line will have the amount robbed from the bank rounded to $3$ decimals, and the next line contains the final bank balance rounded to $3$ decimals. 

## Sample Input 
```
1000
1
1 7:30 PM
```

## Sample Output 
```
100.000
900.000
```

## Sample Case Explanation
In this case, the bank has $1000$ Euna left over with $1$ robbery. The robbery only has $1$ person, and the time is not between $8:00$ PM - $8:00$ AM. Therefore, the additional $5$% when robbed at night is not included, resulting in the total percentage robbed being $1 \cdot 10$% $= 10$%. The robbery group then robs $100$ Euna, leaving the bank with $900$ Euna.

**Author: Michael Li**
