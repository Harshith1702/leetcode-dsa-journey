class Solution {
    public int[] closestPrimes(int left, int right) {
        boolean[] primes=new boolean[right+1];
        Arrays.fill(primes,true);
        primes[0]=false;
        primes[1]=false;
        for(int i=2;i*i<=right;i++){
            if(primes[i]){
                for(int j=i*i;j<=right;j+=i){
                    primes[j]=false;
                }
            }
        }
        int a=-1,b=-1,prev=-1,diff=Integer.MAX_VALUE;
        for(int i=left;i<=right;i++){
            if(primes[i]){
                if(prev!=-1 && i-prev<diff){
                    diff=i-prev;
                    a=prev;
                    b=i;
                }
                prev=i;
            }
        }
        return new int[]{a,b};
    }
}