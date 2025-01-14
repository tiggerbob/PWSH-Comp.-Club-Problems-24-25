# **Finding the closest Alien**
Scientists are trying to find out which aliens are belonging to which families. It is known each family consists of two aliens and one offspring. To do this, the scientists have decided to talk the offspring DNA of $k$ length, and compare it to a set of $n$ alien DNAs to find the mom and dad. The mom has majoirty A and G bases, and the dad has majority C and T bases. They want to develope a algorithm that will find the the mom and dad. However, the scientists where also too lazy to learn how to property handle DNA, so they reversed the parent DNAs. The scientists decide the best way to determine the offsprings parents is to find the common DNA sequence between the child and the parent with the longest length.

## Input Format
First Line will be DNA of offpsring <br>
Second Line will be a single integer $n$ <br>
The following $n$ lines consists of original parent DNAs <br>

## Contraints
$1$ $\leq$ $k$ $\leq$ $1000$ <br>
$1$ $\leq$ $n$ $\leq$ $1000$ <br>
There will always be one mom and one dad with the longest common DNA sequence.<br>
The amount of A + G Bases will never equal C + T Bases for parent DNAs. <br>

## Output Format
First line will the DNA of the offsprings mom <br>
Second line will be the DNA of the offsprings dad <br>

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

## Sample #0 Explaination
The child DNA is AGCCT. There are two mother DNAs (NGA and GNA) and two father DNAs (TCC and CTC). However, each of these DNA has to be reversed in order to be compared to the child, meaning AGN, ANG, CCT, CTC. Amoung the two mother DNAs, AGN shares AG while ANG only shares A. AGN has the longer length, meaning the mother is NGA. Amoung the two father DNA's, CCT shared CCT while CTC only share CT. Amoung the two father DNAs, CCT has the longer length, meaning the father is TCC.

**Author: Michael Li**
