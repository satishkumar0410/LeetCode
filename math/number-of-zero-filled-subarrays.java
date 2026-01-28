class Solution {
    public long zeroFilledSubarray(int[] nums) {
        final int len = nums.length;
        long count = 0;
        long res = 0;
        for(int i = 0; i < len; i++) {
            if(nums[i] == 0) {
                count++;
            } else {
                res += numPairs(count);
                count = 0;
            }
        }
        res += numPairs(count);
        return res;
    }

    long numPairs(long n) {
        return (n * (n + 1)) / 2;
    }
}