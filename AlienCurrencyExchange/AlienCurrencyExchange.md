# **Alien Currency Exchange**
Alien Hesper is trying to exchange $x$ amount of Ghede's currency of Ghoa for Zephyr's currency called Euna. How every upon the reading the rules of this the currency exchange, he gets confused and can not perform it correctly. The rules are as the following: <br>
1) He must break up the number into individual number positions(Ex: $134$ => $100$ + $30$ + $4$)
2) The maximum exchange rate is $1$ Ghoa = $7552701074431167$ Euna. This applies to the smallest number position. For the next greatest number position, the new rate is $80$% of the previous exchange rate. 
3) The total value is the sum of all the calcluations of each exchange for the each number position.
4) Each calculated value in the process must be truncated to be an integer (the definition of an integer in middle school math classes)
5) $\mid$ $x$ $\mid$ Ghoa $=$ $\mid$ $-x$ $\mid$ Ghoa, but $x$ and $-x$ have opposite signs
<br>

## Input Format
Integer $x$ representing the amount of Ghoa


## Contraints
$-9.99$ $*$ $10^15$ $\leq$ $x$ $\leq$ $9.99e$ $*$ $10^15$

## Output
Integer representing the equivalent amount of Euna.

## Sample Input #0
```
11
```

## Sample Out #0
```
81569171603856603
```

## Sample #0 Explaination
```
11 => 10 + 1
Currencies at Individual Number Positions:  10 * 7552701074431167 = 75527010744311670
              Recalculating Exchange Rate: 7552701074431167 * 0.8 = 6042160859544933
Currencies at Individual Number Positions:   1 * 6042160859544933 = 6042160859544933
Summing Result: 75527010744311670 + 6042160859544933 = 81569171603856603
```

#### Author: Michael Li
