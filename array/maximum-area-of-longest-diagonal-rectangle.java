class Solution {
    public int areaOfMaxDiagonal(int[][] dimensions) {
        int maxdialen = 0;
        int dialen = 0;
        int maxArea = 0;
        for(int i = 0; i<dimensions.length;i++){
            int l = dimensions[i][0];
            int w = dimensions[i][1];
            dialen = l*l+w*w;
            if(maxdialen<dialen || (maxdialen == dialen && maxArea < l*w)){
                maxArea = l*w;
                maxdialen=dialen;
            }
        }
        return maxArea;
    }
}