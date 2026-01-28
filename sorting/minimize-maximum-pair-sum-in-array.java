class Solution {
    public int minPairSum(int[] nums) {
        Arrays.sort(nums);
        int max = 0;
        int n = nums.length;
        int j = n-1;
        for(int i = 0; i < n;i++){
            if(nums[i]+nums[j] > max && i!=j){
                max = nums[i]+nums[j];
            }
            j--;
        }
        return max;
    }
}