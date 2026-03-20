class Solution {
    public long minEnd(int n, int x) {
        long res=x;
        long k=n-1;//add n-1 steps to reach last no. ..
        int i=0;
        while(k>0){
            if((res & (1L<<i))==0){
                res|=(k & 1)<<i;
                k>>=1;
            }
            i++;
        }
        return res;
    }
}