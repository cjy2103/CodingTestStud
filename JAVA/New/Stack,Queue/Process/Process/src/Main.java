public class Main {
    public static void main(String[] args) {
        int [] priorities = {2,1,3,2};
        int location = 2;
        Solution solution = new Solution();
        int result = solution.solution(priorities, location);
        System.out.println(result);
    }
}