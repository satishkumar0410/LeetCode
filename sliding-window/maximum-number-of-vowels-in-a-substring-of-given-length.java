class Solution {
    public boolean isvowel(char ch) {
        return "aeiouAEIOU".indexOf(ch) != -1;
    }
    public int maxVowels(String s, int k) {
        int n = s.length();
        int max = 0;
        int left = 0;
        int res = 0;
        for(int right=0; right<n; right++) {
            if(isvowel(s.charAt(right))) res++;
            if((right-left+1) == k){
                max = Math.max(max,res);
                if(isvowel(s.charAt(left))) res--;
                left++;
            }
        }
        return max;
    }
}