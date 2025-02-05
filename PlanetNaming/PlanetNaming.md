# Planetary Naming

Your best friend Caz Armadillo has discovered a new planet and is now entitled to be the one to choose a new name for it! However, the guidelines for naming planets have become rather complex over the years, so Caz has come to you, an expert in the field of Planetary Naming, with a list of name ideas for help. Your job is to find the name with the smallest number of character operations — insertions, deletions, and substitutions — necessary to make the name fit the planetary naming guidelines. If two names require the same number of operations, you should favor the one that comes first. <br>

The Planetary Naming Conventions are as follows:
- The first character in every name should be a capital letter.
- The name may not contain “earth”, no matter the capitalization.
- The name must contain every letter (case sensitive) in its namers’ (Caz Armadillo) full name at least once.
- If the name contains an odd number of capitalized letters, it must have an odd number of digits $0$ - $9$.

## Input Format
The first line of input consists of an integer $n$ denoting the number of test cases to follow. <br>
For each of the $n$ test cases:
- String $s$ - one name
- String $s$ has a length of $k$

## Output Format
The name requires the least number of character operations to become a legal name.

## Constraints
$1$ $\leq$ $n$ $\leq$ $11000$ <br>
$1$ $\leq$ $k$ $\leq$ $11000$ <br>
All given names will be alphanumeric. <br>

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
1) ```eARTHCANDY```: This name is missing the letters {a, r, i, z, l, m, o} from the name Caz Armadillo. Additionally, the first letter needs to be capitalized, and there has to be an additional number because of the odd number of capitals. However, this name only requires $9$ changes ($7$ missing name letters $+$ $1$ beginning capitalization $+$ $1$ additional number to satisfy the odd number of capitals) because the ```eARTH``` can naturally be corrected by replacing the letter with another capital letter that is not ```E```, satisfying both the capital condition and the "earth" condition
2) ```IfYouAreReadingThisMessageYouShouldKnowYouAreAwesomeAndDeserveLaserGuns```: This name is missing the letters {C, z} from the name Caz Armadillo. There are no more needed changes because of the even number of capitals, and the first letter is already a capital. A "C" and "z" are required to be added, only requiring $2$ changes. 

This means ```IfYouAreReadingThisMessageYouShouldKnowYouAreAwesomeAndDeserveLaserGuns``` requires less changes ($2$ $<$ $9$).<br>
**Fun Fact: You should really tryout some laser guns!!!** 

**Author and Teacher: Natalie**<br>
**Student: Michael**<br>
