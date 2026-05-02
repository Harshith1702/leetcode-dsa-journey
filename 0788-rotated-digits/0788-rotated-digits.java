class Solution {
    public int rotatedDigits(int n) {
        int c = 0;
        for (int i = 1;i <= n; i++) {
            int x = i;
            int f = 0; //flag
            while (x > 0) {
                int d = x % 10;
                if (d == 3 || d == 4 || d == 7) {
                    f = 0;
                    break;
                }
                if (d == 2 || d == 5 || d == 6 || d == 9) {
                    f = 1;
                }
                x /= 10;
            }
            if (f == 1)     c++;
        }
        return c;
    }
}