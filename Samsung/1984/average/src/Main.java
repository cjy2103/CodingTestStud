import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T;
        T=sc.nextInt();

        for(int test_case = 1; test_case <= T; test_case++)
        {
            int[] numbers = new int[10];

            // 10개의 수 입력
            for (int i = 0; i < 10; i++) {
                numbers[i] = sc.nextInt();
            }

            // 배열 정렬
            Arrays.sort(numbers);

            // 최대값과 최소값 제외한 합 계산
            int sum = 0;
            for (int i = 1; i < 9; i++) {
                sum += numbers[i];
            }

            // 평균값 계산 및 반올림
            int average = Math.round((float) sum / 8);

            System.out.println("#" + test_case + " " + average);
        }
    }
}