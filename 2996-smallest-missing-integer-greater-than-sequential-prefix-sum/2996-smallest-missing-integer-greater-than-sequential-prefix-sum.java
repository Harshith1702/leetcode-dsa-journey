class Solution {
    public int missingInteger(int[] nums) {
        int res = nums[0];
        for (int i = 1;i < nums.length && nums[i] == nums[i - 1] + 1; i++) {
            res += nums[i];
        }
        for (int i = 0;i < nums.length; i++) {
            if (nums[i] == res) {
                i = -1;
                res++;
            }
        }
        return res;
    }
}