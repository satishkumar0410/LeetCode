class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        // Step 1: Count frequencies in nums1
        HashMap<Integer, Integer> counts = new HashMap<>();
        for (int num : nums1) {
            counts.put(num, counts.getOrDefault(num, 0) + 1);
        }
        List<Integer> intersection = new ArrayList<>();
        for (int num : nums2) {
            if (counts.containsKey(num) && counts.get(num) > 0) {
                intersection.add(num);
                counts.put(num, counts.get(num) - 1);
            }
        }
        int[] res = new int[intersection.size()];
        for (int i = 0; i < intersection.size(); i++) {
            res[i] = intersection.get(i);
        }

        return res;
    }
}