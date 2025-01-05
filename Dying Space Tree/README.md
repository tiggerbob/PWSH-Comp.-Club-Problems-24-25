# Dying Space Tree

They are growing a tree in space: a perfect binary search tree, with each node containing a unique number such that each node’s left side is smaller than itself while its right node is larger than itself. Unfortunately, because it is in space and lacks carbon dioxide, it is slowly dying. Each day, the node on the tree holding the largest value dies and falls off, taking with it all nodes it is currently supporting. You, having a favorite node on the tree, want to know how long it will take for your favorite node to die.

### Input Format
The first line of input consists of an integer n denoting the number of test cases to follow.
For each of the n test cases, 
- int $f$ - integer stored in your favorite node
- int $h$ - height of the perfect binary search tree
- $2$^{h} - $1$ space separated integers containing the binary tree with idx $0$ $=$ node $0$, etc etc.

### Output Format
Output the number of days it will take for your favorite node to die.

### Constraints
- $-10^9$ $\leq$ $f$ $\leq$ $10^9$ <br>
- $1$ $<$ \[2^{h}\]-$1$ $<$ $10^18$ <br>

### Sample Input
```
2
5 
3
3 1 5 0 2 4 7
1
3
3 1 5 0 2 4 7
```

### Sample Output
```
2
```

### Sample Explaination
The first test case's binary tree looks like this:
```
       3
   1      5
  0 2    4  7
```
On the first day, the node containing $7$ falls off. On the second day, the node containing $5$ falls off, which is the favorite number. Therefore $2$ is printed.

The second test case's binary tree looks like this: (it is the same)
```
       3
   1      5
  0 2    4  7
```
On the first day, the node containing $7$ falls off. On the second day, the node containging $5$ falls off. On the third day, the node containing $3$ falls off. $1$, the favorite number, is attached to the $3$ node. It took $3$ days for it to fall of, so $3$ is printed.

### Notes
solution:
less than mid = die on height of tree <br>
for loop starting at [int $i$ $=$ height of tree] counting down with pointer at root node <br>
if target leaf < current node, return i <br>
else, decrement i and go right on the tree <br>

this may be too simple? but hm. binary trees <3 <r>

**Author: Natalie**
