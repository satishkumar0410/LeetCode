class Solution {
    public long maxProfit(int[] prices, int[] st, int k) {
        long max =0;int n = prices.length;
       
        long flg=0;
        for(int i=0 ; i<n ; i++){
            max+= prices[i]*st[i];
            if(i<(k/2)){
            }
            else if(i>=(k/2) && i<k){ 
                flg+= prices[i]*1;
            }
            else{
                flg+= prices[i]*st[i];
            }
        }
        max = Math.max(max , flg);
        int strt =0, mid = (k/2) , end = k;

        while(end < n){
            
            flg+= prices[strt]*st[strt];
            flg-=prices[mid]*1;
            strt++;mid++;
            
            if(st[end]<=0)
            flg+=prices[end]*1;
            if(st[end]==-1)
                flg+=prices[end]*1;

            end++;
            max =Math.max(max  ,flg);
        }
        return max;
 
    }
}