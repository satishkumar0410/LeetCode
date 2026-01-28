class Solution {
    public int singleNumber(int[] nums) {
    int solo = 0;
    for(int num:nums){
      solo = solo^num;
    }
    return solo;
    }
}