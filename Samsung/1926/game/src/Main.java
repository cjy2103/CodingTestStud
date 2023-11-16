import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T;
        T=sc.nextInt();

        for(int i = 1; i <= T; i++)
        {
            boolean contains369 = false;
            int num = i;

            while (num != 0) {
                int digit = num % 10;
                if (digit == 3 || digit == 6 || digit == 9) {
                    contains369 = true;
                    break;
                }
                num /= 10;
            }

            if (contains369) {
                int count369 = 0;
                num = i;

                while (num != 0) {
                    int digit = num % 10;
                    if (digit == 3 || digit == 6 || digit == 9) {
                        count369++;
                    }
                    num /= 10;
                }

                for (int j = 0; j < count369; j++) {
                    System.out.print("-");
                }
            } else {
                System.out.print(i);
            }

            System.out.print(" ");
        }
    }
}