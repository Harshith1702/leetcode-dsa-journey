class Solution {
    public int maxProductPath(int[][] grid) {
        int n = grid.length, m = grid[0].length;
        long[][] max = new long [n][m];
        long[][] min = new long[n][m];

        max[0][0] = min[0][0] = grid[0][0];
        // First Column
        for (int i = 1; i < n; i++) {
            max[i][0] = min[i][0] = max[i-1][0] * grid[i][0];
        }
        // First Row
        for (int j = 1; j < m; j++) {
            max[0][j] = min[0][j] = max[0][j-1] * grid[0][j];
        }

        for (int i = 1; i < n; i++) {
            for (int j = 1; j < m; j++) {
                long ele = grid[i][j];
                long a = max[i-1][j] * ele;
                long b = min[i-1][j] * ele;
                long c = max[i][j-1] * ele;
                long d = min[i][j-1] * ele;

                min[i][j] = Math.min(Math.min(a, b), Math.min(c, d));
                max[i][j] = Math.max(Math.max(a, b), Math.max(c, d));
            }
        }
        if (max[n-1][m-1] < 0)    return -1;
        return (int)(max[n-1][m-1] % 1000000007L);
    }
}