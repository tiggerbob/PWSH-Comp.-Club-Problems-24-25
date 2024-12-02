# WareHouse Work

Reff Mezos works at at his favorite company Glamazon Brime. He's tasked with moving packages from the 1st floor to the 2nd, and would like to know what the least number of trips would be to move all the packages.

Reff can carry multiple packages at a time but he can only carry a maximum of 120 pounds. Reff also has a debilitating fear of odd numbers, so he refuses to carry packeges that have odd combined weights.

What is the least amount of trips Reff can take to move all his packages?

### Input Format

The first line contains $N$, a whole number representing the number of packages

The next lines contain a series of space seperated integers representing the weight in pounds of each package. 

### Constraints

The weight of the package is an integer that is guaranteed to be in the range of 1 and 120 inclusive. 

There will always be a way to deliver all the packages.

### Output Format

Output an integer that represent the least number of trips to deliver all the packages.

### Sample Input
```
6
49 29 40 100 34 76 
```

### Sample Output
```
3
```

### Sample Case Explanation:

One trip can be made with the 100 pound package. A second trip can be made with the 76 and 40 pound packages. A third trip can be made with the remaining 3 packages (49, 34, 29).

**Author: Rithvik P**
