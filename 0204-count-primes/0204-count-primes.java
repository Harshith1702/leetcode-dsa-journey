class Solution {
    public int countPrimes(int n) {
        if(n<=2)    return 0;
        boolean[] Prime=new boolean[n];
        for(int i=0;i<n;i++){
            Prime[i]=true;
        }
        Prime[0]=false;//Not compulsary
        Prime[1]=false;//Not compulsary
        int c=n-2;
        for(int i=2;i*i<n;i++){
            if(Prime[i]){
                for(int j=i*i;j<n;j=j+i){
                    if(Prime[j]){
                        c--;
                        Prime[j]=false;
                    }
                }
            }
        }
        return c;
    }
}