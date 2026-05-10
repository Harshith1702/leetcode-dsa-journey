class Solution {
    public long minArraySum(int[] nums) {
        boolean[] exists = new boolean[100001];
       for (int x :nums) {
           exists[x] = true;
       }
        long res = 0;
        for (int x : nums) {
            int best = x;
            for (int i = 1;i * i <= x; i++) {
                if (x % i == 0) {
                    if (exists[i]){
                        best = Math.min(best, i);
                    }
                    int other = x / i;
                    if (exists[other]) {
                        best = Math.min(best, other);
                    }
                }
            }
            res += best;
        }
        return res;
    }
}