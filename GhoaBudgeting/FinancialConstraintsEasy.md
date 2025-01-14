# **Ghoa Budgeting**
Alien Astra Calytrix lives in a planet called Ghede with a special currency called Ghoa. He has the family balance of $b$ Ghoa to divide amoung his $n$ children. Each child wants their own amount of Ghoa from the family balance. His children, just like Astra, are greedy and will take the the the amount they want an infinite number of times. Astra wants to divide the family balance of Ghoa to with the least number of payments. In addition, Astra can pay his children in any order he chooses, but must pay his children if he is able to. Astra wants to program a solution to this, but he failed Intro to Java with a $20$%! Astra asks you for help. He wants to know the maximum money he will have left after he distributes the money with the minimum number of payments to his children.

## Input Format
The first line contains one integer: $b$ <br>
The second line contains one integer: $n$ <br>
The following $n$ lines contains $n$ doubles, representing all the individual balances the children demand <br>
The individual children demands will be given in sorted increasing order<br>

## Contraints
$0$ $\leq$ $b$ $\leq$ $10^{9}$ <br>
$0$ $\leq$ $n$ $\leq$ $7$ $\times$ $10^{6}$ <br>
$0$ $\leq$ $individual$ $children$ $demands$ $\leq$ $10^{8}$ <br>

## Output
Two Integers: First one being the money left, second one being the number of payments

## Sample Input #0
```
500
2
1 7
```

## Sample Output #0
```
0 74
```

## Explaination for Sample #0
In order for Astra to have the minimum number of payments, he need to pay the children asking for $7$ Ghoa $71$ times, $500$ $-$ $7$ $\times$ $71$ $=$ $3$. After, he pays the children asking for $1$ Ghoa $3$ time. $3$ $-$ $3$ $\times$ $1$ $=$ $0$ remaining for Astra himself. Adding the number of times he has paid his children, he has $71$ + $3$ = $74$.

**Author: Michael Li**
