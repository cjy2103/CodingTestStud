import java.util.Arrays;

public class PhoneNumber {
    public static void main(String args[]){
    /*
    ��ȭ��ȣ�ο� ���� ��ȭ��ȣ ��, �� ��ȣ�� �ٸ� ��ȣ�� ���ξ��� ��찡 �ִ��� Ȯ���Ϸ� �մϴ�.
    ��ȭ��ȣ�� ������ ���� ���, ������ ��ȭ��ȣ�� �������� ��ȭ��ȣ�� ���λ��Դϴ�.

    ������ : 119
    ���ؿ� : 97 674 223
    ������ : 11 9552 4421
    ��ȭ��ȣ�ο� ���� ��ȭ��ȣ�� ���� �迭 phone_book �� solution �Լ��� �Ű������� �־��� ��,
    � ��ȣ�� �ٸ� ��ȣ�� ���ξ��� ��찡 ������ false�� �׷��� ������ true�� return �ϵ��� solution �Լ��� �ۼ����ּ���.

    �ַ�� : StarsWith �޼��� ���
    */
        String [] phone_book = {"119","97674223","1195524421"};
        boolean answer = true;
        Arrays.sort(phone_book);
        for(int i=0;i<phone_book.length-1;i++){
            if(phone_book[i+1].startsWith(phone_book[i])){  // ������ �Ǵ� String���� phone[i+1]�� ���ڷ� ���޵� ���ڿ� phone_book[i]�� ����
                answer = false;                            // �Ǹ� boolean ���� true
            }
        }
        System.out.println(answer);

        // ���� �˰Ե� ��� starsWith
    }
}
