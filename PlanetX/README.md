# Planet X

## Problem Description

It is the year $2056$. Humans have finally landed on PlanetX. Upon landing on PlanetX, humanity discovered two new species: gleebs and glorbs. A high-tech scanner is used to detect
all lifeforms (i.e. all gleebs and glorbs) in a given region of PlanetX and reads them into a string with no spaces. Your task is to take all the strings that were generated and tally up the number of gleebs and glorbs, respectively, that were detected.

## Input Format

The first line of input consists of an integer $n$ ($1$ $\leq$ $n$ $\leq$ $100$), denoting the number of test cases. <br>
Each of the following $n$ lines contains a string $s$ ($1$ $\leq$ $\mid s\mid$ $\leq$ $100$), representing a lifeform's species code. The string consists of alphanumeric characters only (A-Z, a-z, $0\text{-}9$). <br>

## Output Format

For each test case, output the total number of occurrences of the word "gleeb" and the total number of occurrences of the word "glorb", separated by a space.

## Constraints
Each species code consists only of alphanumeric characters (A-Z, a-z, $0\text{-}9$). <br>
Each string has a length between $1$ and $100$ characters. <br>

## Sample Input
```
5
gleebgleebglorbgleebglorb
glorbgleeb
glorbgreeblegleeb
gleeb
glorbgleebglorb
```

## Sample Output
```
3 2
1 1
1 1
1 0
2 2
```

## Sample Output Explanation

In all strings, we simply look for the occurrences of "gleeb" and "glorb". <br>
In test case $1$, gleeb appears $3$ times, and glorb appears twice. Thus, the output is $3~2$. <br>
In test case $2$, gleeb appears $1$ time, and glorb appears once as well. Thus, the output is $1\text{ }1$. <br>
In test case $3$, gleeb appears $1$ time, and glorb appears once as well. Thus, the output is $1\text{ }1$. <br>
In test case $4$, gleeb appears $1$ time, and glorb never appears. Thus, the output is $1\text{ }0$. <br>
In test case $5$, gleeb appears $2$ times, and glorb appears twice as well. Thus, the output is $2\text{ }2$.


**Author: Ramy Hijazi**
