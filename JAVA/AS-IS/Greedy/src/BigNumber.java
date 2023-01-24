import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class BigNumber {
    public static void main(String args[]){
        /*
        어떤 숫자에서 k개의 수를 제거했을 때 얻을 수 있는 가장 큰 숫자를 구하려 합니다.
        예를 들어, 숫자 1924에서 수 두 개를 제거하면 [19, 12, 14, 92, 94, 24] 를 만들 수 있습니다.
        이 중 가장 큰 숫자는 94 입니다.
        문자열 형식으로 숫자 number와 제거할 수의 개수 k가 solution 함수의 매개변수로 주어집니다.
        number에서 k 개의 수를 제거했을 때 만들 수 있는 수 중 가장 큰 숫자를 문자열 형태로 return 하도록
        solution 함수를 완성하세요.
         */

        // 스택을 이용하자!
        // number 문자열을 char로 분해 ->
        // 스택에 담기
        // 현재 스택에 담긴 값이 다음 값 보다 작다면 pop

        String number = "1231234"; // 입력받은 수
        int k = 3;          // 삭제할 숫자의 수
        char [] input = number.toCharArray();   // {1,9,2,4}

        //문자열 스택
        Stack<Character> temp = new Stack<>();
        for(int i=0;i<input.length;i++){
            // 스택이 비지않고 현재 top이 가르키고 있는 값이 input[i] 보다 작다면 pop
            while(!temp.empty() && k >0 && temp.peek() < input[i]){
                k--;
                temp.pop();
            }
            temp.push(input[i]);
        }

        StringBuilder sb = new StringBuilder(); // 문자열을 만드는 전용객체 StringBuilder 사용 속도 빠름, 부하 적음

        while (!temp.empty()){
            if(k != 0){
                temp.pop();
                k--;
            }
            else{
                sb.append(temp.pop());
            }
        }

        //스택은 후입 선출이기 때문에 reverse 를 해준다.
        System.out.println(sb.reverse().toString());

    }
}
