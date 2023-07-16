class Solution {
    public int[] solution(String[] park, String[] routes) {
        int[] start = findStart(park); // 시작지점 좌표 찾기
        int[][] directions = { {-1, 0}, {1, 0}, {0, -1}, {0, 1} }; // 북, 남, 서, 동 방향

        for(String route : routes){
            String[] command = route.split(" ");
            String op = command[0];
            int n = Integer.parseInt(command[1]);

            for(int i=0; i<n; i++){
                int newRow = start[0] + directionToRow(op);
                int newCol = start[1] + directionToCol(op);

                // 공원 범위를 벗어나거나 장애물을 만나면 해당 명령을 무시하고 다음 명령 수행
                if (!isValidPosition(park, newRow, newCol) || park[newRow].charAt(newCol) == 'X') {
                    break;
                }

                start[0] = newRow;
                start[1] = newCol;

            }



        }

        int[] answer = {};
        return answer;
    }


    private int[] findStart(String[] park) {
        int[] start = new int[2];
        for(int i=0;i< park.length;i++){
            for(int j=0;j<park[i].length();j++){
                if(park[i].charAt(j) == 'S'){
                    start[0] = i;
                    start[1] = j;
                    return start;
                }
            }
        }
        return start;
    }

    private int directionToRow(String direction) {
        if (direction.equals("N")) {
            return -1;
        } else if (direction.equals("S")) {
            return 1;
        } else {
            return 0;
        }
    }

    private int directionToCol(String direction) {
        if(direction.equals("W")){
            return -1;
        } else if(direction.equals("E")){
            return 1;
        } else {
            return 0;
        }
    }

}