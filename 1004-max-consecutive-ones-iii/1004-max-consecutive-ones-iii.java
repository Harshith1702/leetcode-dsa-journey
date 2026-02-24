class Solution {
    public int longestOnes(int[] nums, int k) {
        int left=0,maxl=0,res=0;
        for(int right=0;right<nums.length;right++){
            if(nums[right]==0)  maxl++;
            while(maxl>k){
                if(nums[left]==0)   maxl--;
                left++;
            }
            if(right-left+1 > res)  res=right-left+1;
        }
        return res;
    }
}