# Picky Potatoes

Astronauts Mark and Mindy are trapped on Mars with no way to escape. They have since turned to cultivating potatoes as their primary food source. 

Their first harvest yields them $N$ potatoes with each potato being a different type. The satiety of the $i$-th potato is $s_i$. However, due to the mineral-poor Martian soil, some potatoes have rotted, so their satiety can be positive, zero, or negative. 

Mark is very hungry, so he will eat one of every potato regardless of its satiety level. 

Mindy, on the other hand, will choose a subset $[a, b]~(1 < a, b < N)$ of the harvest and eat one of every potato type included in that subset. This subset cannot be the entire harvest $(1 \neq a, b \neq N)$. 

Mark will only be happy if the total satiety level of the potatoes he ate is greater than the total satiety level of the potatoes Mindy ate. Find out if he will be happy by the end of the harvest. 

### Input Format

The first line contains $t$, the total number of test cases. 

For each of the $t$ test cases, the first line contains $N$, the number of potatoes in the harvest. The next line contains $N$ integers $s_1, s_2, \ldots~, s_N$ denoting each of the potatoes’ satiety levels. 

### Constraints

$2 \leq N \leq 10^5$

$-10^9 \leq s_i \leq 10^9$

### Output Format

Output “:)” if Mark is happy and “:(“ if he is not. 

### Sample Input
```
3
3
1000 997 -1
3
1 2 3
3
2 -2 2
```

### Sample Output
```
:(
:)
:(
```

### Sample Case Explanation:

Mindy can select $[0,1]$ for a satiety level of $1997$ compared to Mark’s $1996$ in case $1$. 
 
For the second case, there is no subset where Mindy’s satiety levels are higher than Mark’s. 

In the third case, Mark’s satiety level is $2$, but Mindy can select $[0]$ or $[2]$ to get the same satiety level. 

**Author: Annie Li**
