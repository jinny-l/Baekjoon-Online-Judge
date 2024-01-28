class Solution {
    public int[] solution(String[] park, String[] routes) {
            int x = -1;
            int y = -1;

            // 시작 위치 찾기
            for(int i = 0; i < park.length; i++) {

                for(int j = 0; j < park[0].length(); j++) {
                    char findS = park[i].charAt(j);

                    if(findS == 'S') {
                        x = i;
                        y = j;
                        break;
                    }
                }
            }

            // 이동
            for(int i = 0; i < routes.length; i++) {
                String[] tmp = routes[i].split(" ");

                int row = x;
                int col = y;

                String direction = tmp[0];
                int count = Integer.parseInt(tmp[1]);

                // 이동
                for(int j = 0; j < count; j++) {

                    if(direction.equals("N")) {
                        row--;
                    }

                    if(direction.equals("S")) {
                        row++;
                    }

                    if(direction.equals("W")) {
                        col--;
                    }

                    if(direction.equals("E")) {
                        col++;
                    }

                    // 범위 확인
                    if(col < 0 || col >= park[0].length() || row < 0 || row >= park.length) {
                        break;
                    }

                    // 장애물 확인
                    if (park[row].charAt(col) == 'X') {
                        break;
                    }

                    if (j == count - 1) {
                        x = row;
                        y = col;
                    }
                }
            }

            return new int[]{x, y};
    }
}