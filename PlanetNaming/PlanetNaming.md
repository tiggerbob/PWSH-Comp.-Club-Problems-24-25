# Planetary Naming

Your best friend Caz Armadillo has discovered a new planet and is now entitled to be the one to choose a new name for it! However, the guidelines for naming planets have become rather complex over the years, so Caz has come to you, an expert in the field of Planetary Naming, with a list of name ideas for help. Your job is to find the name with the smallest number of character operations — insertions, deletions, and substitutions — necessary to make the name fit the planetary naming guidelines. If two names require the same number of operations, you should favor the one that comes first. <br>

The Planetary Naming Conventions are as follows:
- The first character in every name should be a capital letter
- The name may not contain “earth”, no matter the capitalization
- The name must contain every letter (case sensitive) in its namers’ (Caz Armadillo) full name at least once
- If the name contains an odd number of capitalized letters, it must have an odd number of digits $0$-$9$.

## Input Format
The first line of input consists of an integer $n$ denoting the number of test cases to follow. <br>
For each of the $n$ test cases:
- String $s$ - one name
- String $s$ has a length of $k$

## Output Format
The name requires the least number of character operations to become a legal name.

## Constraints
$1$ $\leq$ $n$ $\leq$ $10000$ <br>
$1$ $\leq$ $k$ $\leq$ $10000$ <br>
All given names will be Alphanumeric <br>

## Sample Input
```
2
eARTHCANdy
IfYouAreReadingThisMessageYouShouldKnowYouAreAwesomeAndDeserveLaserGuns
```

## Sample Output
```
IfYouAreReadingThisMessageYouShouldKnowYouAreAwesomeAndDeserveLaserGuns
```

## Sample Case Explanation
There are two names here: <br>
1) ```eARTHCANDY```: This name is mising the letters {a, r, i, z, l, m, o} from the namer Caz Armadillo. Additional, the first letter needs to be capitalized, and there has to be an addition number becuase the odd number of capitals. However, this name only requires $9$ changes ( $7$ Missing Namer Letters $+$ $1$ Beginning Captialization $+$ $1$ Addition Number to Satisfy the Odd Number of Captials) becuase the ```eARTH``` can naturally be corrected by replacing the letter with another Captial Letter that is not ```E```, satisifying both the captial condition and earth condition
2) ```IfYouAreReadingThisMessageYouShouldKnowYouAreAwesomeAndDeserveLaserGuns```: This name is mising the letters {C, z} from the namer Caz Armadillo. Their is no more needed changes becuase the even number of capitals and the first letter is captial. A "C" and "z" is required to be added, only requiring $2$ changes. 

This means ```IfYouAreReadingThisMessageYouShouldKnowYouAreAwesomeAndDeserveLaserGuns``` requires less changes ($2$ $<$ $9$).<br>
**Fun Fact: You should really tryout some laser guns!!!** 

## Note
Because of physical storage limitation, both $n$ and $k$ have to be under $10000$. As a result, the time out limit will have to be reduced to around $3$ seconds to maintain the difficulty of the question.


**Author and Teacher: Natalie**<br>
**Student: Michael**<br>
