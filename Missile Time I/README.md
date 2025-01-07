# Missile Time

Your spaceship, the CoolNameHere, has made a wrong turn and is now flying through an asteroid field! Because the CoolNameHere has earlier been severely damaged in the Great Galactic Battle, it can only be hit by a certain number of asteroids before it is destroyed and all its passengers die. Fortunately, you have the budget to shoot up to 1 missile per hour and your second in command's, Gleebork’s, planning expertise. 

Using their psychic powers, Gleebork has accurately predicted the locations of every circular meteoroid you will encounter at each hour and has drafted locations to shoot your ship’s square missiles at, using a 2D grid. If a missile overlaps or touches an asteroid, it will be instantly evaporated and pose no threat to your ship. However, because you are aware Gleebork is much more skilled at predicting asteroid locations than planning missile targets, you must determine whether Gleebork’s plan will actually succeed.

### Input Format
The first line of input consists of an integer s denoting the number of asteroid hits the ship can sustain without being destroyed.
The second line of input consists of an integer h denoting the number hours you will be flying through the asteroid field.
For each of the h hours, 
- int $l$ - an integer side length of a square missile
- int $x$ - an integer center x coordinate of a square missile
- int $y$ - an integer center y coordinate of a square missile
- int $a$ - the number of asteroids you will encounter
- $a$ lines containing an integer radius, center x coordinate, and center y coordinate of a circular asteroid

### Output Format
Output the number of hours it takes for the asteroid to be destroyed or “We made it!” if the ship does not get destroyed.

### Constraints
- s
- h
- l
- x
- y
- my hands are so cold i will finish this in like 5 minutes i can't type properly

- $-10^9$ $\leq$ $f$ $\leq$ $10^9$ <br>
- $1$ $<$ $2^{\text{h}}$ $-$ $1$ $<$ $10^{\text{18}}$ <br>

### Sample Input
```
2
2
2
1
3
1
1 1 1
2
0
0
1
5 5 5
```

### Sample Output
```
We made it!
```

### Sample Case Explanation
During the first hour, a missile of sidelength 2 with its center at (1,3) is launched, and the only asteroid that appears has a radius of 1 and a center at (1,1). The missile intersects with the asteroid at its top, so it is destroyed. The ship is hit 0 times this hour.

During the second hour, a missile of sidelength 2 with its center at (0,0) is launched, and the only asteroid that appears has a radius of 5 and a center at (5,5). The missile does not intersect with the asteroid anywhere, so the ship is hit 1 time this hour.

In total, the ship is hit 1 time, which is less than how many times it can be hit, 2, so "We made it!" is printed.

### Notes
The solution techncially could be improved for certain cases where it's impossible to sustain enough damage (eg. ship can be hit 3 times but only 2 asteroids ever appear), but I don't see that as the point of the problem, so :P

**Author: Natalie**
