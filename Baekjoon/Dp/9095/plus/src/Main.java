import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); // 테스트 케이스의 개수

        while (t-- > 0) {
            int n = sc.nextInt(); // 정수 n

            // 다이나믹 프로그래밍을 위한 배열 초기화
            int[] dp = new int[n + 1];
            dp[0] = 1; // 0을 만드는 방법은 아무것도 선택하지 않는 1가지 방법

            // 1부터 n까지의 방법의 수 계산
            for (int i = 1; i <= n; i++) {
                if (i >= 1) dp[i] += dp[i - 1];
                if (i >= 2) dp[i] += dp[i - 2];
                if (i >= 3) dp[i] += dp[i - 3];
            }

            System.out.println(dp[n]);
        }

        sc.close();
    }

}