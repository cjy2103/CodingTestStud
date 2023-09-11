import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String[] wallpaper = {".#...", "..#..", "...#."};
        Solution solution = new Solution();
        int[] result = solution.solution(wallpaper);
        System.out.println(Arrays.toString(result));
    }
}