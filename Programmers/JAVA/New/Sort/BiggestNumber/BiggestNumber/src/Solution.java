import java.util.ArrayList;
import java.util.Arrays;

public class Solution {
//    public String solution(int[] numbers){
//        ArrayList<String> arrayList = new ArrayList<>();
//        StringBuilder answer = new StringBuilder("");
//
//        for(int number : numbers){
//            arrayList.add(Integer.toString(number));
//        }
//
//        arrayList.sort((s1, s2) -> {
//            String left  = s1 + s2;
//            String right = s2 + s1;
//            return right.compareTo(left);
//        });
//
//        if (arrayList.get(0).equals("0")) {
//            return "0";
//        }
//
//        for (String number : arrayList){
//            answer.append(number);
//        }
//
//        return answer.toString();
//    }
    public String solution(int[] numbers) {
        String answer = Arrays.stream(numbers)
                .mapToObj(String::valueOf)
                .sorted((s1, s2) -> (s2 + s1).compareTo(s1 + s2))
                .reduce((s1, s2) -> s1.equals("0") ? s2 : s1 + s2)
                .orElse("0");
        return answer;
    }
}
