class Solution {
    public String solution(int[] numbers, String hand) {
        StringBuilder answer = new StringBuilder();

        // 키패드 숫자를 배열에 저장
        int[][] keypad = new int[3][3];

        int init = 1;
        for (int i = 0; i < keypad.length; i++) {
            for (int j = 0; j < keypad.length; j++) {
                keypad[i][j] = init++;
            }
        }

        // 문제 풀이
        int leftPosition = 10;  // "*" 위치
        int rightPosition = 12; // "#" 위치

        for (int number : numbers) {

            // 왼쪽 숫자일 때
            if (number == 1 || number == 4 || number == 7) {
                answer.append("L");
                leftPosition = number;

            // 오른쪽 숫자일 때
            } else if (number == 3 || number == 6 || number == 9) {
                answer.append("R");
                rightPosition = number;

             // 중간 숫자일 때
            } else {
                if (number == 0) {
                    number = 11; // 거리 계산을 위해 숫자가 0이면 11로 바꿔준다.
                }
                // 거리 계산
                int leftDistance = Math.abs(leftPosition - number) / 3 + Math.abs(leftPosition - number) % 3;  // 왼손 거리
                int rightDistance = Math.abs(rightPosition - number) / 3 + Math.abs(rightPosition - number) % 3; // 오른손 거리

                if (leftDistance == rightDistance) {
                    if (hand.equals("right")) {
                        answer.append("R");
                        rightPosition = number;
                        
                    } else {
                        answer.append("L");
                        leftPosition = number;
                    }
                    
                } else if (leftDistance < rightDistance) {
                    answer.append("L");
                    leftPosition = number;

                } else {
                    answer.append("R");
                    rightPosition = number;
                }
            }
        }

        return answer.toString();
    }
}