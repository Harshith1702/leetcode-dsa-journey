class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int n=matrix.length,m=matrix[0].length;
        int l=0,h=n*m-1;
        while(l<=h){
            int mid=l+(h-l)/2;
            int i=mid/m,j=mid%m;
            if(matrix[i][j]==target)    return true;
            else if(target<matrix[i][j])    h=mid-1;
            else    l=mid+1;
        }
        return false;
    }
}