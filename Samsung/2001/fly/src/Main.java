import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T;
        T=sc.nextInt();

        for(int test_case = 1; test_case <= T; test_case++)
        {
            int N = sc.nextInt(); // 배열 크기 입력
            int M = sc.nextInt(); // 파리채 크기 입력

            int[][] arr = new int[N][N];

            // 배열 입력
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    arr[i][j] = sc.nextInt();
                }
            }

            int maxSum = 0;

            // 파리채 이동
            for (int i = 0; i <= N - M; i++) {
                for (int j = 0; j <= N - M; j++) {
                    int sum = 0;

                    // 파리채 영역의 합 구하기
                    for (int x = i; x < i + M; x++) {
                        for (int y = j; y < j + M; y++) {
                            sum += arr[x][y];
                        }
                    }

                    // 현재까지의 최대 합보다 크면 업데이트
                    if (sum > maxSum) {
                        maxSum = sum;
                    }
                }
            }

            System.out.println("#" + test_case + " " + maxSum);
        }

    }
}