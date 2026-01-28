class Solution {
    public int[][] sortMatrix(int[][] grid) {
        int n = grid.length;

        for (int i = 0; i < n; i++) {
            diagSort(grid, i, 0);
            diagSort(grid, 0, i);}

        return grid;}

    private void diagSort(int[][] grid, int a, int b) {
        int n = grid.length;
        int rnge = Math.min(n - a, n - b);
        int[] arr = new int[rnge];

        for (int k = 0; k < rnge; k++) {
            arr[k] = grid[a + k][b + k];}

        Arrays.sort(arr);
        if (a >= b) {

            for (int i = 0; i < rnge / 2; i++) {
                int temp = arr[i];
                arr[i] = arr[rnge - 1 - i];
                arr[rnge - 1 - i] = temp;}}

        for (int k = 0; k < rnge; k++) {
            grid[a + k][b + k] = arr[k];}}}