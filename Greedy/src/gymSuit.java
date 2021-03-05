public class gymSuit {
    public static void main(String args[]){
        /*
        점심시간에 도둑이 들어, 일부 학생이 체육복을 도난당했습니다.
        다행히 여벌 체육복이 있는 학생이 이들에게 체육복을 빌려주려 합니다.
        학생들의 번호는 체격 순으로 매겨져 있어, 바로 앞번호의 학생이나 바로 뒷번호의 학생에게만 체육복을 빌려줄 수 있습니다.
         예를 들어, 4번 학생은 3번 학생이나 5번 학생에게만 체육복을 빌려줄 수 있습니다.
          체육복이 없으면 수업을 들을 수 없기 때문에 체육복을 적절히 빌려 최대한 많은 학생이 체육수업을 들어야 합니다.
        전체 학생의 수 n, 체육복을 도난당한 학생들의 번호가 담긴 배열 lost,
        여벌의 체육복을 가져온 학생들의 번호가 담긴 배열 reserve가 매개변수로 주어질 때,
        체육수업을 들을 수 있는 학생의 최댓값을 return 하도록 solution 함수를 작성해주세요.
         */

        int n = 5;  // 총 학생수
        int lost [] = {2,4};  // 체육복 잃어버린 학생
        int reserve [] = {3};  // 여유분
        int array [] = new int[n+2]; // 총학생 +2 만큼 배열 생성 (번호 맨 앞과 뒤)
        int answer = 0;

        // 체육복을 잃어버린 학생
        for(int i=0;i<lost.length;i++){
            array[lost[i]] -= 1; // 초기화된 array 배열에 -1을 함 {0,0,-1,0,-1,0,0}
        }

        for(int i =0;i<reserve.length;i++){ // 여유분 체육복을 가지고 있는 학생
            array[reserve[i]] +=1; //{0,1,-1,1,-1,1,0}
        }


        for(int i=0;i<array.length-1;i++){
            if(array[i] > 0 && array[i-1] <0){ // 만약 기준의 앞 학생이 체육복을 잃어버린경우
                array[i] -=1;
                array[i-1] +=1;
            }
            else if(array[i] > 0 && array[i+1] < 0){ // 기준의 뒷 학생이 체육복을 잃어버린 경우
                array[i] -=1;
                array[i+1] +=1;
            }
        }

        for(int i=0;i<array.length;i++){
            if(array[i] >=0 ){
                answer += 1;
            }
        }

        System.out.println(answer-2); // array[0]번 째와 array[n+1]번째 때문



    }
}
