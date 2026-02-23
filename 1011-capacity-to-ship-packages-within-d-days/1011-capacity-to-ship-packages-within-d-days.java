class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int l=0,r=0;
        for(int i:weights){
            l=Math.max(l,i);
            r+=i;
        }
        while(l<r){
            int m=l+(r-l)/2;
            int load=0,d=1;
            for(int i:weights){
                if(i+load>m){
                    d++;
                    load=0;
                }
                load+=i;
            }    
            if(d<=days)     r=m;//cap more
            else    l=m+1;//cap less
        }
        return l;
    }
}