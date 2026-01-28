class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;

        HashMap<Character, Integer> map = new HashMap<>();
        for(char c : s.toCharArray()){
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        
        for(char i : t.toCharArray()){
            if(map.containsKey(i) && map.get(i) > 0){
                map.put(i, map.get(i) - 1);
            } else {
                return false;
            }
        }
        return true;
    }
}