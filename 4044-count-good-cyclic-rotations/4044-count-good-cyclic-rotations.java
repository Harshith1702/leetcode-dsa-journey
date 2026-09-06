class Solution {
    public int countGoodRotations(int[] nums) {
        int n = nums.length;
        int m = n / 2;
        int[] a = new int[2 * n];
        for (int i = 0;i < n; i++){
            a[i] = nums[i];
            a[i + n] = nums[i];
        }
        long s1 = 0, s2 = 0;
        for (int i = 0;i < m; i++)
            s1 += a[i];
        for (int i = m;i < n; i++)
            s2 += a[i];
        int res_cnt = 0;
        if (s1 > s2)   res_cnt++;
        for (int i = 1;i < n; i++) {
            s1 -= (a[i - 1] - a[i + m - 1]);
            s2 -= (a[i + m - 1] - a[i + n - 1]);
            if (s1 > s2)   res_cnt++;
        }
        return res_cnt;
    }
}