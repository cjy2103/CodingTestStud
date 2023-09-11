public class Main {
    public static void main(String[] args) {
        String begin = "hit";
        String target = "cog";
        String [] words = {"hot","dot","dog","lot","log","cog"};
        Solution solution = new Solution();
        int result = solution.solution(begin,target,words);
        System.out.println(result);
    }
}