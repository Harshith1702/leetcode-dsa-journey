class Solution {
    public boolean consecutiveSetBits(int n) {
        int c = 0;
        while (n > 1) {
            if ((n & 3) == 3) {
                c++;
                if (c > 1)   return false;
            }
            n >>= 1;
        }
        return c == 1;
    }
}