class Solution {
    public long maxSum(int[] nums, int k, int mul) {
        int n = nums.length;
        Arrays.sort(nums);
        long res = 0;
        int currmul = mul;
        for (int i = n - 1;i >= n - k; i--) {
            long val = nums[i];
            if (currmul > 1) {
                res += val * currmul;
            }
            else {
                res += val;
            }
            currmul--;
        }
        return res;
    }
}