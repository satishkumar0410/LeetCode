class Solution {
    public int longestSubarray(int[] nums) {
        int max = 0;
        for (int i : nums) {
            max = Math.max(max, i);
        }

        int maxLen = 0;
        int count = 0;
        for (int i : nums) {
            if (i == max) {
                count++;
            } else {
                count = 0;
            }
            maxLen = Math.max(maxLen, count);
        }

        return maxLen;
    }
}