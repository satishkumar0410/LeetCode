class Solution {
    public int longestCommonPrefix(int[] arr1, int[] arr2) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < arr1.length; i++) {
            int val = arr1[i];
            while (val > 0) {
                set.add(val);
                val /= 10;
            }
        }
        int max = 0;
        for (int i = 0; i < arr2.length; i++) {
            int val = arr2[i];
            while (val > 0) {
                if (set.contains(val)) {
                    max = Math.max(max, Integer.toString(val).length());
                    break; 
                }
                val /= 10;
            }
        }
        return max;
    }
}