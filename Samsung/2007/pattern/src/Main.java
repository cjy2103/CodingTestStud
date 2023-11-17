import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        for (int tc = 1; tc <= T; tc++) {
            String str = sc.next();

            // 마디의 최대 길이는 10
            for (int i = 1; i <= 10; i++) {
                // i 문자부터 2i 문자까지가 마디인지 확인
                if (str.substring(0, i).equals(str.substring(i, i * 2))) {
                    System.out.println("#" + tc + " " + i);
                    break;
                }
            }
        }
    }
}