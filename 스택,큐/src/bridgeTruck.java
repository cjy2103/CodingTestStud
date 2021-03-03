import java.util.Queue;

import java.util.concurrent.ConcurrentLinkedQueue;

public class bridgeTruck {
    public static void main(String args[]){
        /*
        트럭 여러 대가 강을 가로지르는 일 차선 다리를 정해진 순으로 건너려 합니다. 모든 트럭이 다리를 건너려면
        최소 몇 초가 걸리는지 알아내야 합니다. 트럭은 1초에 1만큼 움직이며, 다리 길이는
        bridge_length이고 다리는 무게 weight까지 견딥니다.
        ※ 트럭이 다리에 완전히 오르지 않은 경우, 이 트럭의 무게는 고려하지 않습니다.
         */

        // 길이 1당 건너는 시간 = 1초
        // FIFO 전략 : 큐 사용
        int bridge_length = 2; // 다리 길이
        int weight = 10;       // 다리가 감당가능한 무게
        int [] truck_weights = {7,4,5,6}; // 대기중인 트럭 무게
        int answer = 0; // 답 ( 시간)

        // Integer Type의 queue 선언 ConcurrentLinkedQueue 는 멀티스레드 환경에서 예상치 않은 에러를 해결하기 위해 사용
        Queue<Integer> queue = new ConcurrentLinkedQueue<>();
        int sum = 0; // 다리를 건너고 있는 트럭의 총 무게
        //향상된 for문 사용 truck_weights 가 배열이기 때문
        for (int ton : truck_weights){  // ton 변수는 다리에 진입한 트럭의 무게
            //무한 반복
            while (true){
                // 큐가 비었다면 time을 추가
                if(queue.isEmpty()){    // 다리가 비어 있으므로 트럭이 진입
                    queue.add(ton); // 트럭 진입
                    sum += ton;     // 다리를 건너고 있는 무게에 진입한 트럭 무게 추가
                    answer++;       // 시간 증가
                    break;
                }
                else if(queue.size() == bridge_length){ // 진입한 트럭이 다리끝에 도착해서 다리를 빠져나간 상태
                    sum -= queue.poll(); // 큐를 제거
                }
                else{   // 그 외의 경우 트럭이 다리 무게를 초과해 들어올수 없는 상태
                    if(sum + ton > weight){ // 총 무게가 현재 다리위의 트럭과 진입할 트럭의 무게를 초과한 경우
                        answer++;       // 시간증가
                        queue.add(0);   // 큐에 0을넣어 새로운 트럭이 진입하지 못하게 하고 나머지 트럭이
                                        // 다리 위를 전진하게 함
                    }
                    else{
                        queue.add(ton);     // 트럭이 진입
                        sum +=ton;          // 다리위 트럭의 무게 = 건너고있는 트럭무게 + 진입한 트럭 무게
                        answer++;           // 시간증가
                        break;
                    }
                }
            }
        }

        System.out.println(answer + bridge_length);

        /*
        새로 알게된 기능 : poll 함수
        ConcurrentLinkedQueue
         */
    }
}
