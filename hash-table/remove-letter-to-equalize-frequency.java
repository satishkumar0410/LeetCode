class Solution {
    public boolean equalFrequency(String word) {
        int n = word.length();
        
        for (int i = 0; i < n; i++) {
            int[] charCounts = new int[26];
            
            for (int j = 0; j < n; j++) {
                if (i == j) continue;
                charCounts[word.charAt(j) - 'a']++;
            }
            
            if (allEqual(charCounts)) {
                return true;
            }
        }
        return false;
    }

    private boolean allEqual(int[] counts) {
        int commonCount = 0;
        for (int c : counts) {
            if (c == 0) continue; 
            if (commonCount == 0) {
                commonCount = c; 
            } else if (c != commonCount) {
                return false;
            }
        }
        return true;
    }
}