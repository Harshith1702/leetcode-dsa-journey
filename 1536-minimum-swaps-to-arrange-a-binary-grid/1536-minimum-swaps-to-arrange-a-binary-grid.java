class Solution {
    public int minSwaps(int[][] grid) {
        int n=grid.length;
        int zeroes[]=new int[n];
        int c=0;//swaps
        for(int i=0;i<n;i++){
            int j=n-1;
            while(j>=0 && grid[i][j]==0)    j--;
            zeroes[i]=n-j-1;//trailing zeroes
        }
        
        for(int i=0;i<n;i++){
            int req=n-i-1;//required
            int j=i;
            while(j<n && zeroes[j]<req)     j++;
            if(j==n)    return -1;
            while(j>i){
                int tmp=zeroes[j];
                zeroes[j]=zeroes[j-1];
                zeroes[j-1]=tmp;
                c++;
                j--;
            }
        }
        return c;
    }
}