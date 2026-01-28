class Solution {
    public int maxOperations(String s) {
        int n = s.length();
        int count = 0;
        int res =0 ;
        for(int i = 0; i <n; i++){
            if(s.charAt(i) == '0'){
                res += count;
                while(i<n && s.charAt(i) !='1'){
                    i++;
                }
            }
            count++;
        }
        return res;
    }
}