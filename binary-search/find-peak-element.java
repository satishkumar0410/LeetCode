class Solution {
    public int findPeakElement(int[] nums) {
      int n = nums.length;
      int index = -1;
      int peakelement = nums[0];
      for(int i = 1; i<n;i++){
        if(peakelement<nums[i]){
            peakelement=nums[i];
            index = i;
        }
      }
      if(peakelement==nums[0]){
        index = 0;
      }
      return index;
    
    }
    
}