class Solution {
    public long minOperations(int[] nums) {
       long sum = 0;
        int n = nums.length;
        for (int i = 0;i < n - 1; i++) {
            if (nums[i] > nums[i + 1]){
                sum += (long)(nums[i] - nums[i + 1]);
            }
        }
        return sum;
    }
}