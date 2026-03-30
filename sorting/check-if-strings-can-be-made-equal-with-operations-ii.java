class Solution {
    public boolean checkStrings(String s1, String s2) {
        HashMap<Character,Integer> e = new HashMap<>();
        HashMap<Character,Integer> o = new HashMap<>();
        int n = s2.length();
        for(int i = 0; i < n; i++){
            if(i%2==0){
                e.put(s1.charAt(i), e.getOrDefault(s1.charAt(i), 0) + 1);
                e.put(s2.charAt(i), e.getOrDefault(s2.charAt(i), 0) - 1);
            }
            else {
                o.put(s1.charAt(i), o.getOrDefault(s1.charAt(i), 0) + 1);
                o.put(s2.charAt(i), o.getOrDefault(s2.charAt(i), 0) - 1);
            }
        }
        for (int count : e.values()) {
            if (count != 0) return false;
        }
        for (int count : o.values()) {
            if (count != 0) return false;
        }
        
        return true;
    }
}