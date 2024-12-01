# Space Romans

It's the year 2225, and humanity is at war with the Space Romans!

Luckily, the Global Bureau of Human Intelligence Affairs (GBHIA) has just intercepted a ***completely unencrypted*** transmission from the Space Roman high command. It details their entire battle plans for the late-2225 counteroffensive, including the coordinates of planned critical strike points.

Coincidentally, the Space Romans use a similar numbering system to the Ancient Romans on Earth: Letters represent certain numeral denominations, and they can be interpreted in the same order as Ancient Roman numerals; a smaller numeral before a larger one represents subtraction, and vice versa. However, Space Roman numerals use completely different letters that represent completely different values than we are used to, and the GBHIA has yet to decode their meaning. Furthermore, Space Romans only use $4$ symbols, compared to $7$ on Earth.

One critical piece of information that the GBHIA *have* deciphered is that the first $4$ numbers on any Space Roman transmission represent years exactly $3, 2, 1,$ and $0$ centuries before present day, and they are guaranteed to include all $4$ distinct Space Roman symbols. Could this help the GBHIA determine the rest of the numbers (strike points) in the transmission?

Your task is to crack the Space Roman numeral system and decode each of $N$ strike points (integers $s_i$) in the transmission.

### Input Format
The first line contains $N$, the number of strike points to decode.

The next $4$ lines contain, as described above, the years exactly $3, 2, 1,$ and $1$ centuries before present day.

The next $N$ lines each contain a string of Space Roman numerals, which must be resolved to the integer ($s_i$) they represent.

### Constraints
$1 \le N \le 10^3$

$1 \le s_i \le 10^4$

The Space Roman numeral code is guaranteed to be decipherable from the first 4 numbers, and it is also guaranteed to follow standard Ancient Roman numeral dating convention. (The largest number appears first.)

### Output Format
$N$ lines containing the integer values of the strike points ($s_i$) encoded by each sequence of Space Roman numerals.

### Sample Input
```
4
DDYYOOP
DDYOOP
DDOOP
DYDOOP
DYDP
DDDDYDP
DD
OYP
```

### Sample Output
```
1905
4905
2000
95
```

### Sample Case Explanation
The first line tells us $N = 4$.

Next, we have the 4 dates we are interested in. We know that the next 4 lines represent 2225 (the current year), 2125 (1 century prior), 2025 (2 centuries prior), and 1925 (3 centuries prior). For each date, we can set up a system of equations to determine the relationship between D, Y, O, P, and base 10 numbers. For example, the first equation gives $D + D + Y + Y + O + O + P = 2 \times (D + Y + O) + P = 2225$. Note that we know the numerals appear in descending order because it is impossible for two "smaller" numerals to appear before a "larger" one. We could set up the rest of the equations and solve for $D, Y, O,$ and $P$ (4 equations for 4 unknowns), but an astute observer may see that $D, Y, O,$ and $P$ are simply aliases in this case for $M, C, X,$ and $V$ in our Roman numeral system. (You can test it out yourself: $2 \times (M + C + X) + V = 2 \times (1110) + 5 = 2225$.) Of course, other test cases do not necessarily follow this rule, so be prepared to solve equations. Also note that this particular Space Roman numbering system does not encode for the value 1, meaning not all integers can actually be represented with their system - Space Romans are not renowned for their mathematical prowess!

The remaining $N = 4$ lines give us the now-decodable strike points ($s_i$).

$DYDP = 1000 + (1000 - 100) + 5 = \underline{1905}$

$DDDDYDP = 1000 + 1000 + 1000 + 1000 + (1000 - 100) + 5 = \underline{4905}$

$DD = 1000 + 1000 = \underline{2000}$

$OYP = (100 - 10) + 5 = \underline{95}$

### Notes
The problem becomes relatively easy once we determine the values encoded by each numeral. Furthermore, we have 4 unknown values (the numerals) and 4 equations (the dates/centuries), and we are guaranteed a solvable system of equations.

**Author: Ryan**