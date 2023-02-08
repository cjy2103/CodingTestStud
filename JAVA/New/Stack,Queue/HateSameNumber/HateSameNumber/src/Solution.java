import java.util.Stack;

public class Solution {

    public int[] solution(int []arr){
        Stack<Integer> stack = new Stack<>();
        int temp = -1;
        for (int i : arr) {
            if (temp != i) {
                stack.push(i);
                temp = i;
            }
        }

        int[] answer = new int[stack.size()];

        for(int i= answer.length-1;i>=0;i--){
            answer[i] = stack.pop();
        }

        return answer;
    }

}
