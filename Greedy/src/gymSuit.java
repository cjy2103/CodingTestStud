public class gymSuit {
    public static void main(String args[]){
        /*
        ���ɽð��� ������ ���, �Ϻ� �л��� ü������ �������߽��ϴ�.
        ������ ���� ü������ �ִ� �л��� �̵鿡�� ü������ �����ַ� �մϴ�.
        �л����� ��ȣ�� ü�� ������ �Ű��� �־�, �ٷ� �չ�ȣ�� �л��̳� �ٷ� �޹�ȣ�� �л����Ը� ü������ ������ �� �ֽ��ϴ�.
         ���� ���, 4�� �л��� 3�� �л��̳� 5�� �л����Ը� ü������ ������ �� �ֽ��ϴ�.
          ü������ ������ ������ ���� �� ���� ������ ü������ ������ ���� �ִ��� ���� �л��� ü�������� ���� �մϴ�.
        ��ü �л��� �� n, ü������ �������� �л����� ��ȣ�� ��� �迭 lost,
        ������ ü������ ������ �л����� ��ȣ�� ��� �迭 reserve�� �Ű������� �־��� ��,
        ü�������� ���� �� �ִ� �л��� �ִ��� return �ϵ��� solution �Լ��� �ۼ����ּ���.
         */

        int n = 5;  // �� �л���
        int lost [] = {2,4};  // ü���� �Ҿ���� �л�
        int reserve [] = {3};  // ������
        int array [] = new int[n+2]; // ���л� +2 ��ŭ �迭 ���� (��ȣ �� �հ� ��)
        int answer = 0;

        // ü������ �Ҿ���� �л�
        for(int i=0;i<lost.length;i++){
            array[lost[i]] -= 1; // �ʱ�ȭ�� array �迭�� -1�� �� {0,0,-1,0,-1,0,0}
        }

        for(int i =0;i<reserve.length;i++){ // ������ ü������ ������ �ִ� �л�
            array[reserve[i]] +=1; //{0,1,-1,1,-1,1,0}
        }


        for(int i=0;i<array.length-1;i++){
            if(array[i] > 0 && array[i-1] <0){ // ���� ������ �� �л��� ü������ �Ҿ�������
                array[i] -=1;
                array[i-1] +=1;
            }
            else if(array[i] > 0 && array[i+1] < 0){ // ������ �� �л��� ü������ �Ҿ���� ���
                array[i] -=1;
                array[i+1] +=1;
            }
        }

        for(int i=0;i<array.length;i++){
            if(array[i] >=0 ){
                answer += 1;
            }
        }

        System.out.println(answer-2); // array[0]�� °�� array[n+1]��° ����



    }
}