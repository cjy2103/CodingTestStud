import java.util.Arrays;
import java.util.Scanner;

public class Main {

    static int maxPrize;


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T;
        T=sc.nextInt();

        for(int test_case = 1; test_case <= T; test_case++)
        {

            maxPrize = 0; // 각 테스트 케이스마다 최대 상금 초기화

            // 숫자판의 정보와 교환 횟수 입력
            String number = sc.next();
            int K = sc.nextInt();

            // DFS 수행
            dfs(number.toCharArray(), K, 0);

            // 출력
            System.out.println("#" + test_case + " " + maxPrize);

//            String input = sc.next();
//
//            String[] target = input.split("");
//
//            int chance = sc.nextInt();
//
//            int answer = dfs(target, chance, 0, 0);
//
//            System.out.println("#" + test_case + " " + answer);

        }
    }

//    static int dfs(String[] target, int chance, int k, int count) {
//        String temp;
//        String targetnum = "";
//
//        if (chance == count) {
//            for (String tmp : target) {
//                targetnum += tmp;
//            }
//            return Integer.parseInt(targetnum);
//        }
//
//        int maxResult = 0;
//
//        for (int i = k; i < target.length; i++) {
//            for (int j = i + 1; j < target.length; j++) {
//
//                if (Integer.parseInt(target[i]) <= Integer.parseInt(target[j])) {
//                    temp = target[i];
//                    target[i] = target[j];
//                    target[j] = temp; // swap
//                    int result = dfs(target, chance, i, count + 1);
//                    maxResult = Math.max(maxResult, result);
//                    temp = target[i];
//                    target[i] = target[j];
//                    target[j] = temp; // swap
//                }
//            }
//        }
//        return maxResult;
//    }

    private static void dfs(char[] digits, int k, int depth) {
        if (k == 0 || depth == digits.length) {
            int number = Integer.parseInt(new String(digits));
            maxPrize = Math.max(maxPrize, number);
            return;
        }

        for (int i = depth; i < digits.length; i++) {
            for (int j = i + 1; j < digits.length; j++) {
                // 현재 위치와 다음 위치의 값을 교환
                char temp = digits[i];
                digits[i] = digits[j];
                digits[j] = temp;

                // DFS 호출
                dfs(digits, k - 1, depth + 1);

                // 다시 원래대로 복구
                temp = digits[i];
                digits[i] = digits[j];
                digits[j] = temp;
            }
        }

        if (k > 0 && digits.length >= 2) {
            char temp = digits[digits.length - 1];
            digits[digits.length - 1] = digits[digits.length - 2];
            digits[digits.length - 2] = temp;

            // DFS 호출
            dfs(digits, k - 1, depth + 1);

            // 다시 원래대로 복구
            temp = digits[digits.length - 1];
            digits[digits.length - 1] = digits[digits.length - 2];
            digits[digits.length - 2] = temp;
        }
    }
}