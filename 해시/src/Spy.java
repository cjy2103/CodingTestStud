import java.util.HashMap;
import java.util.Set;

public class Spy {
    public static void main(String args[]){
    /*
    �����̵��� ���� �ٸ� ���� �����Ͽ� �Ծ� �ڽ��� �����մϴ�.

    ���� ��� �����̰� ���� ���� �Ʒ��� ���� ���� �����̰� ���׶� �Ȱ�, �� ��Ʈ, �Ķ��� Ƽ������ �Ծ��ٸ�
     �������� û������ �߰��� �԰ų� ���׶� �Ȱ� ��� ���� ���۶󽺸� �����ϰų� �ؾ� �մϴ�.
     ����	�̸�
    ��	���׶� �Ȱ�, ���� ���۶�
    ����	�Ķ��� Ƽ����
    ����	û����
    �ѿ�	�� ��Ʈ

    �����̰� ���� �ǻ���� ��� 2���� �迭 clothes�� �־��� �� ���� �ٸ� ���� ������ ���� return �ϵ���
     solution �Լ��� �ۼ����ּ���.

     */
    // �ǻ� : �ǻ�����
    String clothes [][] = {{"yellowhat","headgear"},{"bluesunglasses","eyewear"},{"green_truban","headgear"}};
        int answer = 1; // ������ ���� 1 ����

        HashMap<String, Integer> clothMap = new HashMap<String, Integer>();

        for(int i=0; i<clothes.length;i++){
            clothMap.put(clothes[i][1], clothMap.getOrDefault(clothes[i][1],0) +1); // �ǻ�����, ����
        }

        Set<String> keySet = clothMap.keySet();

        for(String key : keySet){
            answer *= clothMap.get(key) +1;
        }

        System.out.println(answer -1); // �ƹ��͵� ���Դ� ��� ����

    }
}
