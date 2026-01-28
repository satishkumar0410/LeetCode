class Solution {
    public int maximum69Number (int num) {
        String s = Integer.toString(num);
        char [] s_arr = s.toCharArray();
        for(int i = 0 ; i<s_arr.length;i++){
            if(s_arr[i]=='6'){
                s_arr[i]='9'; 
                break;           }
        }
      return Integer.parseInt(new String(s_arr));
    } 

}