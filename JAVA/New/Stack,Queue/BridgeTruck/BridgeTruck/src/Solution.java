import java.util.*;
public class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        Queue<Integer> bridge = new LinkedList<>(); // 다리를 건너는 트럭을 저장하는 큐
        int time = 0; // 경과 시간
        int totalWeight = 0; // 다리 위의 트럭 무게의 합

        for (int truckWeight : truck_weights) {
            while (true) {
                if (bridge.isEmpty()) { // 다리 위에 트럭이 없을 경우
                    bridge.add(truckWeight);
                    totalWeight += truckWeight;
                    time++;
                    break;
                } else if (bridge.size() == bridge_length) { // 다리 위에 트럭이 꽉 찼을 경우
                    totalWeight -= bridge.poll();
                } else { // 다리 위에 트럭이 있고, 무게가 견딜 수 있을 경우
                    if (totalWeight + truckWeight <= weight) {
                        bridge.add(truckWeight);
                        totalWeight += truckWeight;
                        time++;
                        break;
                    } else { // 무게가 견딜 수 없을 경우
                        bridge.add(0);
                        time++;
                    }
                }
            }
        }

        return time + bridge_length; // 마지막 트럭이 다리를 건너는 시간을 추가해 반환
    }
}
