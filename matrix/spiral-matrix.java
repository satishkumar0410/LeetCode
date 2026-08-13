class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> res = new ArrayList<>();
        if (matrix == null || matrix.length == 0) return res;
        
        int t = 0; //row start
        int b = matrix.length - 1; // row end
        int l = 0; // column start
        int r = matrix[0].length - 1; // column end
        
        while (t <= b && l <= r) {
            for (int i = l; i <= r; i++) { //go right
                res.add(matrix[t][i]);
            }
            t++;
            
            for (int i = t; i <= b; i++) { // go down
                res.add(matrix[i][r]);
            }
            r--;
            
            if (t <= b) {
                for (int i = r; i >= l; i--) { // go left
                    res.add(matrix[b][i]);
                }
                b--;
            }
            
            if (l <= r) {
                for (int i = b; i >= t; i--) {  // go up
                    res.add(matrix[i][l]);
                }
                l++;
            }
        }
        
        return res;
    }
}

/**
    row begin              row end
     ->  1 ->  2 ->  3 ->  4  column begin
     <-  5 <- 6  <- 7  <- 8 <-
     ->  9  -> 10  -> 11  ->12  column end


     first travel : column begin : column end (go right)
           1-2-3-4 added,then need to go down, go increase row begin by 1
           t++;
    second travel : row begin : row end (go down)
           4-8-12 added, then reduce colend by 1
           r--;
    third travel : column end : column begin (before going left check if the path exists)
           11-10-9 added, reduce row end by 1
           b--;
    fourth travel : row end : row begin
           5-6-7 added, col begin ++:
     final -> 1-2-3-4-8-12-11-10-9-5-6-7;
 */