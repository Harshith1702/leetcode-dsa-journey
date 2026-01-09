class Solution {
    public int[] transformArray(int[] nums) {
        int i=0;
        for(int x: nums)
            if(x%2==0)  nums[i++]=0;
        while(i<nums.length)
            nums[i++]=1;
        return nums;
    }
}