class Solution {
    public long countBadPairs(int[] nums) {
        long n = nums.length;
        long totalPairs = (n * (n - 1)) / 2;
        long goodPairs = 0;
        Map<Integer, Integer> diffCounts = new HashMap<>();
        
        for (int i = 0; i < n; i++) {
            int diff = nums[i] - i;
            if (diffCounts.containsKey(diff)) {
                goodPairs += diffCounts.get(diff);
            }
            diffCounts.put(diff, diffCounts.getOrDefault(diff, 0) + 1);
        }
        
        return totalPairs - goodPairs;
    }
}