Problem Description

In the year 2150, humanity has developed an advanced spaceship capable of traveling across the galaxy. The spaceship's speed is measured in terms of light years per second (LY/s), and the ship's onboard computer provides readings of the current speed over time as a series of numbers.

The spaceship's control system displays the speed readings as a string of space-separated numbers. The captain of the spaceship needs to monitor the ship's speed and ensure it stays within the safe range.

A safe speed is a speed reading that falls within the range of 10 to 100 light years per second, inclusive. Any speed reading outside this range is considered unsafe.

You are tasked with helping the spaceship’s captain by determining how many speed readings are safe and how many are unsafe, based on a series of measurements.

Your task:
For each test case, determine:

The number of safe speed readings.
The number of unsafe speed readings.

Input Format

The first line of input consists of an integer n (1 ≤ n ≤ 100), representing the number of test cases (i.e., different speed readings).
Each of the following n lines contains a string s (1 ≤ |s| ≤ 100), where s contains space-separated integers representing the spaceship's speed readings in light years per second.


Output Format

For each test case, output:

The total number of safe speed readings (those between 10 and 100 inclusive).
The total number of unsafe speed readings (those outside the range of 10 to 100).
Each result should be printed on a new line, with the counts of safe and unsafe readings separated by spaces.

Constraints

Each speed reading is an integer between 1 and 999.
Each test case contains a sequence of space-separated integers with a length between 1 and 100 characters.

Sample Input

4
15 50 105 90
100 5 200 10
99 150 50 101
10 11 9 90

Sample Output

3 1
2 2
2 2
3 1


Author: Ramy Hijazi
