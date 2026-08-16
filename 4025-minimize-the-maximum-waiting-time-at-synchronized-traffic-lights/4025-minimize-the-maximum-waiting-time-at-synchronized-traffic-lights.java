class Solution {
    public int minPenalty(int period, int[] lights, int[] arrivalTime) {
        int m = 0;
        int res = 0;
        for (int x : lights)
                m = Math.max(x, m);
        for (int y : arrivalTime) {
            int r = y % period;
            if (r >= m) {
                res = Math.max(res, period - r);
            }
        }
        return res;
    }
}