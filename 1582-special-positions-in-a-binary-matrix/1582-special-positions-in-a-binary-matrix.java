class Solution {
    public int numSpecial(int[][] mat) {
        int n=mat.length,m=mat[0].length;
        int[] col=new int[m];
        int res=0;

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(mat[i][j]==1)    col[j]++;
            }
        }
        for(int i=0;i<n;i++){
            int c=0,idx=-1;
            for(int j=0;j<m;j++){
                if(mat[i][j]==1){
                    c++;
                    idx=j;
                }
            }
            if(c==1 && col[idx]==1) res++;
        }
        return res;
    }
}