import java.util.*;
class Solution {
    public String[] solution(String[] players, String[] callings) {
        Map<String, Integer> playerMap = new HashMap<String, Integer>();

        for(int i = 0; i < players.length; i++){
            playerMap.put(players[i], i);
        }

        for(String name : callings){
            // 순위 변경
            int index = playerMap.get(name);
            playerMap.put(players[index], index - 1);
            playerMap.put(players[index - 1], playerMap.get(players[index - 1]) + 1);
            // HashMap과 배열 동시 반영
            String temp = players[index];
            players[index] = players[index - 1];
            players[index - 1] = temp;
        }
        return players;
    }
}