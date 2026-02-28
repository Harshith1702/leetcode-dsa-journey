class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int r=grid.length,c=grid[0].length;
        int max_area=0;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(grid[i][j]==1){
                    int area=dfs(grid,i,j);
                    if(area>max_area)   max_area=area;
                }
            }
        }
        return max_area;
    }

    public static int dfs(int[][] grid,int i,int j){
        int r=grid.length,c=grid[0].length;
        int area=1;
        //base cond..
        if(i<0 || j<0 || i>=r || j>=c)  return 0;
        if(grid[i][j]==0)   return 0;

        grid[i][j]=0;//making to 0

        area+=dfs(grid,i,j+1);
        area+=dfs(grid,i+1,j);
        area+=dfs(grid,i,j-1);
        area+=dfs(grid,i-1,j);

        return area;
    }
}