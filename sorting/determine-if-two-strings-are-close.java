class Solution {
    public boolean closeStrings(String word1, String word2) {
        if(word1.length() != word2.length()) return false;
        int[] count = new int[26];
        for(char c : word1.toCharArray()) count[c - 'a']++;
        for(char c : word2.toCharArray()) count[c - 'a']--;
        for(int i : count) if(i == 0) return true;
        return false;
    }
}