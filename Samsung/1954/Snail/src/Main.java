import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T;
        T=sc.nextInt();

        for(int test_case = 1; test_case <= T; test_case++)
        {
            int N = sc.nextInt(); // 달팽이의 크기

            int[][] snail = new int[N][N]; // 달팽이를 저장할 2차원 배열

            int num = 1; // 달팽이에 채워질 숫자

            int rowStart = 0, rowEnd = N - 1, colStart = 0, colEnd = N - 1;

            while (num <= N * N) {
                // 왼쪽에서 오른쪽으로
                for (int i = colStart; i <= colEnd; i++) {
                    snail[rowStart][i] = num++;
                }
                rowStart++;

                // 위에서 아래로
                for (int i = rowStart; i <= rowEnd; i++) {
                    snail[i][colEnd] = num++;
                }
                colEnd--;

                // 오른쪽에서 왼쪽으로
                for (int i = colEnd; i >= colStart; i--) {
                    snail[rowEnd][i] = num++;
                }
                rowEnd--;

                // 아래에서 위로
                for (int i = rowEnd; i >= rowStart; i--) {
                    snail[i][colStart] = num++;
                }
                colStart++;
            }

            // 출력
            System.out.println("#" + test_case);
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    System.out.print(snail[i][j] + " ");
                }
                System.out.println();
            }

        }
    }
}