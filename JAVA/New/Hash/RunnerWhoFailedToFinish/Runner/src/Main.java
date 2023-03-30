public class Main {
    public static void main(String[] args) {
        String [] participant = {"leo", "kiki", "eden"};
//        String [] participant = {"marina", "josipa", "nikola", "vinko", "filipa"};
//        String [] participant = {"mislav", "stanko", "mislav", "ana"};
//        String [] participant = {"mislav", "mislav", "mislav", "mislav"};
        String [] completion = {"eden", "kiki"};
//        String [] completion = {"josipa", "filipa", "marina", "nikola"};
//        String [] completion = {"mislav","mislav","mislav"};
        Solution solution = new Solution();
        String answer = solution.solution(participant, completion);
        System.out.println(answer);
    }
}