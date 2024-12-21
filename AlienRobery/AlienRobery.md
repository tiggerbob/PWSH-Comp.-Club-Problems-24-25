# **Alien Currency Exchange**
An Alien Bank holds currenct an $b$ balance of of Euna. However, the guards are drunk are letting criminals through. The Bank gets robbed $n$ times. Each robbery attempt has a group of $k$ people, with at $t$ time. Each criminal robes 10% of the balance. An additional 5% is robbed if it is night time (8:00 PM - 8:00 AM). Calculate how much each criminal attempte gets, then output how much the bank remains.

## Input Format
The first line is the $b$ balance of the bank
The second line is $n$ robbery times
The following $n$ lines contains two integer: %k% people and %t% time robbed

## Contraints
0 $\leq$ $b$ $\leq$ 1e7 <br>
0 $\leq$ $n$ $\leq$ 1e15 <br>
0 $\leq$ $k$ $\leq$ 1e8 <br>
$t$ will not be written in military time

## Output
$n$ lines of the balanced robbed from the bank
Then, the final bank balance.

## Sample Input #0
```
1000
1
1 7:30 PM
```

## Sample Output #0
```
100
900
```
