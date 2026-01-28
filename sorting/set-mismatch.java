class Solution {
    public int[] findErrorNums(int[] nums) {
        int n = nums.length;
        int[] counts = new int[n + 1]; 
        int[] res = new int[2];
        for (int num : nums) {
            counts[num]++;
        }

        for (int i = 1; i <= n; i++) {
            if (counts[i] == 2) {
                res[0] = i; 
            } else if (counts[i] == 0) {
                res[1] = i;
            }
        }

        return res;
    }
}