class Solution {
    public int findMin(int[] nums) {
        int n = nums.length - 1;
        int kojjagadu = nums[n];
        int itu = 0, atu = n;

        while (itu < atu) {
            int mogga = (itu + atu) >> 1; // clever way to perform division by 2
            if (nums[mogga] > kojjagadu) {
            itu = mogga + 1;
            }
            else atu = mogga;
        }
        return nums[itu];
    }
}