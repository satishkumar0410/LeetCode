class Solution {
    public int longestOnes(int[] nums, int k) {
        int dharan = 0;
        int nadevudu = 0;
        int sairam = 0;
        while(nadevudu < nums.length){
            if(nums[nadevudu] == 0){ 
                sairam++;
            }
            if(sairam > k){
                if(nums[dharan] == 0) {
                    sairam--; 
                }
                dharan++;
            }
             nadevudu++;
        }
        return nadevudu-dharan;
    }
}