# Asteroid Miner

Nick wants to become the world's best asteroid miner. To earn this title, he must mine the maximum amount of resources while using the least amount of spaceship fuel per mining operation. Each asteroid contains a fixed amount of resources and requires a specific amount of fuel to mine. Given a limited fuel supply, determine the maximum total resources Nick can collect without exceeding the available fuel.


## Input Format:
The first line will contain two integers $n$ and $F$ $(1 \leq n \leq
10^5, 1 \leq F \leq 10^9)$, representing the number of asteroids and the amount of total fuel available.

The next n lines will contain two integers $r[i]$ and $f[i]$ 
$(1 \leq r[i], f[i] \leq 10^6)$, representing the resource value and
fuel cost of the i-th asteroid.

## Output Format:
The output will be a single integer which is the maximum resources
that can be collected without exceeding the available fuel.

## Sample Input:
```
4 10
6 3
10 5
4 2
7 4
```
## Sample Output:
```
20
```
## Sample Case Explanation:
Nick has a total fuel capacity of 10, and the goal is to collect the maximum resources without exceeding this fuel. First, asteroid 3 (4 resources, 2 fuel) is chosen, leaving 8 fuel. Then, asteroid 1 (6 resources, 3 fuel) is selected, leaving 5 fuel. Finally, asteroid 2 (10 resources, 5 fuel) is mined, using up all the remaining fuel. Asteroid 4 (7 resources, 4 fuel) is not chosen because its fuel cost would prevent mining the higher-value asteroid 2. This results in a total of 20 resources collected, with 10 fuel used, which is the optimal outcome.

**Author: Yoel Han**
 
