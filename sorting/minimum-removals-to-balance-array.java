class Solution {
    public int minRemoval(int[] nums, int k) {
        int j = 0;
        int n = nums.length;
        int removecount = 0;
        Arrays.sort(nums);
        if(n<=1){
            return 0;
        }
        for(int i = 0; i < nums.length; i++){
            while((long)nums[i]>(long)nums[j]*k){
                j++;
            }
            removecount = Math.max(removecount,i-j+1);
        }
        return n-removecount;
    }
}