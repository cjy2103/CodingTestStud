import java.util.Queue;

import java.util.concurrent.ConcurrentLinkedQueue;

public class bridgeTruck {
    public static void main(String args[]){
        /*
        Ʈ�� ���� �밡 ���� ���������� �� ���� �ٸ��� ������ ������ �ǳʷ� �մϴ�. ��� Ʈ���� �ٸ��� �ǳʷ���
        �ּ� �� �ʰ� �ɸ����� �˾Ƴ��� �մϴ�. Ʈ���� 1�ʿ� 1��ŭ �����̸�, �ٸ� ���̴�
        bridge_length�̰� �ٸ��� ���� weight���� �ߵ��ϴ�.
        �� Ʈ���� �ٸ��� ������ ������ ���� ���, �� Ʈ���� ���Դ� ������� �ʽ��ϴ�.
         */

        // ���� 1�� �ǳʴ� �ð� = 1��
        // FIFO ���� : ť ���
        int bridge_length = 2; // �ٸ� ����
        int weight = 10;       // �ٸ��� ���簡���� ����
        int [] truck_weights = {7,4,5,6}; // ������� Ʈ�� ����
        int answer = 0; // �� ( �ð�)

        // Integer Type�� queue ���� ConcurrentLinkedQueue �� ��Ƽ������ ȯ�濡�� ����ġ ���� ������ �ذ��ϱ� ���� ���
        Queue<Integer> queue = new ConcurrentLinkedQueue<>();
        int sum = 0; // �ٸ��� �ǳʰ� �ִ� Ʈ���� �� ����
        //���� for�� ��� truck_weights �� �迭�̱� ����
        for (int ton : truck_weights){  // ton ������ �ٸ��� ������ Ʈ���� ����
            //���� �ݺ�
            while (true){
                // ť�� ����ٸ� time�� �߰�
                if(queue.isEmpty()){    // �ٸ��� ��� �����Ƿ� Ʈ���� ����
                    queue.add(ton); // Ʈ�� ����
                    sum += ton;     // �ٸ��� �ǳʰ� �ִ� ���Կ� ������ Ʈ�� ���� �߰�
                    answer++;       // �ð� ����
                    break;
                }
                else if(queue.size() == bridge_length){ // ������ Ʈ���� �ٸ����� �����ؼ� �ٸ��� �������� ����
                    sum -= queue.poll(); // ť�� ����
                }
                else{   // �� ���� ��� Ʈ���� �ٸ� ���Ը� �ʰ��� ���ü� ���� ����
                    if(sum + ton > weight){ // �� ���԰� ���� �ٸ����� Ʈ���� ������ Ʈ���� ���Ը� �ʰ��� ���
                        answer++;       // �ð�����
                        queue.add(0);   // ť�� 0���־� ���ο� Ʈ���� �������� ���ϰ� �ϰ� ������ Ʈ����
                                        // �ٸ� ���� �����ϰ� ��
                    }
                    else{
                        queue.add(ton);     // Ʈ���� ����
                        sum +=ton;          // �ٸ��� Ʈ���� ���� = �ǳʰ��ִ� Ʈ������ + ������ Ʈ�� ����
                        answer++;           // �ð�����
                        break;
                    }
                }
            }
        }

        System.out.println(answer + bridge_length);

        /*
        ���� �˰Ե� ��� : poll �Լ�
        ConcurrentLinkedQueue
         */
    }
}
