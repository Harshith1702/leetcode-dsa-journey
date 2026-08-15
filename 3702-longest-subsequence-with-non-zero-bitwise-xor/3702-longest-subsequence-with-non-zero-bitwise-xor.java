class Solution {
    public int longestSubsequence(int[] nums) {
        int cnt = 0;
        boolean f = true;
        for (int x : nums) {
            cnt ^= x;
            if (x != 0)
                f = false;
        }
        if (f)      return 0;
        if (cnt != 0)       return nums.length;
        return nums.length - 1;
    }
}