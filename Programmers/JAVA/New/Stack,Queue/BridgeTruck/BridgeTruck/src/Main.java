public class Main {
    public static void main(String[] args) {
        int bridge_length = 2;
        int weight = 10;
        int[] truck_weights = {7,4,5,6};
        Solution solution = new Solution();
        int result = solution.solution(bridge_length, weight, truck_weights);
        System.out.println(result);
    }
}