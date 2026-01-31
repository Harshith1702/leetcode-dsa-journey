class Solution {
    public int countElements(int[] nums) {
        int min=nums[0],max=nums[0],c=0;
        for(int n:nums){
            if(n<min) min=n;
            if(n>max) max=n;
        }
        for(int n : nums)
            if(n>min && n<max) c++;
        return c;
    }
}
