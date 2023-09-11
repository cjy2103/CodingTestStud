import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array = {1,5,2,6,3,7,4};
        int[][] commands = {{2,5,3},{4,4,1},{1,7,3}};
        Solution solution = new Solution();
        int[] answer = solution.solution(array,commands);

        System.out.println(Arrays.toString(answer));
    }
}