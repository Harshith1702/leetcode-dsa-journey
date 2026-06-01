class Solution {
    public int minimumCost(int[] cost) {
        Arrays.sort(cost);
        int n = cost.length;
        int j = 0;
        int sum = 0;
        for (int i = n - 1;i >= 0; i--) {
            if (j == 0 || j == 1) {
                sum += cost[i];
                j++;
            }
            else {
                j = 0;
            }
        }
        return sum;
    }
}