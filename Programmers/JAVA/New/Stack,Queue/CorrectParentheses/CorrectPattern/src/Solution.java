import java.util.Stack;

public class Solution {
    boolean solution(String s) {
        Stack<Character> stack = new Stack<>();

        for(char c : s.toCharArray()){
            if(c == '('){
                stack.push(c);
            } else {
                if(stack.isEmpty() || stack.peek() != '('){
                    return false;
                }
                stack.pop();
            }
        }

        return stack.isEmpty();
    }
}
