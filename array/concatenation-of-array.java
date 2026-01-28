class Solution {
    public int[] getConcatenation(int[] nums) {
        int size = (nums.length)*2;
        int [] ans = new int[size];
        for(int i = 0;i<nums.length;i++){
            ans[i] = nums[i];
        }
        for(int j = 0; j < nums.length; j++){
            ans[j+nums.length] = nums[j];
        }
        return ans;
    }
}