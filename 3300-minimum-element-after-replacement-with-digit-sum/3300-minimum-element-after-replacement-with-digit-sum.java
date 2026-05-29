class Solution {
    public int minElement(int[] nums) {
        int n = nums.length;
        int min = Integer.MAX_VALUE;
        for (int i = 0;i < n; i++) {
            nums[i] = sum(nums[i]);
            min = Math.min(min, nums[i]);
        }
        return min;
    }
    public int sum(int y) {
        int sum = 0;
        while (y > 0) {
            sum += y % 10;
            y /= 10;
        }
        return sum;
    }
}