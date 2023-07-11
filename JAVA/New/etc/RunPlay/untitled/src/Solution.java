import java.util.*;
class Solution {
    public String[] solution(String[] players, String[] callings) {
        LinkedList<String> playerList = new LinkedList<>(Arrays.asList(players));

        for (String calling : callings) {
            int callingIndex = playerList.indexOf(calling); // 호출된 선수의 인덱스

            playerList.remove(calling); // 호출된 선수를 리스트에서 제거
            playerList.add(callingIndex - 1, calling); // 호출된 선수를 이전 위치의 바로 앞에 추가
        }

        return playerList.toArray(new String[0]);
    }
}