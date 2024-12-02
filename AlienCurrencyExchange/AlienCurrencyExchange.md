# **Alien Currency Exchange**
Alien Hesper is trying to exchange $x$ amount of Ghede's currency of Ghoa for Zephyr's currency called Euna. How every upon the reading the rules of this the currency exchange, he gets confused and can not perform it correctly. The rules are as the following: 
1) He must break up the number into individual number positions(Ex: 134 => 100 + 30 + 4)
2) The maximum exchange rate is 1 Ghoa = 7552701074431167 Euna. This applies to the smallest number position. For the next smallest number position, the new rate is 80% of the previous exchange rate. 
3) The total value is the sum of all the calcluations of each exchange for the each number position.
4) Each calculated value in the process must be an integer or truncated to be an integer <br>

These rules are all good, until he realizes there inflation of the Euna. This inflation means the number that has been calculated are base 8 rather than base 10, but he can only read in base 10! Hesper needs your help to understand how much currency he really has. If his currency is unable to adjust to inflation, he requests you print out "Exchange Failed".

## Input Format
an integer representing the amount of Ghoa as %x%

## Contraints
-1e5 $\leq$ $x$ $\leq$ 9.99e15

## Output
an integer representing the equivalent amount of Euna.

## Sample Input #0
'''
1
'''

## Sample Output #0
'''
271227334832759
'''

## Sample Input #1
```
11
```

## Sample Out #1
```
Exchanged Failed
```
