class Solution {
    public int minRemoval(int[] nums, int k) {
        int j = 0;
        int removecount = 0;
        Arrays.sort(nums);
        if(nums.length==1){
            return 0;
        }
        for(int i = 0; i < nums.length; i++){
            while(nums[j]*k < nums[i]){
                j++;
            }
            removecount = Math.max(removecount,j-i+1);
        }
        return nums.length-1-removecount;
    }
}