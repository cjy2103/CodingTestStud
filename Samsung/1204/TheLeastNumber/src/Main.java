import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T;
        T=sc.nextInt();

        for(int test_case = 1; test_case <= T; test_case++)
        {
            // 의미없는 코드.. 하지만 SWEA에 이거 안넣으면 Fail뜬다.. 이유는 의미없이 하나씩 더 입력받기 때문...
            sc.nextInt();
            //점수는 0 ~ 100점
            int[] scores = new int[101];
            System.out.println(scores.length);
            // 학생의 수는 1000명
            for (int i=0; i<6; i++){
                int score = sc.nextInt();
                scores[score]++;
            }

            // 최대 빈도수
            int maxFrequency = 0;
            //최빈수
            int maxFrequencyNum = 0;

            for (int i=0;i<scores.length;i++){
                // 최빈수 값이 같은게 있다면 더 큰수가 최빈수가 될수있게 한다.
                if(scores[i] >= maxFrequency){
                    maxFrequency = scores[i];
                    maxFrequencyNum = i;
                }
            }

            System.out.println("#" + test_case + " " + maxFrequencyNum); // 수정된 부분: 변수명 변경
        }
    }
}