public class Main {
    public static void main(String[] args) {
        int [][] triangle = {{7},{3,8},{8,1,0},{2,7,4,4},{4,5,2,6,5}};
        Solution solution = new Solution();
        int result = solution.solution(triangle);
        System.out.println(result);
    }
}