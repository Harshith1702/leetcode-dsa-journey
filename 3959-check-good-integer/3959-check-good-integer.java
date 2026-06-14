class Solution {
    public boolean checkGoodInteger(int n) {
        int x = n;
        int dsum = 0, ssum = 0;
        while (x > 0) {
            int t = x % 10;
            x /= 10;
            dsum += t;
            ssum += (t * t);
        }
        return ssum - dsum >= 50;
    }
}