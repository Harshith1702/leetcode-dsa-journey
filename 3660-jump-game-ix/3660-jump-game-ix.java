class Solution {
    public int[] maxValue(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];
        int[] max = new int[n];
        max[0] = nums[0];
        for (int i = 1;i < n; i++) {
            max[i] = Math.max(max[i - 1], nums[i]);
        }
        res[n - 1] = max[n - 1];
        int suff = max[n - 1];
        for (int i = n - 1;i >= 0; i--) {
            if (max[i] > suff) {
                res[i] = res[i + 1];
            }
            else    res[i] = max[i];

            suff = Math.min(suff, nums[i]);
        }
        return res;
    }
}