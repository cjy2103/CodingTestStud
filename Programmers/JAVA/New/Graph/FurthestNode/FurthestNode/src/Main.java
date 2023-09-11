public class Main {
    public static void main(String[] args) {
        int n = 6;
        int [][] edges = {{3,6},{4,3},{3,2},{1,3},{1,2},{2,4},{5,2}};
        Solution solution = new Solution();
        int result = solution.solution(n,edges);
        System.out.println(result);
    }
}