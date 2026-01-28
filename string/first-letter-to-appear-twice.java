class Solution {
    public char repeatedCharacter(String s) {
        Set<Character> res = new HashSet<>();
        for (char c : s.toCharArray()) {
            if (res.contains(c)) {
                return c;
            }
            res.add(c);
        }
        return '\0';
    }
}