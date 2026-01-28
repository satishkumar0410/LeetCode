import java.util.TreeSet;

class Solution {
    public boolean containsNearbyAlmostDuplicate(int[] nums, int indexDiff, int valueDiff) {
        TreeSet<Long> set = new TreeSet<>();

        for (int i = 0; i < nums.length; i++) {
            long currnum = (long) nums[i];

            Long last = set.floor(currnum + valueDiff);
            Long first = set.ceiling(currnum - valueDiff);

            if ((last != null && last >= currnum - valueDiff) || 
                (first != null && first <= currnum + valueDiff)) {
                return true;
            }

            set.add(currnum);

            if (set.size() > indexDiff) {
                set.remove((long) nums[i - indexDiff]);
            }
        }

        return false;
    }
}