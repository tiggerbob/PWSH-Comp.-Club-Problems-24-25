## The Zypher's Cyphers

# Problem Description

In the distant future, a group of astronauts is exploring a newly discovered planet named Astron. During their exploration, they have encountered an alien species known as the Zyphers, who communicate using special symbols in the form of numbers. The Zyphers' communication consists of sequences of numbers, but they only use two distinct symbols: 1 and 0. Every sequence of 1's and 0's represents a unique message from the Zyphers. Your task is to decode the messages. A valid message is a sequence of 1's and 0's that contains: <br>
*At least one 1 and at least one 0.
*The message should not start or end with more than one 0 or 1 (no consecutive 0's or 1's at the beginning or end).
*Given a set of messages, you need to find:

The number of valid messages.
The number of invalid messages.
A valid message:

Contains at least one 1 and one 0.
Does not start or end with consecutive 0's or 1's.

Input Format

The first line contains an integer n (1 ≤ n ≤ 100), the number of messages to decode.
Each of the following n lines contains a string s consisting of only the characters 1 and 0 (1 ≤ |s| ≤ 100), representing a message from the Zyphers.
Output Format

For each test case, output:

The total number of valid messages.
The total number of invalid messages.
Each result should be printed on a new line, with the count of valid messages first, followed by the count of invalid messages.

Constraints

Each message string consists only of the characters 1 and 0.
Each string has a length between 1 and 100 characters.
There is no need to handle empty strings.

Sample Input

5
101
1101
111
000
010

Sample output

3 2

Author: Ramy Hijazi
