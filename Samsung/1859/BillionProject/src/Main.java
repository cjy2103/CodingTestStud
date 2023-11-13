import java.util.Arrays;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int tc = 1; tc<= T; tc++){
            // 날짜 입력받기
            int N = sc.nextInt();

            // 매매가 입력받기
            int[] prices = new int[N];
            for(int i= 0; i<N; i++){
                prices[i] = sc.nextInt();
            }

            //최대 이익 구하기
            long profit = getMaxProfit(prices);

            // 출력
            System.out.println("#" + tc + " " + profit);        }
    }

    /**
     * @DESC: 왜 long이여야하는가?
     * 판매가가 10000이하 즉 10000까지 될수 있음
     * TC는 1,000,000 까지 가능
     * 그럼 마지막 날이 10000이고 나머지 날이 전부 다 1일때는?
     * 999999 * 10000 - 999999 이 된다.
     * 이러면 99억이 넘어가는데.. int로 표시할수 있는 가장 큰 수는 약 21억 정도 표현 가능한 숫자를 넘어간다.
     * @param prices
     * @return
     */
    private static long getMaxProfit(int[] prices) {
        long maxProfit = 0;
        long  max = 0;
        int num = 0;
        long cost = 0;		//구매가

        //배열 끝에서 부터 계산.
        for (int i = prices.length - 1; i >= 0; i--) {
            // 더 큰 최대값을 찾으면 max에 대입하고 판매
            if (prices[i] > max) {
                //case 3번처럼 배열 맨끝이 최대값이 아닌 경우가 발생할수 있기 때문에 추가
                maxProfit += (max * num - cost);
                max = prices[i];
                // 초기화
                cost = 0;
                num = 0;
            } else {
                //max 보다 작으면 구매
                cost += prices[i];
                num++;
            }
        }

        // 주식 판매
        maxProfit += (max * num - cost);

        return maxProfit;
    }
}