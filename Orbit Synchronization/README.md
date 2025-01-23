# Orbit Synchronization

In a distant galaxy, interstellar communication satellites orbit various planets. Each satellite completes its orbit in a specific number of galactic time units. Scientists need to synchronize these satellites to align once every galactic cycle.
You are given the orbital periods of $n$ satellites, and your task is to determine the smallest galactic time $T$ when all satellites align at their starting position simultaneously. Additionally, you need to find the number of complete orbits each satellite will have completed by time $T$.

### Input Format

The first line contains the integer $n$, the number of satellites.
The second line contains $n$ space-separated integers $p_1,p_2,...,p_n$, where $p_i$ is the orbital period of the $i$-th satellite.

### Constraints

$2 \leq n \leq 10^{5}$

$1 \leq p_i \leq 10^{3}$

### Output Format

On the first line, print the smallest galactic time $T$ when all satellites align.
On the second line, print $n$ space-separated integers $c_1,c_2,...,c_n$, where $c_i$ is the number of complete orbits the $i$-th satellite completes by time $T$.

### Sample Input 
```
3
3 4 6
```

### Sample Output
```
12
4 3 2
```

### Sample Case Explanation

The smallest galactic time $T$ when the satellites align is 12. At $T=12$, satellite 1 has completed $12/3=4$ orbits, satellite 2 has completed $12/4=3$ orbits, and satellite 3 has completed $12/6=2$ orbits.

**Author: Teagan Gao**
