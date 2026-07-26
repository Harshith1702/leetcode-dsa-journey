class Solution {
    public int largestInteger(int n, int s) {
        if (s > 9 * n)   return -1;
        long res = 0;
        while (n-- > 0) {
            res = res * 10 + Math.min(s, 9);
            s -= Math.min(s, 9);
        }
        return (int)(res);
    }
}