class Solution {
    public int countKthRoots(int l, int r, int k) {
        if (k == 1)    return r - l +1;
        int c = 0; //count
        for (long x = 0; ; x++) {
            long ele = 1;
            for (int i = 0;i < k; i++) {
                if (x != 0 && ele > r / x ) {
                    ele = r + 1;
                    break;
                }
                ele *= x;
            }
            if (ele > r)     break;
            if (ele >= l)    c++;
        }
        return c;
    }
}