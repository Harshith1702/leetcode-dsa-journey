class Solution {
    public int climbStairs(int n, int[] costs) {
        int dp0 = 0;
        int dp1 = Integer.MAX_VALUE;
        int dp2 = Integer.MAX_VALUE;
        for (int i = 1; i <= n; i++) {
            int curr = Integer.MAX_VALUE;

            curr = Math.min(curr, dp0 + costs[i-1] + 1);
            if(i >= 2)  
                curr = Math.min(curr, dp1 + costs[i-1] + 4);
            if(i >= 3)  
                curr = Math.min(curr, dp2 + costs[i-1] + 9);

            dp2 = dp1;
            dp1 = dp0;
            dp0 = curr;
        }
        return dp0;
    }
}