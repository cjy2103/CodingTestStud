import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.IntStream;

public class Solution {
    //    public int[] solution(int[] answers){
//        int [] score = new int[3];
//        int [] first = {1,2,3,4,5};
//        int [] second = {2,1,2,3,2,4,2,5};
//        int [] third = {3,3,1,1,2,2,4,4,5,5};
//
//        for(int i = 0; i<answers.length; i++){
//            if(answers[i] == first[i%first.length]){
//                score[0]++;
//            }
//            if (answers[i] == second[i%second.length]){
//                score[1]++;
//            }
//            if (answers[i] == third[i%third.length]){
//                score[2]++;
//            }
//        }
//
//        int maxScore = Math.max(Math.max(score[0], score[1]), score[2]);
//
//        ArrayList<Integer> list = new ArrayList<>();
//        if(maxScore == score[0]){
//            list.add(1);
//        }
//        if(maxScore == score[1]){
//            list.add(2);
//        }
//        if(maxScore == score[2]){
//            list.add(3);
//        }
//
//        int[] answer = new int[list.size()];
//
//        for(int i=0;i<list.size();i++){
//            answer[i] = list.get(i);
//        }
//
//        return answer;
//    }
    public int[] solution(int[] answers) {
        int[] score  = new int[3];
        int[] first  = {1, 2, 3, 4, 5};
        int[] second = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] third  = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

        for (int i = 0; i < answers.length; i++) {
            if (answers[i] == first[i % first.length]) {
                score[0]++;
            }
            if (answers[i] == second[i % second.length]) {
                score[1]++;
            }
            if (answers[i] == third[i % third.length]) {
                score[2]++;
            }
        }

        int maxScore = Arrays.stream(score).max().getAsInt();

        return IntStream.range(0,score.length)
                .filter(i -> score[i] == maxScore)
                .map(i -> i+1)
                .toArray();
    }
}

