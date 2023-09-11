import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int [] answers = {1,2,3,4,5};
        Solution solution = new Solution();
        int [] answer = solution.solution(answers);
        System.out.println(Arrays.toString(answer));
    }
}