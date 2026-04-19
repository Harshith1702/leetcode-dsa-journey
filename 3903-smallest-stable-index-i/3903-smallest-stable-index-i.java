class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int n = nums.length;
        int max = Integer.MIN_VALUE;
        int[] min = new int[n];
        min[n - 1] = nums[n - 1];
        for(int i = n - 2;i >= 0; i--) {
            min[i] = Math.min(nums[i], min[i + 1]);
        }
        for(int i = 0;i < n; i++) {
            max = Math.max(nums[i], max);
            long sc = (long)max - min[i];
            if(sc <= (long)k) return i;
        }
        return -1;
    }
}