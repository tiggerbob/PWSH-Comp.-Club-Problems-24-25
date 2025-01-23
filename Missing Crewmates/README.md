# Missing Crewmates

Several crewmates on the ship went on a short trip outside to check for vessel damage, but it seems people have gone missing! Based on the exit and return logs, help them figure out which of their friends have yet to return!

### Input Format

The first line will contain a single integer $N$, denoting the number of crewmates who exited the ship. 
The next $N$ lines will contain strings of varying length with a list of names of the crewmates who exited the ship.

The next line will contain a single integer $M$, denoting the number of crewmates who returned to the ship. 
The next $M$ lines will contain strings with the names of the crewmates who returned to the ship, excluding the missing crewmate(s).


### Constraints

$1 \leq N \leq 10^{8}$

$0 \leq M < N$

### Output Format

$N-M$ lines each with the names of the missing crewmates, in the original order of the exit log.

### Sample Input 
```
3
Alice
Bob
Charlie
1
Charlie
```

### Sample Output
```
Alice
Bob
```

### Sample Case Explanation

There are three crewmates, but only one has returned. The missing crewmates are Alice and Bob, following the order of the original exit log. 

**Author: Teagan Gao**
