class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        long n=grid.length;
        long t=n*n,s=0,ss=0;
        for(int[] row:grid){
            for(int val:row){
                s+=val;
                ss+=(long)val*val;
            }
        }
        long es=t*(t+1)/2;
        long ess=t*(t+1)*(2*t+1)/6;
        long diff=s-es;
        long sdiff=ss-ess;
        long sum=sdiff/diff;
        int r=(int)(diff+sum)/2;
        int m=(int)(sum-r);
        return new int[]{r,m};
    }
}