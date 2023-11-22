import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T;
        T=sc.nextInt();

        String[] grades = {"A+", "A0", "A-", "B+", "B0", "B-", "C+", "C0", "C-", "D0"};


        for(int test_case = 1; test_case <= T; test_case++)
        {
            int N = sc.nextInt(); // 학생 수
            int K = sc.nextInt(); // 학점을 알고 싶은 학생의 번호

            // 각 학생의 중간, 기말, 과제 저장할 배열
            int[][] scores = new int[N][3];

            // 각 학생의 점수 저장
            for (int i = 0; i < N; i++) {
                scores[i][0] = sc.nextInt();
                scores[i][1] = sc.nextInt();
                scores[i][2] = sc.nextInt();
            }

            // K 번째 학생의 학점 계산
            double[] ranks = new double[N];
            for (int i = 0; i < N; i++) {
                ranks[i] = scores[i][0] * 0.35 + scores[i][1] * 0.45 + scores[i][2] * 0.2;
            }
            Arrays.sort(ranks);

            // 내림차순
            for (int i = 0; i < N / 2; i++) {
                double temp = ranks[i];
                ranks[i] = ranks[N - i - 1];
                ranks[N - i - 1] = temp;
            }

            // K 번째 학생의 학점 찾기
            int index = 0;
            for (int i = 0; i < N; i++) {
                if (ranks[i] == scores[K - 1][0] * 0.35 + scores[K - 1][1] * 0.45 + scores[K - 1][2] * 0.2) {
                    index = i;
                    break;
                }
            }

            // K 번째 학생의 학점 출력
            System.out.println("#" + test_case + " " + grades[index * 10 / N]);

        }
    }
}