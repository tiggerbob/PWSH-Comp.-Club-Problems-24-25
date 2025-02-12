# **Finding the Closest Alien**
Scientists are trying to find out which aliens belong to which families, consisting of two aliens and one offspring. The mom's DNA has a majority of A and G bases, and the dad's DNA has a majority of C and T bases. 

The scientists want to develop an algorithm that will find the alien's parents. To do this, the scientists have decided to compare the offspring DNA (length $k$) to a set of $n$ alien DNAs to find its parents. However, the scientists were also too lazy to learn how to properly handle DNA, so they accidentally reversed the parent DNAs. They then decide the best way to determine the offspring's parents is to find the common DNA sequence between the child and the parent with the longest length.

## Input Format
The first line contains the DNA of the offspring. <br>
The second line will be a single integer $n$, the number of given DNA strings. <br>
The following $n$ lines each contain a potential DNA string of the parents. <br>

## Constraints
$1$ $\leq$ $k$ $\leq$ $900$ <br>
$1$ $\leq$ $n$ $\leq$ $900$ <br>
There will always be one mom and one dad with the longest common DNA sequence.<br>
The amount of A and G Bases in the mother's DNA will never equal the number of C + T Bases in the father's DNA. <br>

## Output Format
Output two lines, with the first containing the DNA of the offspring's mom and the second containing the DNA of the offspring's dad. <br>

## Sample Input #0
```
AGCCT
4
NGA
GNA
TCC
CTC
```

## Sample Output #0
```
NGA
TCC
```

## Sample #0 Explanation
The child's DNA is AGCCT. There are two mother DNAs (NGA and GNA) and two father DNAs (TCC and CTC). However, each of these DNA strings has to be reversed to be compared to the child, so we reverse them to get AGN, ANG, CCT, and CTC respectively. Among the two mother DNAs, AGN shares AG while ANG only shares A. AGN has a longer shared length, meaning the mother's DNA is NGA. Among the two father DNAs, CCT shares CCT while CTC only shares CT. Among the two father DNAs, CCT has the longer shared length, meaning the father's DNA is TCC.

**Author: Michael Li**
