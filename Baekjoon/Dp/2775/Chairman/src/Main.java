import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt(); // 테스트 케이스 수

        for (int t = 0; t < T; t++) {
            int k = scanner.nextInt(); // 층
            int n = scanner.nextInt(); // 호

            int[][] apt = new int[k + 1][n + 1];

            // 0층의 i호에는 i명이 산다.
            for (int i = 1; i <= n; i++) {
                apt[0][i] = i;
            }

            // 나머지 층과 호에 대한 거주민 수 계산
            for (int i = 1; i <= k; i++) {
                for (int j = 1; j <= n; j++) {
                    apt[i][j] = apt[i - 1][j] + apt[i][j - 1];
                }
            }

            System.out.println(apt[k][n]);
        }
    }
}