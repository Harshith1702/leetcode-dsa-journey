class Solution {
    public int minOperations(int[] nums, int x) {
        int total = 0;
        for (int i : nums)      total += i;
        int aim = total - x;
        if (aim == 0)   return nums.length;;
        if (aim < 0)    return -1;
        int l = 0, sum = 0, maxL = -1;
        for (int r = 0;r < nums.length; r++) {
            sum += nums[r];
            while (sum > aim) {
                sum -= nums[l];
                l++;
            }
            if (sum == aim)     maxL = Math.max(maxL, r - l + 1);
        }
        if (maxL == -1)     return -1;
        return nums.length - maxL;
    }
}