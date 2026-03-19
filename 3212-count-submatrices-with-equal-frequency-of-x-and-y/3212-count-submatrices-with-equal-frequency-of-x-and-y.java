class Solution {
    public int numberOfSubmatrices(char[][] grid) {
        int n=grid.length,m=grid[0].length;
        int[][] diff=new int[n][m];
        int[][] xcnt=new int[n][m];
        int c=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]=='X'){
                    diff[i][j]=1;
                    xcnt[i][j]=1;
                }
                else if(grid[i][j]=='Y'){
                    diff[i][j]=-1;
                }

                if(i>0){ 
                    diff[i][j]+=diff[i-1][j];
                    xcnt[i][j]+=xcnt[i-1][j];
                }
                if(j>0){
                    diff[i][j]+=diff[i][j-1];
                    xcnt[i][j]+=xcnt[i][j-1];
                }
                if(i>0 && j>0){
                    diff[i][j]-=diff[i-1][j-1];
                    xcnt[i][j]-=xcnt[i-1][j-1];
                }

                if(diff[i][j]==0 && xcnt[i][j]>0)    c++;
            }
        }
        return c;
    }
}