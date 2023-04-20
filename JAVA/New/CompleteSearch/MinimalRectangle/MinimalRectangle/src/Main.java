public class Main {
    public static void main(String[] args) {
//        int [][] sizes = {{60,50},{30,70},{60,30},{80,40}};
        int [][] sizes = {{10,7},{12,3},{8,15},{14,7},{5,15}};
        Solution solution = new Solution();
        int answer = solution.solution(sizes);
        System.out.println(answer);
    }
}