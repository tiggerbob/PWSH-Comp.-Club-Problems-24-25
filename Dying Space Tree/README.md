# Dying Space Tree

They are growing a tree in space—a perfect binary search tree, with each node containing a number such that each node’s left side is smaller than itself while its right node is larger than itself. Unfortunately, because it is in space and lacks carbon dioxide, it is slowly dying. Each day, the node on the tree holding the largest value dies and falls off, taking with it all nodes it is currently supporting. You, having a favorite node on the tree, want to know how long it will take for your favorite node to die.

### Input Format
The first line of input consists of an integer n denoting the number of test cases to follow.
For each of the n test cases, 
int f - integer stored in your favorite node
int h - height of the perfect binary search tree
2^h - 1 space separated integers containing the binary tree with idx 0 = node 0, etc etc.


### Output Format
Output the number of days it will take for your favorite node to die.

### Constraints
TODO

### Sample Input
TODO

### Sample Output
TODO

### Sample Explaination
TODO

### Notes
solution:
less than mid = die on height of tree
for loop starting at [int i = height of tree] counting down with pointer at root node
if target leaf < current node, return i
else, decrement i and go right on the tree

this may be too simple? but hm.

**Author: Natalie**
