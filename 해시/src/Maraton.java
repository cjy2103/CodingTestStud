import java.util.HashMap;
import java.util.Map;

public class Maraton {
    public static void main(String args[]){
        /*
        수많은 마라톤 선수들이 마라톤에 참여하였습니다. 단 한 명의 선수를 제외하고는 모든 선수가 마라톤을 완주하였습니다.
           마라톤에 참여한 선수들의 이름이 담긴 배열 participant와 완주한 선수들의 이름이 담긴 배열 completion이 주어질 때,
            완주하지 못한 선수의 이름을 return 하도록 solution 함수를 작성해주세요.
         */

        /*
        제한사항
        마라톤 경기에 참여한 선수의 수는 1명 이상 100,000명 이하입니다.
        completion의 길이는 participant의 길이보다 1 작습니다.
        참가자의 이름은 1개 이상 20개 이하의 알파벳 소문자로 이루어져 있습니다.
        중요!!: 참가자 중에는 동명이인이 있을 수 있습니다.
         */

        /* Array.sort를 이용할수 있으나 해시를 사용 */

        // 임의의 선수들
        String [] participant = {"leo","kiki","eden","mark"};
        String [] completion = {"eden","kiki"};
        String answer = "";

        Map<String, Integer> player = new HashMap<>(); // 선수 이름 String 과 키값 Integer 속성을 가짐

        for (String name : participant){     // 참가자들은 이름과 디폴트값 0 + 1 을 세팅 leo, kiki,eden 의 키값은 현재 1,1,1
            player.put(name, player.getOrDefault(name,0) +1);
        }
        for (String name : completion){ // 마라톤 완주시 -1을 함으로써 키값을 1 씩 빼줌 eden과 kiki 의 키값은 0
            player.put(name,player.get(name)-1);
        }
        for(String key : player.keySet()){  // 맵 순회시 키값이 0이 아니면 미완주자 출력
            if(player.get(key) != 0 ){
                answer = key;
                System.out.println(answer);
            }
        }

        // 새로 알게된 용어 getOrDefault

    }
}
