import java.util.*;
class Solution {
    public String solution(String s, String skip, int index) {
        List<Character> alpha = new ArrayList<>();
        StringBuilder result = new StringBuilder();

        for(char c = 'a'; c <= 'z'; c++){
            if (!skip.contains(String.valueOf(c))){
                alpha.add(c);
            }
        }
        
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            int pos = alpha.indexOf(c) + index;
            result.append(alpha.get(pos % alpha.size()));
        }
        return result.toString();
    }
}