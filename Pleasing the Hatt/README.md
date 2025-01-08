# Pleasing the Hatt

Members of the Plano West Computer Club's Research Expeditionary Team (PWSH-RET) are stranded among beings of a distant alien species, known to researchers as Programyirs. Any chance they make it out alive hinges on their ability to please the leader of the Programyirs, Java the Hatt.

Hatt is known to love numbers that sum to $7777777$ (seven $7$'s). In fact, of all the numbers he has seen in the entire universe, $7777777$ is his favorite. The PWSH-RET has collected $N$ shells ($1\le N \le 10^9$), each with $m_i \space(i \in \{1, 2, ..., n-1, n\})$ markings.

Your task is to find how many pairs of shells have markings that sum to Java the Hatt's favorite number ($777777$). Note that it does not matter how many ways there are to form those pairs, only the maximum number of pairs that can be formed at a time (without using a shell more than once). A pair must consist of $2$ shells.

### Input Format
The first line of input contains an integer $N$ denoting the number of shells collected.

The next $N$ lines contain the number of markings ($m_i$) for each of the $N$ shells.

### Constraints
$1 \le N \le 10^6$

$1 \le m_i \le 10^8$

### Output Format
TODO

### Sample Input
```
7
7777777
8888888
6666666
1111111
1
7777776
12345678
```

### Sample Output
```
2
```

### Sample Case Explanation
The first line tells us that we need to read 7 shells.

The first shell has $7777777$ markings, which unfortunately means it cannot form any pairs with other shells, since $m_i > 0$. Likewise, the second shell cannot be used, since it has $8888888 > 7777777$ markings.

But the third and fourth shells sum to $6666666 + 1111111 = 7777777$, so this is a valid pair. And the fifth and sixth shells sum to $7777776 + 1 = 7777777$, so this is also a valid pair. The last shell cannot be paired with any others (we have used up shells 3-6), so we can ignore it at this point.

### Notes
To solve this problem within time constraints, a solution of $O(N)$ is required.

**Author: Ryan**