package Valid_Parentheses;

import java.util.Stack;

public class ValidParentheses {

    public static boolean isValid(String s) {

        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            if(c == '(' || c == '[' || c == '{') {
                stack.push(c);
            }
            else if(c == ')' || c == '}' || c == ']') {
                if (stack.isEmpty()) {
                    return false;
                }
                char top = stack.pop();
                if ((top == '(' && c!= ')') || (top == '[' && c!= ']') || (top == '{' && c!= '}')) {
                    return false;
                }
            }
        }
       return stack.isEmpty();
    }

    
    public static void main(String[] args) {
       System.out.println(isValid("{}[)()"));
    }
}
