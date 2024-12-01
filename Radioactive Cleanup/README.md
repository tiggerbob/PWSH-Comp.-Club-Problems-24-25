# Hazard Cleanup

A scientist from the Plano West Computer Club's Research Expeditionary Team (PWSH-RET) accidentally dropped a vial of highly radioactive Glorpanium, and now the fumes are spreading wildly throughout base camp! Base camp is a series of series of uniform connected rooms, all on the same level, that fits within an $N \times M$ grid.

Fortunately, the fumes can only spread to adjacent (touching) rooms with open vents, and their transmission is blocked by rooms whose vents are closed. They also cannot travel through the outside vacuum of space.

Help the PWSH-RET determine how many rooms will need cleanup after the fumes have spread!

### Input Format
The first line contains $N$ and $M$ (space-separated), which is the grid-space over which the problem can be considered.

The next $N$ lines each contain $M$ space-separated characters; each character represents a grid cell. `*` means the cell is empty (no room), `.` indicates a room with open vents, `#` indicates a room with no open vents, and `@` indicates the room where the fumes start spreading from.

### Constraints
$1 \le N \le 10^4$

$1 \le M \le 10^4$

### Output Format
The number of rooms that will need cleanup afterward (when the fumes are done spreading).

### Sample Input
```
4 4
* * . *
* . * #
* # @ *
* . . .
```

### Sample Output
```
4
```

### Sample Case Explanation
We start at the `@` cell. Note that this guarantees at least one room will need cleanup, the origin. Moving up, we find the route blocked, as there is no room. The same goes for moving right. Moving left, we still find the route blocked, as the room has all vents closed. Moving down, however, we find a room with vents open, adding 1 to our total. From that room, we can spread left or right, adding 2 to our total. Each of those rooms is completely blocked off; hence, our answer is $1 + 1 + 1 + 1 = 4$.

**Author: Ryan**