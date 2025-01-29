# Astroid Miner

Nick wants to be the world's best Astroid Miner. In order for him to
earn this title, he needs to find the most optimal way to mine the 
most resources with the least amount of spaceship fuel 
used per mine. Each astroid has a fixed number of resources and a 
specific fuel cost required to mine it. Determine the maximum total
resources nick can acquire wihtout exceeding the
available fuel spaceship has.


## Input Format:
The first line will contain two integers $n$ and $F$ $(1 \leq n \leq
10^5, 1 \leq F \leq 10^9)$, representing the number astroids and
number of total fuel available.

The next n lines will contain two integers $r[i]$ and $f[i]$ 
$(1 \leq r[i], f[i] \leq 10^6)$, representing the resource value and
fuel cost of the i-th astroid.

## Output Format:
The output will be a single integer which is the maximum resources
that can be collected without exceeding the available fuel.

## Sample Input:
```
5 15
4 3
5 4
3 2
8 6
6 5
```
## Sample Output:
```
17
```
## Sample Case Explanation:
Nick has a total fuel capacity of $15$. The optimal strategy to maximize resources is:

Mine asteroid 3 (resources = $3$, fuel = $2$).
Mine asteroid 1 (resources = $4$, fuel = $3$).
Mine asteroid 2 (resources = $5$, fuel = $4$).
Mine asteroid 5 (resources = $6$, fuel = $5$).
The total resources collected are $3 + 4 + 5 + 6 = 17$, and the total fuel used is $2 + 3 + 4 + 5 = 14$, which does not exceed the fuel limit.

**Author: Yoel Han**
 
