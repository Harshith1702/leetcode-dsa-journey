class Solution {
    public int[] closestPrimes(int left, int right) {
        List<Integer> lt=list(right);
        boolean[] primes=new boolean[right-left+1];
        Arrays.fill(primes,true);
        if(left==1) primes[0]=false;
        for(int i=0;i<lt.size();i++){
            int p=lt.get(i);
            int x=((left+p-1)/p)*p;
            if(x==p)    x+=p;
            for(int j=x;j<=right;j+=p){
                primes[j-left]=false;
            }
        }

        int a=-1,b=-1,prev=-1,diff=Integer.MAX_VALUE;
        for(int i=0;i<primes.length;i++){
            if(primes[i]){
                int x=i+left;
                if(prev!=-1 && x-prev<diff){
                    diff=x-prev;
                    a=prev;
                    b=x;
                }
                prev=x;
            }
        }
        return new int[]{a,b};
    }
    public static List<Integer> list(int b){
        List<Integer> lt=new ArrayList<>();
        boolean[] primes=new boolean[b+1];
        Arrays.fill(primes,true);
        primes[0]=false;
        primes[1]=false;
        for(int i=2;i*i<=b;i++){
            if(primes[i]){
                for(int j=i*i;j<=b;j+=i){
                    primes[j]=false;
                }
            }
        }
        for(int i=2;i*i<=b;i++){
            if(primes[i])   lt.add(i);
        }
        return lt;
    }
}