public class Main {
    public static void main(String[] args) {
        int k = 80;
        int [][] dungeons = {{80,20},{50,40},{30,10}};
        Solution solution = new Solution();
        int result = solution.solution(k,dungeons);
        System.out.println(result);
    }
}