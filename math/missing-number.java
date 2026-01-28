class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int res = 0;
        for(int i = 0; i < n;i++){
            res+= nums[i];
        }
        int sum = 0;
        for (int j = 1; j <= n; j++) {
              sum += j;
            }
        final int result = sum-res;
        return result;
    }
}