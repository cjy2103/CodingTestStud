import java.util.*;
class Solution {
    public int[] solution(String[] park, String[] routes) {
        int x = 0, y = 0;

        for (String str : park) {
            if (str.contains("S")) {
                x = str.indexOf("S");
                break;
            }
            y++;
        }

        for (String move : routes) {
            char dir = move.charAt(0);
            int num = Integer.parseInt(move.substring(2));
            int postX = x;
            int postY = y;

            num *= (dir == 'W' || dir == 'N') ? -1 : 1;
            if (dir == 'E' || dir == 'W') {
                postX += num;
            } else {
                postY += num;
            }

            if (isInsidePark(park, postY, postX) && !isBlockedByObstacle(park, dir, y, x, postY, postX)) {
                x = postX;
                y = postY;
            }
        }

        return new int[]{y, x};
    }

    private boolean isInsidePark(String[] park, int y, int x) {
        return y >= 0 && y < park.length && x >= 0 && x < park[0].length();
    }

    private boolean isBlockedByObstacle(String[] park, char dir, int y, int x, int postY, int postX) {
        if (dir == 'E' || dir == 'W') {
            int start = Math.min(x, postX);
            int end = Math.max(x, postX);
            for (int i = start; i <= end; i++) {
                if (park[y].charAt(i) == 'X') {
                    return true;
                }
            }
        } else {
            int start = Math.min(y, postY);
            int end = Math.max(y, postY);
            for (int i = start; i <= end; i++) {
                if (park[i].charAt(x) == 'X') {
                    return true;
                }
            }
        }
        return false;
    }

}