class Solution {
    public int countValidSubarrays(int[] nums, int x) {
        int n = nums.length;
        int res = 0;
        for (int i = 0;i < n; i++) {
            long sum = 0;
            for (int j = i;j < n; j++) {
                sum += nums[j];
                if (sum % 10 != x)    continue;
                long tmp = sum;
                while (tmp >= 10) {
                    tmp /= 10;
                }
                if (tmp == x)    res++;
            }
        }
        return res;
    }
}