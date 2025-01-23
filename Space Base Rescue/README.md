# Space Base Rescue

In a galaxy far away, there are $n$ rooms connected by $m$ one-way corridors. You are stationed in a starting room and must determine how many rooms are reachable from your starting location and the total number of civilians you can evacuate from these rooms.
Each room has a certain number of civilians, and you can only visit rooms that are reachable through the corridors from your starting location.

### Input Format

The first line contains two integers $n$ and $m$, denoting the number of rooms and corridors, respectively.
The second line contains $n$ integers $c_1,c_2,...,c_n$, where $c_i$ is the number of civilians in room $i$.
The next $m$ lines each contain two integers $u$ and $v$, indicating a corridor from room $u$ to room $v$.
The last line contains an integer $s$, the starting room.

### Constraints

$2 \leq n \leq 10^{5}$

$1 \leq m \leq 10^{5}$

$0 \leq c_i \leq 10^{3}$

$1 \leq s \leq n$

### Output Format

The first line should contain the total number of civilians you can evacuate. The second line should contain the number of reachable rooms from your starting position.

### Sample Input 
```
6 7
5 10 0 20 15 25
1 2
1 3
2 4
3 5
4 5
5 6
6 1
1
```

### Sample Output
```
75
6
```

### Sample Case Explanation

Starting from room 1, the reachable rooms are 1, 2, 3, 4, 5, and 6. The total number of civilians in these rooms are $5 + 10 + 0 + 20 + 15 + 25 = 75$.

**Author: Teagan Gao**
