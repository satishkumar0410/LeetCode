class Solution {
    public long minCost(int[] arr, int[] brr, long k) {
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
        return res+2;
    }
}