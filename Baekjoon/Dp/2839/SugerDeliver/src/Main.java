import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Solution solution = new Solution();

        int sugar = sc.nextInt();
        int answer = solution.solution(sugar);

        System.out.println(answer);

    }
}