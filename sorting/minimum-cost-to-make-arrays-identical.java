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
        for(int i=0; i<Math.max(arr.length,brr.length);i++){
            res+= Math.abs(arr[i]-brr[i]);
        }
        return res+2;
    }
}