class Solution {
    public long countCommas(long n) {
        long c=0;
        long m=1000;
        while(m<=n){
            c+=(n-m+1);
            m*=1000;
        }
        return c;
    }
}