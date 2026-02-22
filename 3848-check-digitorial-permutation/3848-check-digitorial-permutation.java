class Solution {
    public boolean isDigitorialPermutation(int n) {
        int[] fact=new int[10];
        fact[0]=1;
        for(int i=1;i<10;i++)
            fact[i]=i*fact[i-1];
        int x=n;
        int sum=0;
        while(x>0){
            int tmp=x%10;
            x/=10;
            sum+=fact[tmp];
        }
        int[] a=new int[10];
        int[] b=new int[10];

        x=n;
        while(x>0){
            a[x%10]++;
            x/=10;
        }
        x=sum;
        while(x>0){
            b[x%10]++;
            x/=10;
        }

        for(int i=0;i<10;i++){
            if(a[i]!=b[i]) return false;
        }
        return true;
    }
}