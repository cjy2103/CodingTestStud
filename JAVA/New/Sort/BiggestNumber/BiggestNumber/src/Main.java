import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
//        int [] numbers = {6,10,2};
        int [] numbers = {3,30,34,5,9};
        Solution solution = new Solution();
        String answer = solution.solution(numbers);
        System.out.println(answer);

//        Arrays.sort(array, Comparator.reverseOrder());
//        System.out.println(Arrays.toString(array));
    }
}