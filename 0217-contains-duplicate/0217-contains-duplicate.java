class Solution {
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        int found=0;
        for(int i=1;i<nums.length;i++) {
            if(nums[i]==nums[i-1]){
                found=1;
                break;
            }
        }
        if(found == 1) return true;
        else    return false;
    }
}