class Solution {
    public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];
        for (int i = 0; i < quiz.length; i++) {
            String[] tmp = parse(quiz[i]);
            answer[i] = quizResult(tmp);
        }
        return answer;
    }

    private String quizResult(String[] quiz) {
        int x = Integer.parseInt(quiz[0]);
        String operator = quiz[1];
        int y = Integer.parseInt(quiz[2]);
        int result = Integer.parseInt(quiz[4]);
        int expected = calculate(x, y, operator);
        if (result == expected) {
            return "O";
        }
        return "X";
    }

    private int calculate(int x, int y, String operator) {
        if (operator.equals("+")) {
            return x + y;
        }
        if (operator.equals("-")) {
            return x - y;
        }
        return -10001; // 에외 임의 처리
    }

    private String[] parse(String quiz) {
        return quiz.split(" ");
    }
}
