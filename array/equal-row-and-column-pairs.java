class Solution {
    public int equalPairs(int[][] grid) {
        int m = grid.length;
        int count = 0;
        Map<List<Integer>,Integer> row = new HashMap<>();
        for (int i = 0; i < m; i++) {
            List<Integer> rowmap = new ArrayList<>();
            for (int j = 0; j < m; j++) {
                rowmap.add(grid[i][j]);
            }
            row.put(rowmap,row.getOrDefault(rowmap,0)+1);
        }
        for (int j = 0; j < m; j++) {
            List<Integer> col = new ArrayList<>();
            for (int i = 0; i < m; i++) {
                col.add(grid[i][j]);
            }
            if(row.containsKey(col)) {
                count += row.get(col);
            }
        }
        return count;
    }
}