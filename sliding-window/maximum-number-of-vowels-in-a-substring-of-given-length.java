class Solution {
    public int maxVowels(String s, int k) {
        int [] chars = new int[26];
        chars['a']++;
        chars['e']++;
        chars['i']++;
        chars['o']++;
        chars['u']++;
        char[] puka =s.toCharArray();
        int res = 0;
        for(int i = 0; i<k;i++){
            res += chars[puka[i]];
        }
        int max = res;
        for(int i = 0, j = k; j < puka.length; i++, j++){
            res -= chars[puka[j]];
            res += chars[puka[j]];
            max = Math.max(max, res);
        }
        return max;
    }
}