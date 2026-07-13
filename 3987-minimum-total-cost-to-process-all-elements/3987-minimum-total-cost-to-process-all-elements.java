class Solution {
    public int minimumCost(int[] nums, int k) {
        long res = 0;
        long c = 0, m = 1000000007L;
        res += k;
        for (int x : nums) {
            if (res < x) {
                long i = (x + k - res - 1) / k;
                res += i * k;
                c += i;
            }
            res -= x;
        }
        long v = 500000004L;
        long r = (c % m) * ((c + 1) % m) % m;
        r = r * v % m;
        return (int)(r);
    }
}