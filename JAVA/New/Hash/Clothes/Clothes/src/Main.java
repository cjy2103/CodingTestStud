public class Main {
    public static void main(String[] args) {
        String [][] clothes = {{"yellow_hat", "headgear"}, {"blue_sunglasses", "eyewear"}
                , {"green_turban", "headgear"}};
        Solution solution = new Solution();
        int result = solution.solution(clothes);
        System.out.println(result);
    }
}