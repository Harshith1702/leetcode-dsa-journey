class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        int n = nums.length;
        int l = 0;//l->left
        int res = 0;
        Map<Integer, Integer> freq = new HashMap<>();
        for (int r = 0;r < n; r++) {//r->right
            freq.put(nums[r],freq.getOrDefault(nums[r], 0) + 1);
            while (freq.get(nums[r]) > k) {
                freq.put(nums[l],freq.getOrDefault(nums[l], 0) - 1);
                l++;
            }
            res = Math.max(res, r - l + 1);
        }
        return res;
    }
}