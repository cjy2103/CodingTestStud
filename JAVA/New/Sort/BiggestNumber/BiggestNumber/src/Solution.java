import java.util.ArrayList;

public class Solution {
    public String solution(int[] numbers){
        ArrayList<String> arrayList = new ArrayList<>();
        StringBuilder answer = new StringBuilder("");

        for(int number : numbers){
            arrayList.add(Integer.toString(number));
        }

        arrayList.sort((s1, s2) -> {
            String left  = s1 + s2;
            String right = s2 + s1;
            return right.compareTo(left);
        });

        if (arrayList.get(0).equals("0")) {
            return "0";
        }

        for (String number : arrayList){
            answer.append(number);
        }

        return answer.toString();
    }
}
