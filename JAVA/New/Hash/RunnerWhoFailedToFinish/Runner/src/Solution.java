import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Solution {
    public String solution(String[] participant, String[] completion){
//        StringBuilder answer = new StringBuilder();
//
//        HashMap<String,Integer> player = new HashMap<>();
//
//        for(String name : participant){
//            player.put(name, player.getOrDefault(name, 0) + 1);
//        }
//
//        for(String name : completion){
//            player.put(name, player.get(name)-1);
//        }
//
//        for(String name : player.keySet()){
//            if(player.get(name) != 0){
//                answer.append(name);
//            }
//        }
//        return answer.toString();
        Map<String, Long> player = Arrays.stream(participant)
                .collect(Collectors.groupingBy(name-> name, Collectors.counting()));

        Arrays.stream(completion)
                .forEach(name -> player.put(name, player.get(name) -1));

        return player.entrySet().stream()
                .filter(e -> e.getValue() > 0)
                .map(Map.Entry::getKey)
                .collect(Collectors.joining());
    }
}
