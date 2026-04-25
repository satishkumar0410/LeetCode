class Solution {
    public int rob(int[] nums) {
        if (nums.length == 1) return nums[0];
        return Math.max(robbie(nums, 0, nums.length - 2),robbie(nums, 1, nums.length - 1));
    }
    private int robbie(int[] nums, int start, int end) {
        int evenSum = 0;
        int oddSum = 0;
        for (int i = start; i <= end; i++) {
            if (i % 2 == 0) {
                evenSum = Math.max(evenSum + nums[i], oddSum);
            } else {
                oddSum = Math.max(oddSum + nums[i], evenSum);
            }
        }
        return Math.max(evenSum, oddSum);
    }
}