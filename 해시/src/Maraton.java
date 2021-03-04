import java.util.HashMap;
import java.util.Map;

public class Maraton {
    public static void main(String args[]){
        /*
        ������ ������ �������� �����濡 �����Ͽ����ϴ�. �� �� ���� ������ �����ϰ�� ��� ������ �������� �����Ͽ����ϴ�.
           �����濡 ������ �������� �̸��� ��� �迭 participant�� ������ �������� �̸��� ��� �迭 completion�� �־��� ��,
            �������� ���� ������ �̸��� return �ϵ��� solution �Լ��� �ۼ����ּ���.
         */

        /*
        ���ѻ���
        ������ ��⿡ ������ ������ ���� 1�� �̻� 100,000�� �����Դϴ�.
        completion�� ���̴� participant�� ���̺��� 1 �۽��ϴ�.
        �������� �̸��� 1�� �̻� 20�� ������ ���ĺ� �ҹ��ڷ� �̷���� �ֽ��ϴ�.
        �߿�!!: ������ �߿��� ���������� ���� �� �ֽ��ϴ�.
         */

        /* Array.sort�� �̿��Ҽ� ������ �ؽø� ��� */

        // ������ ������
        String [] participant = {"leo","kiki","eden","mark"};
        String [] completion = {"eden","kiki"};
        String answer = "";

        Map<String, Integer> player = new HashMap<>(); // ���� �̸� String �� Ű�� Integer �Ӽ��� ����

        for (String name : participant){     // �����ڵ��� �̸��� ����Ʈ�� 0 + 1 �� ���� leo, kiki,eden �� Ű���� ���� 1,1,1
            player.put(name, player.getOrDefault(name,0) +1);
        }
        for (String name : completion){ // ������ ���ֽ� -1�� �����ν� Ű���� 1 �� ���� eden�� kiki �� Ű���� 0
            player.put(name,player.get(name)-1);
        }
        for(String key : player.keySet()){  // �� ��ȸ�� Ű���� 0�� �ƴϸ� �̿����� ���
            if(player.get(key) != 0 ){
                answer = key;
                System.out.println(answer);
            }
        }

        // ���� �˰Ե� ��� getOrDefault

    }
}
