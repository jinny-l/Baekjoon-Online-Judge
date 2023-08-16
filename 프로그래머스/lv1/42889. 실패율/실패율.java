import java.util.*;
import java.util.stream.Collectors;

class Solution {
    public int[] solution(int N, int[] stages) {
        Map<Integer, Double> rates = new HashMap<>();

        for (int i = 1; i <= N; i++) {
            double total = 0;
            double fail = 0;

            for (int j = 0; j < stages.length; j++) {
                if (stages[j] > i) {
                    total++;
                }
                if (stages[j] == i) {
                    total++;
                    fail++;
                }
            }
            if (total == 0) {
                rates.put(i, 0.0);
            } else {
                rates.put(i, fail / total);
            }
        }

        // 정렬
        List<Integer> result = new ArrayList<>(rates.keySet());
        Collections.sort(result, ((o1, o2) -> Double.compare(rates.get(o2), rates.get(o1))));
        return result.stream().mapToInt(Integer::intValue).toArray();
    }
}