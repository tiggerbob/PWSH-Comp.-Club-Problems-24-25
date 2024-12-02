# **Finding the closest Alien**
Scientists are trying to find out which aliens are belonging to which families. It is known each family consists of two aliens and one offspring. To do this Scientists have decided to talk the offspring DNA of $k$ length, and compare it to a set of $n$ alien DNAs to find the mom and dad. The mom has majoirty A and G bases, and The dad has majority C and T bases. However, the Scientists used ChatGPT to get their college degree and are too lazy to find matches in DNA themselves. They want to develope a algorithm that will find the match for them. In addition, the scientists where also too lazy to learn how to property handle DNA, so they reversed the parent DNA and programmed the DNA reading machine to skip every 4th base. The Scientists decide the best way to determine the offsprings parents is to find the longest matching DNA sequence for both mom and dad.

## Input Format
First Line will be DNA of offpsring
Second Line will be a single integer $n$
The following %n% lines consists of original parent DNAs

## Contraints
1 $\leq$ $k$ $\leq$ 300 <br>
1 $\leq$ $n$ $\leq$ 300

## Output Format
First ling will the DNA of the offsprings mom
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
