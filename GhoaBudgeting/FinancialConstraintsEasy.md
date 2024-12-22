# **Ghoa Budgeting**
Alien Astra Calytrix lives in a planet called Ghede with a special currency called Ghoa. In addition, Alien Astra Calytrix is the dad of a family of Alien with the family name Calytrix with the current family balance Ghoa of $b$. Astra also has $n$ children, each wanting their own amount of Ghoa from their dad. His children, just like Astra, are greedy and will take the the the amount they want an infinite number of times. Astra, being greedy, wants to divide his balance of Ghoa to with the least number of payments paying of each his chilren in the order given from right to left.
Astra wants to program a solution to this, but he failed Intro to Java with a 20! Astra asks you for help. He wants to know how much money he will have left after he distributes the money the way he wishes.

## Input Format
The fist line contains on integer input: $b$
The second line contains $n$
The third line following $n$ number contains $n$ doubles, representing all the individual balances the children demand

## Contraints
0 $\leq$ $b$ $\leq$ 10000 <br>
0 $\leq$ $n$ $\leq$ 1000 <br>
0 $\leq$ $individual$ $children$ $demands$ $\leq$ 750

## Output
The money Astra is left it after paying the least number of payments

## Sample Input #1
```
500
2
1 7
```

## Sample Input #2
```
0
```
There is 500 Ghoa that is needed to split. To minimize the amount of payments, he needs to pay the children asking for 7 Ghoa 71 times, 500-497=3. With the reamining 3 Ghoa, the children asking for 1 Ghoa is paid 3 times. This leaves Astra with 0 Ghoa left with the minimum number of payments.
