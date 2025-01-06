# The Zypher's Cyphers

## Problem Description

In the distant future, a group of astronauts is exploring a newly discovered planet named Astron. During their exploration, they have encountered an alien species known as the Zyphers, who communicate using special symbols in the form of numbers. The Zyphers' communication consists of sequences of numbers, but they only use two distinct symbols: $1$ and $0$. Every sequence of $1$'s and $0$'s represents a unique message from the Zyphers. Your task is to decode the messages. A valid message is a sequence of $1$'s and $0$'s that contains: <br>
* At least one $1$ and at least one $0$.
* The message should not start or end with more than one $0$ or $1$ (no consecutive $0$'s or $1$'s at the beginning or end). <br>
  
Given a set of messages, you need to find:
* The number of valid messages.
* The number of invalid messages. <br>
  
A valid message: 
* Contains at least one $1$ and one $0$.
* Does not start or end with consecutive $0$'s or $1$'s. <br>

## Input Format
The first line contains an integer $n$ ($1$ $\leq$ $n$ $\leq$ $100$), the number of messages to decode. <br>
Each of the following $n$ lines contains a string $s$ consisting of only the characters $1$ and $0$ ($1$ $\leq$ $\mid$ $s$ $\mid$ $\leq$ $100$), representing a message from the Zyphers. <br>

## Output Format

For each test case, output: <br>
* The total number of valid messages.
* The total number of invalid messages. <br>

Each result should be printed on a new line, with the count of valid messages first, followed by the count of invalid messages.

## Constraints

Each message string consists only of the characters $1$ and $0$. <br>
Each string has a length between $1$ and $100$ characters. <br>
There is no need to handle empty strings. <br>

## Sample Input
```
5
101
1101
111
000
010
```

## Sample output
```
3 2
```

## Sample output explanation

We are tasked with determining the number of valid and invalid messages based on the given rules for decoding Zypher messages. Each message is a sequence of 1's and 0's, and the rules for valid messages are:

A valid message:
Contains at least one 1 and one 0.
Does not start or end with consecutive 1's or 0's (i.e., no sequence like 00 or 11 at the beginning or end).
Input Details:
The input consists of:

An integer n (the number of test cases/messages).
Followed by n strings, each representing a message from the Zyphers.

The sample input indicates that we have 5 test cases, and, as mentioned,
each test case is a string of only ones and zeros.

Test Case 1: 101
This string contains both 1's and 0's, and no consecutive 1's or 0's at the beginning or end.
Valid message.

Test Case 2: 1101
This string contains both 1's and 0's, and no consecutive 1's or 0's at the beginning or end.
Valid message.

Test Case 3: 111
This string contains only 1's and no 0's.
Invalid message because it lacks at least one 0.

Test Case 4: 000
This string contains only 0's and no 1's.
Invalid message because it lacks at least one 1.

Test Case 5: 010
This string contains both 1's and 0's, and no consecutive 1's or 0's at the beginning or end.
Valid message.

Now, we output the number of valid messages followed by the number of invalid messages, seperated by a space.
3 valid messages and 2 invalid messages results in an output of [3, 2].

#### Author: Ramy Hijazi
