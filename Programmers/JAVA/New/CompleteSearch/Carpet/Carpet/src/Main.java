import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int brown = 10;
        int yellow = 2;
        Solution solution = new Solution();
        int[] result = solution.solution(brown,yellow);
        System.out.println(Arrays.toString(result));
    }
}