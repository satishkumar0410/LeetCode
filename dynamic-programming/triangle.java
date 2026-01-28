class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int row = triangle.size();
        int[] res = new int[row];

        for (int i = 0; i < row; i++) {
            res[i] = triangle.get(row - 1).get(i);
        }

        for (int r = row-2; r >= 0; r--) {
            for (int c = 0; c <= r; c++) {
                res[c] = Math.min(res[c], res[c+1]) + triangle.get(r).get(c);
            }
        }

        return res[0];        
    }
}