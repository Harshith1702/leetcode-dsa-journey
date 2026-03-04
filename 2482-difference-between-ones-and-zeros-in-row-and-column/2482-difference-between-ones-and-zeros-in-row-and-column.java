class Solution {
    public int[][] onesMinusZeros(int[][] grid) {
        int n=grid.length,m=grid[0].length;
        int[][] diff= new int[n][m];
        int[] row_1=new int[n]; //row no. of ones
        int[] col_1=new int[m]; //column no. of ones

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==1){  
                    row_1[i]++; 
                    col_1[j]++;
                }
            }
        }

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                diff[i][j]=2*row_1[i]+2*col_1[j]-n-m;
            }
        }
        return diff;
    }
}