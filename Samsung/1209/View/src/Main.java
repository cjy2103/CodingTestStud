import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // SWEA 템플릿 코드에는 입력받는걸로 되어있지만 수정해야합니다. 안그러면 RuntimeError 발생
        int T = 10;

        for(int test_case = 1; test_case <= T; test_case++)
        {
            int N = sc.nextInt(); // 건물의 개수

            int[] buildings = new int[N];

            for (int i = 0; i < N; i++) {
                buildings[i] = sc.nextInt(); // 각 건물의 높이
            }

            int count = 0;

            for (int i = 2; i < N - 2; i++) {
                int max = Math.max(buildings[i - 2], Math.max(buildings[i - 1], Math.max(buildings[i + 1], buildings[i + 2])));
                if (buildings[i] - max > 0) {
                    count += buildings[i] - max;
                }
            }

            // 출력
            System.out.println("#" + test_case + " " + count);
        }
    }
}