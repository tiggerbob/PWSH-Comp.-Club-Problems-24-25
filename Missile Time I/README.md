# Missile Time I

Your spaceship, the CoolNameHere, has made a wrong turn and is now flying through an asteroid field! Because the CoolNameHere has earlier been severely damaged in the Great Galactic Battle, it can only be hit by a certain number of meteoroids before it is destroyed and all its passengers die. Fortunately, you have missiles and your second in command Gleebork’s planning expertise. Gleebork has accurately determined the locations of every circular meteoroid you will encounter at each hour and has drafted locations to shoot your ship’s square missiles at, using a 2D grid. 

If a missile overlaps a meteorite, that meteoroid will be instantly evaporated and pose no threat to your ship. However, because you are aware Gleebork is much more skilled at determining meteorite locations than planning missile targets, you must determine whether Gleebork’s plan will actually succeed. Print out “We made it!” if the spaceship does not sustain enough damage to be destroyed or the number of hours it would take for the spaceship to be destroyed with Gleebork’s plan.

NOTE: i don’t know the space rock terminology. this must be fixed.

### Input Format
The first line of input consists of an integer s denoting the number of asteroid hits the ship can sustain without being destroyed.
The second line of input consists of an integer h denoting the number hours you will be flying through the asteroid field.
For each of the h hours, 
int a - the number of asteroids you will encounter
a lines containing an integer radius, center x coordinate, and center y coordinate of a circular asteroid
int m - the number of missiles you will shoot
m lines containing an integer side length, center x coordinate, and center y coordinate of a square missile

### Output Format
Output “We made it!” if the ship does not get destroyed or the number of hours it takes for the asteroid to be destroyed.

### Constraints
TODO

### Sample Input
TODO

### Sample Output
TODO

### Sample Case Explanation
TODO

### Notes
I did not see that Teagan had a problem of nearly the exact scenario before writing this, RIP. The main difference between the problems is that Teagan's checks circle-point intersection while mine checks circle-square intersection. Thus, mine is harder but not necessarily better...I think Teagan's presents a much more comprehensable scenario. We can discuss this? :P

**Author: Natalie**
