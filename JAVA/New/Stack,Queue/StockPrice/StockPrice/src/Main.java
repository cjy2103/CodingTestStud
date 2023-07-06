import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//        int[] prices = {1,2,3,4,5};
//        int[] prices = {3,2,3,4,5};
        int[] prices = {1,2,3,2,3};
        Solution solution = new Solution();
        int [] result = solution.solution(prices);
        System.out.println(Arrays.toString(result));
    }
}