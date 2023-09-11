import sun.awt.SunHints;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class kthNumber {
    public static void main(String args[]){
        /*
        배열 array의 i번째 숫자부터 j번째 숫자까지 자르고 정렬했을 때, k번째에 있는 수를 구하려 합니다.

        예를 들어 array가 [1, 5, 2, 6, 3, 7, 4], i = 2, j = 5, k = 3이라면

        1. array의 2번째부터 5번째까지 자르면 [5, 2, 6, 3]입니다.
        2. 1에서 나온 배열을 정렬하면 [2, 3, 5, 6]입니다.
        3. 2에서 나온 배열의 3번째 숫자는 5입니다.
        배열 array, [i, j, k]를 원소로 가진 2차원 배열 commands가 매개변수로 주어질 때,
         commands의 모든 원소에 대해 앞서 설명한 연산을 적용했을 때 나온 결과를 배열에 담아 return 하도록
         solution 함수를 작성해주세요.
         */
        int [] array = {1,5,2,6,3,7,4};
        int [][] commands ={{2,5,3},{4,4,1},{1,7,3}};

        ArrayList<Integer> arrayList = new ArrayList<>(); // i부터 j 까지 자른 배열을 담을 ArrayList
        ArrayList<Integer> arrayList2 = new ArrayList<>(); // 자른 arrayList에서 k번째 위치를 넣을 arrayList

        for(int i=0;i<commands.length;i++){
            int start = commands[i][0] -1;  // 배열은 0부터 시작하기 때문에 1씩 빼줘야 배열의 시작 위치값이 됨
            int end = commands[i][1];   // <= 로 하려면 -1 해야함 <로 할것이기 때문에 -1 안함
            int k  = commands[i][2]-1;  // 배열은 0부터 시작하므로...

            for(int j=start;j<end;j++){
                arrayList.add(array[j]); // arrayList에 결과값을 담아준다.
            }

            Collections.sort(arrayList); //정렬
            arrayList2.add(arrayList.get(k)); // k번째 위치값을 arrayList2에 담아준다.
            arrayList.clear(); // arrayList 초기화후 반복
        }

        int [] answer = new int[arrayList2.size()]; // return 타입이 int 배열이기 때문에 arrayList -> 배열로 변환하는 작업

        for(int i =0;i<answer.length;i++){
            answer[i] = arrayList2.get(i).intValue();
        }

        System.out.println(Arrays.toString(answer));


    }
}
