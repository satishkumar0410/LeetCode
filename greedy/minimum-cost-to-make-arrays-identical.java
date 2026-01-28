class Solution {
    public long minCost(int[] arr, int[] brr, long k) {
        int res2 = 0;
    for(int i=0; i<Math.max(arr.length,brr.length);i++){
            res2+= Math.abs(arr[i]-brr[i]);
        }
        Arrays.sort(arr);
        Arrays.sort(brr);
        int res = 0;
        for(int i = 0; i < Math.max(arr.length,brr.length);i++){
        if(arr[i] == brr[i]){
            return 0;
            }
        }
        for(int i = 0; i < Math.max(arr.length,brr.length);i++){
        if(arr[i] == -brr[i]){
            return Math.abs(2*arr[i]);
            }
        }
        for(int i=0; i<Math.max(arr.length,brr.length);i++){
            res+= Math.abs(arr[i]-brr[i]);
        }
        if(arr.length == 1){
            return res;
        }
        return Math.min(res+2,res2);
    }
}