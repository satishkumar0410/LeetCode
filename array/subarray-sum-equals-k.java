public class Solution {
    public int subarraySum(int[] nums, int k) {
        int sum = 0, result = 0;
        Map<Integer, Integer> prevSum = new HashMap<>();
        prevSum.put(0, 1);
        
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if (prevSum.containsKey(sum - k)) {
                result += prevSum.get(sum - k);
            }
            prevSum.put(sum, prevSum.getOrDefault(sum, 0) + 1);
        }
        
        return result;
    }
}