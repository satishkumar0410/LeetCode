class Solution {
    public int minimumBoxes(int[] apple, int[] capacity) {
        int sum = 0;
        int clen = capacity.length;
        int count = 0;
        for(int i = 0 ; i<apple.length;i++){
         sum +=apple[i];
        }
        Arrays.sort(capacity);
        while(sum>0){
            sum=sum-capacity[clen-1];
            clen--;
            count++;
        }
        return count;
    }
}