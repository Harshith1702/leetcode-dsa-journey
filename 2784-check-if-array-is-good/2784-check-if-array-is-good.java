class Solution {
    public boolean isGood(int[] nums) {
        int n = nums.length - 1;
        Map<Integer, Integer> freq = new HashMap<>();
        for (int x : nums) {
            freq.put(x, freq.getOrDefault(x,0) + 1);
        }
        if (freq.getOrDefault(n,0) != 2)    return false;
        for (int i = 1;i <= n - 1; i++) {
            if (freq.getOrDefault(i,0) != 1)    return false;
        }
        return true;
    }
}