public class Main {
    public static void main(String[] args) {
        String[] cards1 = {"i", "drink", "water"};
        String[] cards2 = {"want", "to"};
        String[] goal = {"i", "want", "to", "drink", "water"};
        Solution solution = new Solution();
        System.out.println(solution.solution(cards1, cards2, goal)); // "Yes"
    }
}