import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T;
        T=sc.nextInt();

        for(int test_case = 1; test_case <= T; test_case++)
        {

            int N = sc.nextInt();

            // 누적된 값
            int sum = 0;

            // 1부터 N까지의 숫자를 순회하면서 홀수면 더하고 짝수면 뺀다.
            for (int i = 1; i <= N; i++) {
                if (i % 2 == 1) {
                    sum += i;
                } else {
                    sum -= i;
                }
            }

            // 누적된 값을 출력한다.
            System.out.println("#" + test_case + " " + sum);

        }

    }
}