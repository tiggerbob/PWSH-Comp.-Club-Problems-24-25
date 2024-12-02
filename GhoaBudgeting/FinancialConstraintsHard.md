# **Ghoa Budgeting**
Alien Astra Calytrix lives in a planet called Ghede with a special currency called Ghoa. In addition, Alien Astra Calytrix is the dad of a family of Alien with the family name Calytrix with the current family balance Ghoa of $b$. Due to the Calytrix family's mom having a travel jobs, she might not be home at the $c$ year. Astra also has $n$ children, each wanting their own amount of Ghoa from their dad. His children, just like Astra, are greedy and will take the the the amount they want an infinite number of times. Astra, being greedy, wants to divide his balance of Ghoa to the least people possible, while giving his wife double the amount of $m$ Ghoa she wants. However, since Astra is greedy himself, he will not give is wife any Ghoa if she is not at home. 
Unfortunately, the law in the Ghede preventes him from taking any money for himself after he distributes the money to his children. If he is caught with money after he distributes, he will be arrested. If it is possible for avoid arrest, he will take that option over taking the extra money for himself.
Calytrix family's mom is called Odin Calytrix. It is known that she started her job on year $e$ and will take another trip every $k$ years. Astra wants to program a solution to this, but he failed Intro to Java with a 20! Astra asks you for help, giving you an addition payment of %u% Ghoa. He wants to know if you (the contestant) and his wife can recieve right amount of Ghoa. If he can, print out how many addition children he is willing to pay for. If he can not, print out "Not Possible".

## Input Format
The first line contains two integer input in their respective order: $e$ and $k$
The second line contains two integer input in their respective order: $m$ and $u$
The thrid line contains two integer input in their respective order : $c$ and $b$
The fourth line contains one integer: $n$
The following $n$ lines contains $n$ doubles, representing all the individual balances the children demand

## Contraints
0 $\leq$ $e$ $\leq$ 2000 <br>
0 $\leq$ $k$ $\leq$ $100$ <br>
0 $\leq$ $m$ $\leq$ 1e7 <br>
0 $\leq$ $u$ $\leq$ 1e7 <br>
0 $\leq$ $c$ $\leq$ 1e15 <br>
0 $\leq$ $b$ $\leq$ 1e14 <br>
0 $\leq$ $n$ $\leq$ 5000 <br>
0 $\leq$ $individual$ $children$ $demands$ $\leq$ 1e6

## Output
The number of children Astra is willing to pay, the phrase "Not Possible", or the Phrase "Arrested"

## Sample Input #1
```
1000 12
120 560
1011 10560
2
15 197
```

## Sample Input #2
```
2
```
