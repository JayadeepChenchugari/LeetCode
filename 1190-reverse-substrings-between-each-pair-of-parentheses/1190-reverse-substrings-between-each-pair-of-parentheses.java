import java.util.*;

class Solution {
    public String reverseParentheses(String s) {
        Stack<Character> stack = new Stack<>();
        
        for (char c : s.toCharArray()) {
            if (c == ')') {
                // Collect characters inside the parentheses
                StringBuilder sb = new StringBuilder();
                while (!stack.isEmpty() && stack.peek() != '(') {
                    sb.append(stack.pop());
                }
                stack.pop(); // Remove the '('
                
                // Push reversed characters back onto the stack
                for (char ch : sb.toString().toCharArray()) {
                    stack.push(ch);
                }
            } else {
                stack.push(c);
            }
        }
        
        // Build the final result
        StringBuilder result = new StringBuilder();
        for (char c : stack) {
            result.append(c);
        }
        
        return result.toString();
    }
}
