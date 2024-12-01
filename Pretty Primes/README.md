# Pretty Primes

You and your best friend Caz have gotten into a heated argument over what makes a planet beautiful. You are sure that the greater the sum of a [planet’s quantities that are prime]//todo word this better, the more beautiful it is, unless the sum is not a prime number at all, in which case it loses half (rounded up) of its beauty. Quantities include the number of a planet’s moons, rings, local suns, and neighboring planets. To change their mind, you’ve resolved to find the most beautiful planet to show them. You’ve already compiled a list of some planets, but now you need to pick the prettiest one of the bunch.

### Input Format
The first line of input consists of an integer n denoting the number of test cases to follow.
For each of the n test cases, 
- int p - number of planets
- p lines containing integers m, r, s, and n (moons, rings, suns, neighboring planets)

### Constraints
TODO

### Output Format
Return the beauty of the most beautiful planet.

### Sample Input
2
2
2 2 2 1
3 5 1 3
2
2 2 4 2
1 1 1 1

### Sample Output
7
4

### Sample Case Explanation
In the first test case, the sum of all the prime numbers in the first planet's quantities is 2+2+2+1=7, and the sum of the second planet's is 3+5+1+3=12. The second planet's sum is not a prime number, however, so its beauty score is halved: 12/2=6. 7 is greater than 6, so the first planet is more beautiful and 7 is printed.
In the second test case, the sum of all prime numbers in the first planet's quantities is 2+2+2=6, and the sum of the second planet's is 1+1+1+1=4. The first planet's sum is not prime, so its beauty score is halved: 6/2=3. The beauty of the second planet is larger, so the second planet is more beautiful andd 4 is printed.

### Notes
(Optional)

**Author: Natalie**
