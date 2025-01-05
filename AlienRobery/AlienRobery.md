# **Alien Currency Exchange**
An Alien Bank holds currenct an $b$ balance of of Euna. However, the guards are drunk are letting criminals through. The Bank gets robbed $n$ times. Each robbery attempt has a group of $k$ people, with at $t$ time. Each criminal robes $10$% of the balance. An additional $5$% is robbed if it is night time ($8$: $00$ PM - $8$: $00$ AM Inclusive). Calculate how much each criminal attempet gets, then output how much the bank remains.

## Input Format
The first line is the $b$ balance of the bank <br>
The second line is $n$ robbery times <br>
The following $n$ lines contains two integer: $k$ people and $t$ time robbed <br>

## Contraints
$0$ $\leq$ $b$ $\leq$ $10^{100}$ <br>
$0$ $\leq$ $n$ $\leq$ $100$ <br>
$0$ $\leq$ $k$ $\leq$ $11$ <br>
$t$ will not be written in military time <br>

## Output
$n$ lines of the balanced robbed from the bank rounded to $3$ decimals <br>
Then, the final bank balance rounded to $3$ decimals<br>

## Sample Input #0
```
1000
1
1 7:30 PM
```

## Sample Output #0
```
100.000
900.000
```

## Sample #0 Explaination
In this case, the bank has $1000$ Euna left over with 1 robbery. The robbery only has $1$ person, and the time is not between $8$: $00$ PM - $8$: $00$ AM, meaning the percentage robbed is $1$ * $10$% without the additional $5$% robbed at night, leaving a total of $10$% of being robbed. The robbery group robs $100$ Euna, leaving the bank with $900$ Euna in the Alien Bank.

**Author: Michael Li**
