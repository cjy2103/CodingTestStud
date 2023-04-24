import java.util.Arrays;
import java.util.HashMap;

class Solution {
//    public boolean solution(String[] phone_book) {
//        boolean answer = true;
//        Arrays.sort(phone_book);
//        for(int i=0;i<phone_book.length-1;i++){
//            if(phone_book[i+1].startsWith(phone_book[i])){
//                answer = false;
//            }
//        }
//        return answer;
//    }

    public boolean solution(String[] phone_book) {
        boolean answer = true;
        HashMap<String, Boolean> hashMap = new HashMap<>();

        // 전화번호부의 모든 전화번호를 해시맵에 넣습니다.
        for (String phoneNumber : phone_book) {
            hashMap.put(phoneNumber, true);
        }

        for (String s : phone_book) {
            for (int j = 1; j < s.length(); j++) {
                if (hashMap.containsKey(s.substring(0, j))) {
                    answer = false;
                    break;
                }
            }
        }

        return answer;
    }
}