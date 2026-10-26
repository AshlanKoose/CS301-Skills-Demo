import java.util.*;
public class Parentheses {
    public static void main(String[] args) {
        StdOut.println("Input string:");
        String s = StdIn.readString();
        IO.println(isBalanced(s));
    }
 
    public static boolean isBalanced(String s) {
        Stack<Character> stack = new Stack<Character>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '('){
                stack.push('(');
            } else if (s.charAt(i) == '{'){
                stack.push('{');
            } else if (s.charAt(i) == '['){
                stack.push('[');
            } else if (s.charAt(i) == ')'){
                if (stack.isEmpty() || stack.pop() != '('){
                    return false;
                }
            } else if (s.charAt(i) == '}'){
                if (stack.isEmpty() || stack.pop() != '{'){
                    return false;
                }
            } else if (s.charAt(i) == ']'){
                if (stack.isEmpty() || stack.pop() != '['){
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
