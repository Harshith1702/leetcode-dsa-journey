class Solution {
    public int removeDuplicates(int[] nums) {
        int idx = 0; // index
        int n = nums.length;
        for (int i = 0;i < n; i++) {
            if (idx < 2 || nums[idx - 2] != nums[i]) {
                nums[idx++] = nums[i];
            }
        }
        return idx;
    }
}