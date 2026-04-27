class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int podavu = cost.length;
        int okaadugu = cost[0];
        int rendadugu = 0;
        for(int i = 2; i <= podavu;i++){
            int munda = cost[i-1] + Math.min(okaadugu,rendadugu);
            rendadugu = okaadugu;
            okaadugu = munda;
        }
        return Math.min(okaadugu,rendadugu);
    }
}