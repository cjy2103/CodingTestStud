public class Main {
    public static void main(String[] args) {
        int n = 3;
        int [][] computers = {{1,1,0},{1,1,0},{0,0,1}};
        Solution solution = new Solution();
        int result = solution.solution(n,computers);
        System.out.println(result);

    }
}