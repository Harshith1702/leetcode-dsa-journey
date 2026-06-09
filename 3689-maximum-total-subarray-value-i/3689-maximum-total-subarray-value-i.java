class Solution {
    public long maxTotalValue(int[] nums, int k) {
        int n = nums.length;
        int min = nums[0], max = nums[0];
        for (int i = 0;i < n; i++) {
            min = Math.min(nums[i], min);
            max = Math.max(nums[i], max);
        }
        long res = max - min;
        return res * k;
    }
}