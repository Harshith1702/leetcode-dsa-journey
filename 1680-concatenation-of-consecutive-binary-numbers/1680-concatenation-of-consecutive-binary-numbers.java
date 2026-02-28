class Solution {
    public int concatenatedBinary(int n) {
        int m=1000000007;
        long res=0;
        for(int i=1;i<=n;i++){
            int bits=0;
            int temp=i;
            while(temp>0){
                bits++;
                temp>>=1;
            }
            res=((res<<bits)+i)%m;
        }
        return (int)res;
    }
}