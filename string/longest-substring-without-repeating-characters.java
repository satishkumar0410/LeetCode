class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> map = new HashSet<>();
        int n = s.length();
        int count = 0;
        int i = 0; //left 
        int j = 0; //right
        while (j < n) {
            if (!map.contains(s.charAt(j))) {
                map.add(s.charAt(j)); // add chesi window start chestunam
                count = Math.max(count, j - i + 1); //window size kanipedtunam
                j++;
            } else {
                map.remove(s.charAt(i)); //already unte tisi dobbutunam
                i++;
            }
        }
        
        return count; //idi mana window size
    }
}