class Solution {
    public int[] transformArray(int[] nums) {
        int i=0;
        while(i<nums.length){
            if(nums[i]%2==0)    nums[i]=0;
            else    nums[i]=1;
            i++;
        }
        Arrays.sort(nums);
        return nums;
    }
}