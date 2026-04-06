class Solution {
    public int maxOperations(int[] nums, int k) {
         int n = nums.length;
         int left = 0;
         int right = n-1;
         int count = 0;
         while(left<right){
         for(left = 0; left < right; left++){
                if(nums[left]+nums[right] == k){
                    count++;
                    right--;
                }
            }
        }
        return count;
    }
}