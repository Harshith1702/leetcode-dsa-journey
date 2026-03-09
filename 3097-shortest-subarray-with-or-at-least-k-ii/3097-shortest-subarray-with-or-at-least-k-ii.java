class Solution {
    public int minimumSubarrayLength(int[] nums, int k) {
        int n=nums.length;
        int l=0;
        int res=Integer.MAX_VALUE;
        int[] bits=new int[32];

        for(int r=0;r<n;r++){
            for(int b=0;b<32;b++){
                if((nums[r]&(1<<b))!=0) bits[b]++;//check set bit
            }
            while(l<=r){
                int or=0;
                for(int b=0;b<32;b++){
                    if(bits[b]>0)   or|=(1<<b);
                }
                if(or<k)    break;
                res=Math.min(res,r-l+1);
                for(int b=0;b<32;b++){
                    if((nums[l]&(1<<b))!=0) bits[b]--;//check set bit
                }
                l++;
            }
        }
        return res==Integer.MAX_VALUE ? -1:res;
    }
}