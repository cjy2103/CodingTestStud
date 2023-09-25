import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        Solution solution = new Solution();

        int result = solution.solution(N);
        System.out.println(result);
    }
}