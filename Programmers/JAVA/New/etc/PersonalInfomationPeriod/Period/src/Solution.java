import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;
public class Solution {
    public int[] solution(String today, String[] terms, String[] privacies) {
        List<Integer> toBeDestroyed = new ArrayList<>();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy.MM.dd");
        LocalDate todayDate = LocalDate.parse(today, formatter);

        for (String privacy : privacies) {
            String[] privacyInfo = privacy.split(" ");
            LocalDate collectionDate = LocalDate.parse(privacyInfo[0], formatter);
            System,.
            System.out.println(collectionDate);
            String termInfo = privacyInfo[1];

            for (String term : terms) {
                String[] termInfoArr = term.split(" ");
                if (termInfoArr[0].equals(termInfo)) {
                    int termMonths = Integer.parseInt(termInfoArr[1]);
                    LocalDate expirationDate = collectionDate.plusMonths(termMonths);

                    if (todayDate.isAfter(expirationDate)) {
                        toBeDestroyed.add(Integer.parseInt(privacyInfo[2]));
                    }
                }
            }
        }

        int[] answer = new int[toBeDestroyed.size()];
        for (int i = 0; i < toBeDestroyed.size(); i++) {
            answer[i] = toBeDestroyed.get(i);
        }
        return answer;
    }
}
