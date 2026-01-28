class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> res = new ArrayList<>();
        int [] count = new int[nums.length+1];
        for(int num:nums){
            count[num]++;
        }
        for(int i = 1; i <= nums.length; i++){
            if(count[i]==0){
                res.add(i);
            }
        }
        return res;
    }
}