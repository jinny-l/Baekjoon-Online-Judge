import java.util.*;

class Solution {
    public int[] solution(String today, String[] terms, String[] privacies) {
        // 약관 기간을 Map으로 변경
        Map<String, Integer> termsOfPolicies = new HashMap<>();
        for (int i = 0; i < terms.length; i++) {
            String[] tmp = terms[i].split(" ");
            termsOfPolicies.put(tmp[0], Integer.parseInt(tmp[1]) * 28); // 달을 일로 환산
        }

        // today를 일수로 변환
        int expiredDate = convertToDate(today);

        // 보관된 개인정보 기간을 하나씩 파싱
        List<Integer> answer = new ArrayList<>();
        for (int i = 0; i < privacies.length; i++) {
            String[] tmp = privacies[i].split(" ");

            int targetDate = convertToDate(tmp[0]);
            int term = termsOfPolicies.get(tmp[1]);

            if (isExpired(expiredDate, targetDate, term)) {
                answer.add(i + 1);
            }
        }

        // 결과를 배열로 변환
        int[] result = new int[answer.size()];
        for (int i = 0; i < answer.size(); i++) {
            result[i] = answer.get(i);
        }

        return result;
    }

    private static int convertToDate(String date) {
        String[] tmp = date.split("\\.");
        return Integer.parseInt(tmp[0]) * 12 * 28 + Integer.parseInt(tmp[1]) * 28 + Integer.parseInt(tmp[2]);
    }

    private static boolean isExpired(int expiredDate, int targetDate, int term) {
        return expiredDate >= targetDate + term;
    }
}
