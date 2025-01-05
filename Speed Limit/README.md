# Speed Limit

## Problem Description

In the year 2200, humanity has developed a fleet of advanced spaceships capable of traveling across the galaxy. Each spaceship’s speed is measured in light years per second (LY/s), and the onboard system continuously monitors the spaceship’s speed.

The spaceship's control system generates a series of speed readings, and you must help the spaceship's captain determine if the spaceship is traveling at a safe or unsafe speed.

A safe speed is a speed between 10 and 100 inclusive.
An unsafe speed is any speed that is below 10 or above 100. <br>

Your task: <br>
For each test case, check each speed reading to determine if it is safe or unsafe.

## Input Format

The first line contains an integer $n$ ($1$ $\leq$ $n$ $\leq$ $100$), representing the number of test cases (i.e., different speed readings). <br>
Each of the following n lines contains a string $s$ ($1$ $\leq$ $\mid$ $s$ $\mid$ $\leq$ $100$), containing space-separated integers. Each integer represents a spaceship speed rating in light years per second. <br>

## Output Format

For each test case, output: <br>

For each speed, print ```safe``` if it falls between $10$ and $100$ (inclusive), or ```unsafe``` if it is outside this range. <br>
Each result should be printed on a new line. <br>

## Constraints
Each speed reading is an integer between $1$ and $999$. <br>
Each test case contains a sequence of space-separated integers with a length between $1$ and $100$ characters. <br>

## Sample Input
```
3
15 50 105 90
100 5 200 10
99 150 50 101
```

## Sample output 
```
safe safe unsafe safe
safe unsafe unsafe safe
safe unsafe safe unsafe
```

**Author: Ramy Hijazi**
