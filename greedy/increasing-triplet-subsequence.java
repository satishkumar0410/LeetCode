class Solution {
    public boolean increasingTriplet(int[] nums) {
        int n = nums.length;
        if (n < 3) return false;
        int[] chinnodu  = new int[n];
        chinnodu[0] = nums[0];
        for (int i = 1; i < n; i++) {
            chinnodu[i] = Math.min(chinnodu[i - 1], nums[i]);
        }
        int[] peddodu = new int[n];
        peddodu[n - 1] = nums[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            peddodu[i] = Math.max(peddodu[i + 1], nums[i]);
        }
        for (int i = 1; i < n - 1; i++) {
            if (nums[i] > chinnodu[i] && nums[i] < peddodu[i]) {
                return true;
            }
        }
        return false;
    }
}