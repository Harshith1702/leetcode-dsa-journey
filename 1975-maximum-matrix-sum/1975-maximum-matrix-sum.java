class Solution {
    public long maxMatrixSum(int[][] matrix) {
        int c=0,min=Integer.MAX_VALUE;
        long sum=0;
        //negative count
        for(int i=0;i<matrix.length;i++)
            for(int j=0;j<matrix[i].length;j++){
                if(matrix[i][j]<0)  c++;
                min=Math.min(min,Math.abs(matrix[i][j])); 
            }
        if(c%2==0){
            for(int i=0;i<matrix.length;i++)
                for(int j=0;j<matrix[i].length;j++)
                    sum+=Math.abs(matrix[i][j]);
        return sum;
        }
        if(c%2!=0){
            for(int i=0;i<matrix.length;i++){
                for(int j=0;j<matrix[i].length;j++)
                        sum+=Math.abs(matrix[i][j]);
                }
            }
        return sum-2L*(min);
    }
}