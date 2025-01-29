# Black Hole Escape

While exploring the cosmos to spread the joys of computer science, the spaceship crew accidentally piloted their ship too close to a massive black hole. 

Each of the crew members proposes a plan of action for the ship to implement to escape the black hole. The ship can take three actions every turn: move forward a single-digit number of light years, refuel, or do nothing (represented by $0$). Every light year the ship travels consumes $2$ gallons of fuel, and every refuel refills the ship’s tank by $3$ gallons. For every action the ship takes, the black hole sucks the ship back in by $4$ light years. 

Which member's plan should the ship follow?

### Input Format

The first line contains $N$, the starting amount of fuel the ship has, and $l$, the ship’s starting distance from the black hole. 

The next $6$ lines contain each of the officers’ names, followed by a space, and then their respective plans.  Let $r$ represent the ship refueling. 

### Constraints

At most one crew member will have a successful plan. The successful plan cannot have the ship’s total fuel or distance from the black hole be negative at any point. There is no limit on how much fuel the ship’s tank can hold. 

The strings representing the plans are guaranteed to only contain the aforementioned alphanumeric representations and are all valid moves, and the lengths are guaranteed to be between $1$ and $1000$ characters. 

### Output Format

Output the name of the crew member who proposed the successful plan or “none” if there is not a successful plan.

### Sample Input
```
14 5
a 7r1r5rr46rr64r8 
b 4rr247r891
c 3845361736282938464529293751
d rrrrrrrrrrrrrrrrrrr
e rr4rr2r85r85r2r3r1r2r4r5r6r7r8r9r1r2r3
f 1r3
```

### Sample Output
```
f
```

### Sample Case Explanation:

At the end of crew member f's action string, the ship will have $9$ gallons of fuel left and be $5$ light years from the black hole, the only plan with both of those values not negative. 

### Notes
numbers for traveling, refuelling, and black hole shenanigans have not been tweaked so they might change

**Author: Annie Li**
