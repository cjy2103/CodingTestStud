import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int [] progresses = {93,30,55};
//        int [] progresses = {95,90,99,99,80,99};
        int [] speeds = {1,30,5};
//        int [] speeds = {1,1,1,1,1,1};

        Solution solution = new Solution();

        int [] answer = solution.solution(progresses, speeds);
        System.out.println(Arrays.toString(answer));

    }
}