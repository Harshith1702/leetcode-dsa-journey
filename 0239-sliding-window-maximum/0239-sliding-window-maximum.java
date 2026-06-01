class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        int[] l = new int[n];
        int[] r = new int[n];
        int[] res = new int[n - k + 1];
        for (int i = 0;i < n; i++) {
            if (i % k == 0)
                l[i] = nums[i];
            else
                l[i] = Math.max(l[i - 1], nums[i]);
        }
        for (int i = n - 1;i >= 0; i--) {
            if (i == n - 1 || (i + 1) % k == 0)
                r[i] = nums[i];
            else
                r[i] = Math.max(r[i + 1], nums[i]);
        }        
        for (int i = 0;i <= n - k; i++) {
            res[i] = Math.max(l[i + k - 1], r[i]);
        }
        return res;
    }
}