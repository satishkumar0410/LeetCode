class Solution {
    public int missingInteger(int[] nums) {
        int len = nums.length;
        HashSet<Integer> map = new HashSet<>();

        for(int num : nums){
            map.add(num);
        }
        int sum = nums[0];
        for(int i = 1; i < len; i++){
            if(nums[i] == nums[i-1]+1)
                sum+= nums[i];
            else break;
        }
        while(map.contains(sum)) sum++;
        return sum;
    }
}