class Solution {
    public int maxDistance(int[] colors) {
        int n = colors.length;
        int color = colors[0];
        int idx = 0;
        int res = 0;
        for (int i = n - 1;i >= 0; i--) {
            if (colors[i] != color) {
                res = i;
                break;
            }
        }

        for (int i = 0;i < n; i++) {
            if (colors[i] != colors[n-1]) {
                res = Math.max(res, n - i -1);
                break;
            }
        }
        return res;
    }
}