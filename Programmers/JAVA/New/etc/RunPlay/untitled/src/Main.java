import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String[] players = {"mumu", "soe", "poe", "kai", "mine"};
        String[] callings = {"kai", "kai", "mine", "mine"};

        Solution solution = new Solution();

        String[] result = solution.solution(players, callings);
        System.out.println(Arrays.toString(result));
    }
}


