import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//        String[] park = {"SOO","OOO","OOO"};
//        String[] routes = {"E 2","S 2","W 1"};
        String[] park = {"OSO","OOO","OXO","OOO"};
        String[] routes = {"E 2","S 3","W 1"};
        Solution solution = new Solution();

        int[] result = solution.solution(park,routes);

        System.out.println(Arrays.toString(result));
    }
}