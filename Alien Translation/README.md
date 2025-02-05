# Drwlehlool


Humanity has finally made contact with aliens in a distant galaxy. Unfortunately, the aliens do not know any English. A cipher was discovered that could encode a message in English into the aliens' language.

Take the message “helloworld” for example. 
* The first letter “h” would be the first letter of the encoded message. 
* The next letter “e” would be appended to the left side of “h”, giving us “eh”. 
* “l” would be appended to the right side of the encoded string, giving us “ehl”.
* The appended letters will then alternate to left, right, left, right, etc.

Using this cipher, “helloworld” becomes “drwlehlool”. **Decrypt** the aliens’ messages into English.

### Input Format

The first line contains $N$ $(1 \leq N \leq 1000)$, the number of messages to be decrypted. 

The next $N$ lines each have a message to be decrypted. The entire line is considered to be the message. 

### Constraints

The message will only contain alphanumeric characters and will be at most $50$ characters long.

### Output Format

Output $N$ lines with the decoded message on every line. 

### Sample Input
```
4
drwlehlool
?mhyoyasi nbd oe
gitrv n seiuetei trwn htease olf h nvreadeeyhn
4w-tofryto2
```

### Sample Output
```
helloworld
is anybody home?
the answer to life the universe and everything
forty-two42
```

### Sample Case Explanation:

For each message, we perform the opposite of the encryption process, resulting in “helloworld”, “is anybody home?”, “the answer to life the universe and everything”, and “forty-two42”. 

### Notes:

difficulty can easily be adjusted by making ppl do fast i/o or not (will probably make people do it)

**Author: Annie Li**
