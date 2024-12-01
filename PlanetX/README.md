Problem Description

It is the year 2056. Humans have finally landed on PlanetX. Upon landing on PlanetX, humanity discovered two new species: gleebs and glorbs. A high-tech scanner is used to detect
all lifeforms, (i.e. all gleebs and glorbs), on a given region of PlanetX and read them into a string with no spaces. Your task is to take all the strings that were generated and tally up the amount of gleebs and glorbs, respectively, that were detected.

Input Format

The first line of input consists of an integer n (1 ≤ n ≤ 100), denoting the number of test cases.
Each of the following n lines contains a string s (1 ≤ |s| ≤ 100), representing a lifeform's species code. The string consists of alphanumeric characters only (A-Z, a-z, 0-9).

Output Format

For each test case, output:
The total number of occurrences of the word "gleeb".
The total number of occurrences of the word "glorb".

Constraints
Each species code consists only of alphanumeric characters (A-Z, a-z, 0-9).
Each string has a length between 1 and 100 characters.

Sample Input

5
gleebgleebglorbgleebglorb
glorbgleeb
glorbgreeblegleeb
gleeb
glorbgleebglorb

Sample Output

3 2
1 1
1 1
1 0
2 2


