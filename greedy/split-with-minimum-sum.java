class Solution {
    public int splitNum(int num) {
      StringBuilder num1 = new StringBuilder();
      StringBuilder num2 = new StringBuilder();
      String  s = Integer.toString(num);
      char [] s_arr = s.toCharArray();
      Arrays.sort(s_arr);
      for(int i = 0; i < s_arr.length; i++){
       if(i%2==0){
          num1.append(s_arr[i]);
       }
       else{
        num2.append(s_arr[i]);
       }  

      }
        int result1 = Integer.parseInt(num1.toString());
        int result2 = Integer.parseInt(num2.toString());  

        return result1+result2;
      
    }

}