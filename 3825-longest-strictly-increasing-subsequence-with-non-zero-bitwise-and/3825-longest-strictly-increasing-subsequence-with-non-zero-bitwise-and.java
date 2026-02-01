class Solution {
    public int longestSubsequence(int[] nums) {
        int res=0;
        for(int i=0;i<31;i++){
            int[] a=new int[nums.length];
            int s=0;
            for(int x:nums){
                if((x&(1<<i))==0)  continue;
                int l=0,r=s;
                while(l<r){
                    int m=(l+r)/2;
                    if(a[m]<x)  l=m+1;
                    else r=m;
                }
                a[l]=x;
                if(l==s) s++;
            }res=Math.max(res,s);
        }return res;
    }
}