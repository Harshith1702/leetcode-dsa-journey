class Solution {
    public int[][] onesMinusZeros(int[][] grid) {
        int n=grid.length,m=grid[0].length;
        int[][] diff= new int[n][m];
        int[] col_1=new int[m]; //column no. of ones

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==1){  
                    col_1[j]++;
                }
            }
        }

        for(int i=0;i<n;i++){
            int row_1=0;
            for(int j=0;j<m;j++){
                row_1+=grid[i][j];
            }
            for(int j=0;j<m;j++){
                diff[i][j]=2*row_1+2*col_1[j]-n-m;
            }
        }
        return diff;
    }
}