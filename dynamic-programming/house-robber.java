import java.util.HashMap;

class Solution {
    private HashMap<Integer, Integer> cache = new HashMap<>();

    public int rob(int[] nums) {
        return solve(nums, nums.length);
    }

    private int solve(int[] nums, int i) {
        if (i <= 0) {
            return 0;
        }

        if (cache.containsKey(i)) {
            return cache.get(i);
        }
        cache.put(i, Math.max(nums[i - 1] + solve(nums, i - 2), solve(nums, i - 1)));
        return cache.get(i);
    }
}