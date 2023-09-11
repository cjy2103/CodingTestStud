import java.util.*;
class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        Map<String,Integer> people = new HashMap<>();
        int[] answer = new int[photo.length];

        for(int i=0;i<name.length;i++){
            people.put(name[i],yearning[i]);
        }

        for(int i=0;i<photo.length;i++){
            int score = 0;
            for(String person : photo[i]){
                score += people.getOrDefault(person,0);
            }
            answer[i] = score;
        }
        return answer;
    }
}