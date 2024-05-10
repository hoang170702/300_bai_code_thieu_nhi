# VALID PARENTHESESES


#### CREATE A NEW STACK TO PUSH CHARACTER INTO IT
```
Stack<Character> stack = new Stack<>();
```
#### CREATE A FOREACH TO RUN AHEAD CHAR TO END CHAR

```
 for (char c : s.toCharArray())
```

#### IF CHAR EQUALS ( OR [ OR {, WE PUSH IT TO STACK

```
 if(c == '(' || c == '[' || c == '{') {
                stack.push(c);
    }
```

#### ELSE IF CHAR EQUALS ) OR ] OR }, WE COMPARE IT WITH STACT POP CHAR
```
 else if(c == ')' || c == '}' || c == ']') {
                if (stack.isEmpty()) {
                    return false;
                }
                char top = stack.pop();
                if ((top == '(' && c!= ')') || (top == '[' && c!= ']') || (top == '{' && c!= '}')) {
                    return false;
                }
}
```

#### RETURN STACK.ISEMPTY (TRUE) IF THE SAME BLOCK OPEN AND CLOSE 
```
 return stack.isEmpty();
```