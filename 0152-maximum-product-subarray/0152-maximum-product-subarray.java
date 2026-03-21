class Solution {
    public int maxProduct(int[] nums) {
        int pref=1,suff=1;
        int res=Integer.MIN_VALUE;
        int n=nums.length;
        for(int i=0;i<n;i++){
            if(pref==0) pref=nums[i];
            else    pref*=nums[i];

            if(suff==0) suff=nums[n-i-1];
            else    suff*=nums[n-i-1];

            res=Math.max(res,Math.max(pref,suff));
        }
        return res;
    }
}