import java.util.*;

public class Solution {

    public int[] solution(int[] progress, int[] speeds){

        Stack<Integer> stack = new Stack<>();
        // 남은 날짜 계산해서 Stack에 투입 스택인 LIFO 구조이기 때문에 역순으로 저장한다.
        for(int i = progress.length -1 ; i >=0; i--){
            int day = (100 - progress[i]) / speeds[i];

            // progress[1]의 경우는 위 계산식 수행시 2로 (반올림) 처리 되기 때문
            if((100 - progress[i]) % speeds[i] != 0){
                day++;
            }
            stack.push(day);
        }
        // 위 과정 끝나면 9,3,7 저장

        // 배열에 정확히 몇개의 값이 들어갈지 모르니 ArrayList로 임시값 선언
        ArrayList<Integer> releaseList = new ArrayList<>();
        // 첫날 기능 완료일을 꺼내고 배포 기능개수 를 1로 설정
        int top = stack.pop();
        int count = 1;

        while (!stack.isEmpty()){
            int next = stack.pop();

            // 첫날보다 다음에 완료된 기능이 더 작은값이면 배포기능개수를 1증가시킴
            // 그렇지 않다면 releaseList에 배포 기능개수를 add해주고 top에 next를 넣어준후 배포 기능개수 변수를 1로 설정함.
            if(top >= next) {
                count++;
            } else {
                releaseList.add(count);
                top = next;
                count = 1;
            }
        }
        releaseList.add(count); // 마지막 기능 배포 (top 변수 선언할 때 pop으로 빼고 시작해서)


        int [] answer = new int[releaseList.size()];

        for(int i=0;i<releaseList.size();i++){
            answer[i] = releaseList.get(i);
        }

        return answer;
    }
}
