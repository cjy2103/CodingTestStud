import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T;
        T=sc.nextInt();

        for(int test_case = 1; test_case <= T; test_case++)
        {
            String word = sc.next(); // 단어 입력
            int length = word.length();
            boolean isRepeat = true;

            for (int i = 0; i < length / 2; i++) {
                if (word.charAt(i) != word.charAt(length - 1 - i)) {
                    isRepeat = false;
                    break;
                }
            }

            int result = isRepeat ? 1 : 0;
            System.out.println("#" + test_case + " " + result);
        }
    }
}