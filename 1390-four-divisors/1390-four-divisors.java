class Solution {
    public int sumFourDivisors(int[] nums) {
        int tsum=0;//total sum
        for(int x:nums){
            int c=2;
            int sum=x+1;
            for(int i=2;i*i<=x;i++){
                if(x%i==0){
                    int other=x/i;
                    c++;
                    if(i!=other){
                        c++;
                        sum+=other;
                    }
                    sum+=i;
                    if(c>4) break;
                }
            }if(c==4)   tsum+=sum;
        }return tsum;       
    }
}