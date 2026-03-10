class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> map = new HashSet<>();
        for (int n : nums) {
            map.add(n);
        }
        int count = 0;
        for (int n : map) {
            if (!map.contains(n - 1)) {
                int l = 1;
                while (map.contains(n + length)) {
                    l++;
                }
                count = Math.max(count, l);
            }
        }
        return count;
    }
}