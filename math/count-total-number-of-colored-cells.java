class Solution {
    public long coloredCells(long n) {
     long totalcells = 1;
        for (long i = 2; i <= n; i++) {
            totalcells += 4L * (i - 1);
        }
        return totalcells;   
    }
}