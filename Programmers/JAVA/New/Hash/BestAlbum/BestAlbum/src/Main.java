import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String [] genres = {"classic", "pop", "classic", "classic", "pop"};
        int [] plays = {500, 600, 150, 800, 2500};
        Solution solution = new Solution();
        int [] result = solution.solution(genres, plays);
        System.out.println(Arrays.toString(result));
    }
}