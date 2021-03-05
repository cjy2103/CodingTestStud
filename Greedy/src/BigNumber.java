import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class BigNumber {
    public static void main(String args[]){
        /*
        � ���ڿ��� k���� ���� �������� �� ���� �� �ִ� ���� ū ���ڸ� ���Ϸ� �մϴ�.
        ���� ���, ���� 1924���� �� �� ���� �����ϸ� [19, 12, 14, 92, 94, 24] �� ���� �� �ֽ��ϴ�.
        �� �� ���� ū ���ڴ� 94 �Դϴ�.
        ���ڿ� �������� ���� number�� ������ ���� ���� k�� solution �Լ��� �Ű������� �־����ϴ�.
        number���� k ���� ���� �������� �� ���� �� �ִ� �� �� ���� ū ���ڸ� ���ڿ� ���·� return �ϵ���
        solution �Լ��� �ϼ��ϼ���.
         */

        // ������ �̿�����!
        // number ���ڿ��� char�� ���� ->
        // ���ÿ� ���
        // ���� ���ÿ� ��� ���� ���� �� ���� �۴ٸ� pop

        String number = "1231234"; // �Է¹��� ��
        int k = 3;          // ������ ������ ��
        char [] input = number.toCharArray();   // {1,9,2,4}

        //���ڿ� ����
        Stack<Character> temp = new Stack<>();
        for(int i=0;i<input.length;i++){
            // ������ �����ʰ� ���� top�� ����Ű�� �ִ� ���� input[i] ���� �۴ٸ� pop
            while(!temp.empty() && k >0 && temp.peek() < input[i]){
                k--;
                temp.pop();
            }
            temp.push(input[i]);
        }

        StringBuilder sb = new StringBuilder(); // ���ڿ��� ����� ���밴ü StringBuilder ��� �ӵ� ����, ���� ����

        while (!temp.empty()){
            if(k != 0){
                temp.pop();
                k--;
            }
            else{
                sb.append(temp.pop());
            }
        }

        //������ ���� �����̱� ������ reverse �� ���ش�.
        System.out.println(sb.reverse().toString());

    }
}
