class Solution {
    public int longestCommonPrefix(int[] arr1, int[] arr2) {
        HashSet<String> set = new HashSet<String>();
        for(int i=0;i<arr1.length;i++){
            String x = Integer.toString(arr1[i]);
            for(int j = 1; j <= x.length(); j++){
                set.add(x.substring(0, j));
            }
        }
        int max = 0;
        for(int i=0;i<arr2.length;i++){
            String x = Integer.toString(arr2[i]);
            for(int j = 1; j <= x.length(); j++){
                String prefix = x.substring(0, j);
                if(set.contains(prefix)){
                    max = Math.max(max, prefix.length());
                }
            }
        }
        return max;
    }
}