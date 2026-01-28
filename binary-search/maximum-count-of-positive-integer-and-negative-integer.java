class Solution {
    public int maximumCount(int[] nums) {
        int countPos = 0;
        int countNeg = 0;

        for (int num : nums) {
            if (num > 0) {
                countPos++;
            } else if (num < 0) {
                countNeg++;
            }
        }

        return Math.max(countPos, countNeg);
    }
}