import java.util.*;
import java.util.stream.*;

class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        
        Map<String, Set<String>> reports = new HashMap<>(); // 누가 누구를 신고했는지
        Map<String, Integer> users = new HashMap<>(); // 유저별 신고받은 횟수

        // 자료구조 초기화
        for (String id : id_list) {
            reports.put(id, new HashSet<>());
            users.put(id, 0);
        }

        // 신고 내역 파싱
        for (String s : report) {
            String[] tmp = s.split(" ");
            String user = tmp[0];
            String reported = tmp[1];

            if (reports.get(user).contains(reported)) { // 이미 신고한 유저면 패스
                continue;
            }

            Set<String> reportedList = reports.get(user);
            reportedList.add(reported);
            reports.put(user, reportedList);

            users.put(reported, users.get(reported) + 1);
        }

        // 정지된 유저 리스트
        Set<String> bannedUsers = users.keySet().stream()
                .filter(user -> users.get(user) >= k)
                .collect(Collectors.toUnmodifiableSet());

        // 신고횟수 확인
        int[] answer = new int[id_list.length];
        for (int i = 0; i< id_list.length; i++) {
            String user = id_list[i];
            Set<String> reportedUsers = reports.get(user);
            reportedUsers.retainAll(bannedUsers);

            int bannedCount = reportedUsers.size();
            answer[i] = bannedCount;
        }
        return answer;
    }
}