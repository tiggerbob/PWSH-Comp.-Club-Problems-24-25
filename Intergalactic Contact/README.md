# Intergalactic Contact

The Earth Council has finally discovered the existence of aliens and is now wishing to 
attempt to make contact with them! In order to do this, they've set up communication equipment on each of $N$ planets $\left(N \leq 10^5\right)$, conveniently numbered from $1$ to $N$. Each planet is able to send and recieve signals on a broadcasting 
frequency $a_i$ $\left(a_i \leq 10^7\right)$, which is guaranteed to be an integer. Two planets can communicate with one another if their broadcasting frequencies differ by at most $D$ $\left(D \leq 100\right)$. 

The Earth Council wants to send a message to the aliens through a series of connections from planet to planet. However, due to budgeting reasons, they want to activate as few communication devices as possible. To do this, the Council will pick some number $P$ and activate the communication devices on all planets $p$ satisfying $p \leq P$. Can you determine the smallest value of $P$ such that contact will be successfully made?

## Input
The first line of input will contain the space-separated numbers $N$ and $D$. 

The next lines of input will contain the broadcasting frequencies of the planets,
where line $i$ contains the broadcasting frequency for planet $i$. 

The last line of input will contain the space-separated broadcasting frequencies for the Earth Council and the aliens.

## Output

A single line containing $P$.

## Sample Input
```
3 30
110
140
125
100 150
```
## Sample Output
```
2
```
## Sample Input Explanation
In the sample input, the Earth Council can make contact with planets 1 and 3, the aliens can make contact with planets 2 and 3, and planet 1 can make contact with planets 2 and 3. The Earth Council can make contact with the aliens by first contacting planet 1 followed by planet 2. There is no way to contact the aliens by only contacting planet 1, so all planets up to planet 2 must be activated.

**Author: Aaron Zhou**
