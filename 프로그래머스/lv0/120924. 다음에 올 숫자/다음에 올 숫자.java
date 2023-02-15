class Solution {
    public int solution(int[] common) {
        return calculate(common);
    }

    private int calculate(int[] common) {
        if (isRatio(common)) {
            return (int) (common[common.length - 1] * ratio(common));
        }
        return common[common.length - 1] + sequence(common);
    }

    private int sequence(int[] common) {
        return common[1] - common[0];
    }

    private double ratio(int[] common) {
        return (double) common[1] / common[0];
    }

    private boolean isRatio(int[] common) {
       return common[1] / common[0] == common[2] / common[1];
    }
}
