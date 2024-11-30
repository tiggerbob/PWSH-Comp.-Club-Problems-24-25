# Fuel Up

The Plano West Computer Club Officer team has launched a rocket to Mars to start a new Computer Club branch there. However, they realized that the rocket’s fuel was about to run out.

Fortunately, there is a new shipping service that will go to the rocket every day and supply the rocket with the necessary fuel. The rocket requires a varying amount of gallons of fuel each day.
On the $i$-th day, the service sells a gallon of fuel for $p_i$ dollars. Ms. Bailey, the omniscient leader of the PWSH Computer Club, also happens to know the fuel prices and how much fuel the rocket will need for each day the rocket is running.

The shipping service allows the PWSH officers to buy as much fuel as they want, and extra gallons can be used for future days.

Help the PWSH officers spend as little money on fuel as possible and keep the rocket running!

### Input Format

The first line contains an integer $N$ $(1 \leq N \leq 1000)$ that denotes the number of days the PWSH officers will buy fuel.

The next $n$ lines each denote $p_i$, the price of a gallon of fuel that day, and $a_i$, the number of gallons necessary to keep the rocket operating that day.

### Constraints

$1 \leq p_i \leq 1000$

$1 \leq a_i \leq 10000$

### Output Format

The minimum number of dollars the PWSH officers need to spend to sufficiently supply the rocket.

### Sample Input
```
3
3 5
1 2
10 6
```

### Sample Output
```
23
```

### Sample Case Explanation:

On the first day, the officers will buy $5$ gallons for a total of $15$ dollars. Then, on the second day, the officers buy $8$ gallons of fuel for $1$ per gallon, and that will cover the second and third-day requirements. 

**Author: Annie Li**
