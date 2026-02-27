import java.util.HashMap;

class Solution {
    public int strStr(String haystack, String needle) {
        int n = haystack.length();
        int m = needle.length();
        if (m == 0) return 0;
        if (m > n) return -1;
        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i <= n - m; i++) {
            String sub = haystack.substring(i, i + m);
            
            if (!map.containsKey(sub)) {
                map.put(sub, i);
            }
            
            if (sub.equals(needle)) {
                return i;
            }
        }
        return map.getOrDefault(needle, -1);
    }
}