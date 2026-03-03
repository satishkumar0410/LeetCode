class Solution {
    public int reverse(int x) {
        int res = 0;
        int lastdigit = 0;
        while(x!=0){
            lastdigit = x%10;
            res = (res*10)+lastdigit;
            x = x/10;
        }
        if(res < INTEGER.MIN_Value || res > INTEGER.MAX_Value){
            return 0;
        }
        return (int) res;
    }
}