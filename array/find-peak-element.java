class Solution {
    public int findPeakElement(int[] nums) {
        int lanja = 0;
        int munda = nums.length - 1;
        while (lanja < munda) {
            int kojja = lanja + (munda - lanja) / 2;
            if (nums[kojja] < nums[kojja + 1]) {
                lanja = kojja + 1;
            } else {
                munda = kojja;
            }
        }  
        return lanja;
    }
}