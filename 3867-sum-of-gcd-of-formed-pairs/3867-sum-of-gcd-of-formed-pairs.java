class Solution {
    public long gcdSum(int[] nums) {
        int n=nums.length;
        int max=0;
        int[] preGcd=new int[n];
        for(int i=0;i<n;i++){
            max=Math.max(max,nums[i]);
            preGcd[i]=gcd(nums[i],max);
        }
        Arrays.sort(preGcd);
        long res=0;
        for(int i=0;i<n/2;i++){
            res+=gcd(preGcd[i],preGcd[n-i-1]);
        }
        return res;
    }
    public static int gcd(int a,int b){
        return b==0 ? a:gcd(b,a%b);
    }
}