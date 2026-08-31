class Solution {
    static long m = 1000000007L;
    public int sumDecoded(long[] nums) {
        long res = 0;
        int len = nums.length;
        for (int i = 0;i < len; i++) {
            int w = (int)(nums[i] % 10);
            long d = nums[i] / 10;
            String s = String.valueOf(d);
            int n = s.length();
            long dd1 = Long.parseLong(s.substring(0, w));
            long dd2 = Long.parseLong(s.substring(w));
            res = (res + pow(dd1, dd2)) % m;
        }
        return (int)res;
    }
    public long pow(long x, long y) {
        long ans = 1;
        while (y > 0) {
            if (y % 2 == 1) {
                ans = (ans * x) % m;
            }
            x = (x * x) % m;
            y /= 2;
        }
        return ans;
    }
}