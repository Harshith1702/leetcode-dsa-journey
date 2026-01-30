class Solution {
    public int maxArea(int[] h) {
        int l = 0, r = h.length - 1;
        int ans = 0;

        while (l < r) {
            ans = Math.max(ans, (r - l) * Math.min(h[l], h[r]));
            if (h[l] < h[r]) l++;
            else r--;
        }

        return ans;
    }
}