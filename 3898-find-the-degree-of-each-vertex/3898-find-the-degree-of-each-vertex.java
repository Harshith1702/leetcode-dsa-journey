class Solution {
    public int[] findDegrees(int[][] matrix) {
        int n = matrix.length, m = matrix[0].length;
        int[] res = new int[n];
        for (int i = 0;i < n;i++) {
            int c = 0;
            for (int j = 0;j < m;j++) {
                if (matrix[i][j] == 1)   c++;
                if (j == m - 1){   
                    res[i] = c;
                    c = 0;
                }
            }
        }
        return res;
    }
}