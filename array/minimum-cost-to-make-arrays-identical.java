class Solution {
    public long minCost(int[] arr, int[] brr, long k) {
        long res2 = 0;
        for(int i=0; i<arr.length;i++){
            res2+= Math.abs(arr[i]-brr[i]);
        }
        Arrays.sort(arr);
        Arrays.sort(brr);
        long res = 0;
        for(int i=0; i<arr.length;i++){
            res+= Math.abs(arr[i]-brr[i]);
        }
        if(arr.length == 1){
            return res2;
        }
        return Math.min(res+k,res2);
    }
}