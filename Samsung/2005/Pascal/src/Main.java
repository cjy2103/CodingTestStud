import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T;
        T=sc.nextInt();

        for(int test_case = 1; test_case <= T; test_case++)
        {
            int N = sc.nextInt();

            // 파스칼의 삼각형을 저장할 배열
            int[][] triangle = new int[N][N];

            // 첫 번째 줄은 모두 1로 초기화
            for (int i = 0; i < N; i++) {
                triangle[0][i] = 1;
            }

            // 두 번째 줄부터 각 숫자를 계산
            for (int i = 1; i < N; i++) {
                for (int j = 0; j <= i; j++) {
                    if (j == 0 || j == i) {
                        triangle[i][j] = 1;
                    } else {
                        triangle[i][j] = triangle[i - 1][j - 1] + triangle[i - 1][j];
                    }
                }
            }

            // 파스칼의 삼각형을 출력
            System.out.println("#" + test_case);
            for (int i = 0; i < N; i++) {
                for (int j = 0; j <= i; j++) {
                    System.out.print(triangle[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
}