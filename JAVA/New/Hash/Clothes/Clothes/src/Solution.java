import java.util.*;
public class Solution {
    public int solution(String[][] clothes) {
        HashMap<String, Integer> map = new HashMap<>();

        // 각 종류별 의상의 개수를 세기
        for (String[] cloth : clothes) {
            String type = cloth[1];
            map.put(type, map.getOrDefault(type, 0) + 1);
        }

        int answer = 1;
        for (int count : map.values()) {
            answer *= (count + 1);
        }

        return answer - 1; // 아무 의상도 입지 않은 경우 제외
    }
}
