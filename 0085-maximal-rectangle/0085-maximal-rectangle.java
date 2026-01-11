class Solution {
    public int maximalRectangle(char[][] matrix) {
        if(matrix==null || matrix.length==0)   return 0;
        int r=matrix.length,c=matrix[0].length;
        int[] h=new int[c];
        int max=0;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++)
                h[j]=matrix[i][j]=='1' ? h[j]+1:0;
        
            Stack<Integer> s=new Stack<>();
            for(int k=0;k<=c;k++){
                int curr= (k==c) ? 0:h[k];
                while(!s.isEmpty() && curr<h[s.peek()]){
                    int height=h[s.pop()];
                    int width=s.isEmpty()? k:(k-s.peek()-1);
                    max=Math.max(max,height*width);
                }s.push(k);
            }
        }return max;
    }
}