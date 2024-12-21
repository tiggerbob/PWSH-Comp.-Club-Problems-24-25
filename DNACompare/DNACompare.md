# **Finding the closest Alien**
Scientists are trying to find out which aliens are belonging to which families. It is known each family consists of two aliens and one offspring. To do this Scientists have decided to talk the offspring DNA of $k$ length, and compare it to a set of $n$ alien DNAs to find the mom and dad. The mom has majority A and G bases, and The dad has majority C and T bases. They want to develope a algorithm that will find the match for them. The Scientists decide the best way to determine the offsprings parents is to find the longest matching DNA sequence for both mom and dad.

## Input Format
First Line will be DNA of offpsring <br>
Second Line will be a single integer $n$ <br>
The following $n$ lines consists of original parent DNAs <br>

## Contraints
1 $\leq$ $k$ $\leq$ 300 <br>
1 $\leq$ $n$ $\leq$ 300

## Output Format
First line will the DNA of the offsprings mom <br>
Second line will be the DNA of the offsprings dad

## Sample Input #1
```
AGCT
4
AGN
ANG
CCT
CTC
```

## Sample Input #2
```
AGN
CCT
```
