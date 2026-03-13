class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int res = 0;
        for (int i = 0; i < n; i++) {
            HashSet<Character> set = new HashSet<>();
            int count = 0;
            for (int j = i; j < n; j++) {
                if (!set.contains(s.charAt(j))) {
                    set.add(s.charAt(j));
                    count++;
                    res = Math.max(res, count);
                } else {
                    break;
                }
            }
        }
        
        return res;
    }
}