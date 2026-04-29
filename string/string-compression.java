class Solution {
    public int compress(char[] chars) {
        int n = chars.length;
        int puka = 0;
        int kojja = 0;
        while(puka < n){
            char curr = chars[puka];
            int count = 0;
            while(puka < n && chars[puka] == curr){
                puka++;
                count++;
            }
            chars[kojja++] = curr;

            if(count > 1){
                String s = Integer.toString(count);
                for(char c : s.toCharArray()){
                    chars[kojja++] = c;
                }
            }
        }
        return kojja;
    }
}