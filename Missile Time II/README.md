# Missile Time II

You’re in charge of preventing stray meteors from hitting your ship. Luckily, the ship is equipped with remotely detonating missiles, but you only have one left today! Can you destroy all of the meteors, or will you have to change the trajectory of your ship?

### Input Format

The first line contains $N$, the number of meteors.
The next $N$ lines contain space-separated integer or floating point coordinates of each meteor, $(X_{1}, Y_{1})...(X_{N}, Y_{N})$. The meteor is stationary. 

The next line is the integer or floating point blast radius of your missile, $M$.

### Constraints

$2 \leq N < 10^{3}$

$-10^{5} < X < 10^{5}$

$-10^{5} < Y < 10^{5}$

$0 \leq M < 10^{10}$

### Output Format

“KABOOM” if you can destroy all the meteors with your missile, otherwise “RECHART COURSE”.

### Sample Input 
```
2
2 0.5
1 1
1
```

### Sample Output
```
KABOOM
```

### Sample Case Explanation

A missile centered at (1.5, 0.75) would include both meteors inside its blast radius, destroying both of them. Thus, “KABOOM” is displayed. 

**Author: Teagan Gao**
