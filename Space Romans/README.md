# Space Romans

It's the year 2225, and humanity is at war with the Space Romans!

Luckily, the Global Bureau of Human Intelligence Affairs (GBHIA) has just intercepted a transmission from the Space Roman high command detailing their entire battle plans, including the coordinates of strike points.

Coincidentally, the numbers in the transmission are based on a similar numeral system to Earth's Ancient Romans: Letters represent values, and sequences of letters add up to a single value. However, Space Roman numerals use different letters and values than we are used to, and the GBHIA has yet to decode their meaning. Furthermore, Space Romans only use $4$ symbols, and they always list numerals in nonincreasing order. (For example, M before C and C before V in our Roman numeral system.)

One critical piece of information that the GBHIA *have* deciphered is that the first $4$ numbers on any Space Roman transmission represent years exactly $300, 200, 100,$ and $0$ before the date of transmission (the year 2225), and they are guaranteed to include all $4$ distinct Space Roman symbols. Could this help the GBHIA determine the rest of the numbers (strike points) in the transmission?

Your task is to crack the Space Roman numeral system and decode each of $N$ strike points in the transmission, producing a series of integers ($s_i$).

### Input Format
The first line contains $N$, the number of strike points to decode.

The next $4$ lines contain the years exactly $300, 200, 100,$ and $0$ before present day in Space Roman numerals (in that order).

The next $N$ lines each contain a string of Space Roman numerals, which must be resolved to the strike point ($s_i$) they represent.

### Constraints
$1 \le N \le 10^3$

Space Roman numerals are all uppercase characters guaranteed to represent integers in the range $[1, 2000]$ that can be solved from the 4-number header. They are not guaranteed to represent distinct values.

### Output Format
$N$ lines containing the integer values of the strike points ($s_i$) encoded by each sequence of Space Roman numerals.

### Sample Input
```
4
IIIIIIIIIIMUUHHHHHHHH
IIIIIIMMUUUUUUUUUH
IIIIIIMMMUUUUHHHHHHHHHH
IIMMMMMMMMUUUHHHHHHHH
IIIMM
IMUH
IMU
I
```

### Sample Output
```
815
425
405
175
```

### Sample Case Explanation
The first line tells us $N = 4$.

Next, we have the 4 dates we are interested in. We know that the next 4 lines represent 2225 (the current year), 2125 (1 century prior), 2025 (2 centuries prior), and 1925 (3 centuries prior). For each date, we can set up a system of equations to determine the relationship between $I, M, U, H,$ and base 10 numbers. For example, the first equation gives $10 \times I + 1 \times M + 2 \times U + 8 \times H = 2225$. Note that since the numerals are guaranteed to appear in nonincreasing order in each sequence, we do not have to worry about subtraction that would exist with numbers like IX in Earth's Roman numeral system. Setting up the rest of the equations and solving yields $I, M, U, H = 175, 145, 85, 20$ (respectively).

The remaining $N = 4$ lines give us the now-decodable strike points ($s_i$).

$IIIM = 3 \times 175 + 2 \times 145 = \underline{815}$

$IMUH = 1 \times 175 + 1 \times 145 + 1 \times 85 + 1 \times 20 = \underline{425}$

$IMU = 1 \times 175 + 1 \times 145 + 1 \times 85 = \underline{405}$

$I = 1 \times 175 = \underline{175}$

**Author: Ryan**