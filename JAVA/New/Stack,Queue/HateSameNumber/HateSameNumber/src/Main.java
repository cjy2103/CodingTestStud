import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//        int[] array = {1,1,3,3,0,1,1};
//        int[] array = {4,4,4,3,3};
        int[] array = {0,1,2,3,4,5};

        Solution solution = new Solution();
        int [] test = solution.solution(array);
        System.out.println(Arrays.toString(test));
    }
}