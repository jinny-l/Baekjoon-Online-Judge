import java.util.*;

class Solution {
    public int[][] solution(int[][] data, String ext, int val_ext, String sort_by) {
        Map<String, Integer> orderMap = Map.of(
            "code", 0,
            "date", 1,
            "maximum", 2,
            "remain", 3
        );
        
        int[][] filtered = Arrays.stream(data)
            .filter(lines -> lines[orderMap.get(ext)] < val_ext)
            .toArray(int[][]::new);
        
        Arrays.sort(filtered, (o1, o2) -> o1[orderMap.get(sort_by)] - o2[orderMap.get(sort_by)]);
        
        return filtered;
    }
}