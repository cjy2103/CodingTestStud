public class Solution {
    public int solution(int sugar){
        int kilogram5 = sugar/5;
        int reminder = sugar%5;

        while (kilogram5 >= 0){
            if(reminder == 0){
                return kilogram5;
            }

            if(reminder % 3 == 0){
                return kilogram5 + reminder/3;
            }
            kilogram5--;
            reminder += 5;
        }
        return -1;
    }
}
