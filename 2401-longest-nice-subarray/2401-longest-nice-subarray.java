class Solution {
    public int longestNiceSubarray(int[] nums) {
        int res=0;
        int l=0,mask=0;
        for(int r=0;r<nums.length;r++){
            while((mask & nums[r])!=0){
                mask^=nums[l];
                l++;
            }
            mask|=nums[r];
            res=Math.max(res,r-l+1);
        }
        return res;
    }
}