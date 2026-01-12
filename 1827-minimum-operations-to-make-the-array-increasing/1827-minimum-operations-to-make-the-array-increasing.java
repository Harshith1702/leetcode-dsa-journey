class Solution {
    public int minOperations(int[] nums) {
        int c=0;
        for(int i=1;i<nums.length;i++){
            if(nums[i]<=nums[i-1]){
                int need=nums[i-1]+1;
                c+=(need-nums[i]);
                nums[i]=need;
            }
        }
        return c;
    }
}