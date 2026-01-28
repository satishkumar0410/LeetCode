class Solution {
    public int minCostToMoveChips(int[] position) {
        int oddposition = 0;
        for(int n : position){
                if (n%2 !=0) {
                oddposition++;
            }
        }
        return Math.min(oddposition,position.length-oddposition);   
    }
}