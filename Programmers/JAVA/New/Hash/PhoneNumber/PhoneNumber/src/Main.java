public class Main {
    public static void main(String[] args) {
        String [] phoneBook = {"119", "97674223", "1195524421"};
//        String [] phoneBook = {"119", "456", "789"};
//        String [] phoneBook = {"12", "123", "1235","567","88"};
        Solution solution = new Solution();
        boolean answer = solution.solution(phoneBook);
        System.out.println(answer);
    }
}