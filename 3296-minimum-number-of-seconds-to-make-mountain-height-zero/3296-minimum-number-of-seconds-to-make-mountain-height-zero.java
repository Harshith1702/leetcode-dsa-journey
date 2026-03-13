class Solution {
    public long minNumberOfSeconds(int mountainHeight, int[] workerTimes) {
        long l=0,h=(long)1e18;
        while(l<h){
            long m=l+(h-l)/2;
            long removed=0;
            for(int t:workerTimes){
                long k=(long)((Math.sqrt(1+8.0*m/t)-1)/2); 
                //Derived from quadratic eq. 
                // solve k(k+1)/2*t<=m -> k=(-1+sqrt(1+8*m/t))/2
                removed+=k;
                if(removed>=mountainHeight) break;
            }
            if(removed>=mountainHeight) h=m;
            else  l=m+1;
        }
        return l;
    }
}