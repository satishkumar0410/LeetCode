class Solution {
    public boolean isPalindrome(int x) {
       int normal = x;
       int rev = 0;
       int rem ;
       while(x>0){
        rem = x%10;
        rev = (rev*10)+(rem);
        x = x/10;
       }
       
        return rev == normal;
       } 
    }