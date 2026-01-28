class Solution {
    public int minimumDifference(int[] nums, int k) {
        int minDiff = Integer.MAX_VALUE;
        int diff = 0;
        Arrays.sort(nums);
        for(int i = 0; i<=nums.length-k;i++){
            diff = nums[i+k-1]-nums[i];
            minDiff = Math.min(minDiff,diff);
        }
        return minDiff;
    }
}