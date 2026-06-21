class Solution {
    public int maxIceCream(int[] costs, int coins) {
        int n = costs.length;
        Arrays.sort(costs);
        int sum = 0,c = 0;
        for (int i = 0;i < n; i++) {
            if (sum < coins && (sum + costs[i]) <= coins){   
                sum += costs[i];
                c++;
            }
            else  break;
        }
        return c;
    }
}