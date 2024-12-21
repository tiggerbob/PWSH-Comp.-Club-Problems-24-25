# Definitely Not Among Us

In a turn of events nobody could have ever foretold, a dead body has been discovered on the exploration ship set out to reach planet 135-spn-1x13, killed by at least one impostor. Luckily, a crewmate can be confirmed innocent if at least one other innocent crewmate says they are innocent. Unfortunately, impostors can also claim to confirm others on the ship as innocent. Help the crew discover and eject the impostors among them! It is guaranteed that it is possible to find the number of impostors.

### Input Format
The first line of input consists of an integer n denoting the number of test cases to follow.
For each of the n test cases, 
- int i - number of impostors
- int c - number of total crewmates, including impostors
- an unknown number of lines lines containing two integers, the name of someone on the ship and name of who they are claiming to be able to confirm innocent

### Output Format
Output the names of the impostors on separate lines.

### Constraints
```
5 <= c <= 7500 
1 <= i <= c
```

### Sample Input
```
1
2
5
1 5 
2 3
1 4
2 5
3 5
4 3
5 4
```

### Sample Output
```
1
2
```

### Sample Explaination
2/5 of all crewmates are impostors. 5 is innocent because 1, 2, and 3 vouched for them, and it is not possible that they are all impostors. 4 is innocent because 5 vouched for them. 3 is innocent because 4 vouched for them. Thus, 1 and 2 have to be the impostors.

### Notes
A crewmate can be confirmed innocent via Logic if there is a chain of numImpostors+1 people that say they’re innocent. Not sure how evident this is. Probably evident enough?

**Author: Natalie**
