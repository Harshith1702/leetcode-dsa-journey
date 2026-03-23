class Solution {
    public int maxProductPath(int[][] grid) {
        int n = grid.length, m = grid[0].length;
        long[] max = new long [m];
        long[] min = new long [m];

        max[0] = min[0] = grid[0][0];
        
        // First Row
        for (int j = 1; j < m; j++) {
            max[j] = min[j] = max[j-1] * grid[0][j];
        }

        for (int i = 1; i < n; i++) {
            max[0] = min[0] = max[0] * grid[i][0];
            for (int j = 1; j < m; j++) {
                long ele = grid[i][j];
                long a = max[j] * ele;
                long b = min[j] * ele;
                long c = max[j-1] * ele;
                long d = min[j-1] * ele;

                min[j] = Math.min(Math.min(a, b), Math.min(c, d));
                max[j] = Math.max(Math.max(a, b), Math.max(c, d));
            }
        }
        if (max[n-1] < 0)    return -1;
        return (int)(max[n-1] % 1000000007L);
    }
}