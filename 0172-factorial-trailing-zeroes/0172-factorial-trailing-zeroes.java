class Solution {
    public int trailingZeroes(int n) {
        int k = n;
        int res = 0;
        while (k > 0) {
            res += k / 5;
            k /= 5;
        }
        return res;
    }
}