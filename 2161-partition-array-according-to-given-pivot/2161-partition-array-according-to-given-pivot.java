class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int[] res = new int[nums.length];
        int j = 0;
        for (int x : nums) {
            if (x < pivot)      res[j++] = x;
        }
        for (int x : nums) {
            if (x == pivot)      res[j++] = x;
        }
        for (int x : nums) {
            if (x > pivot)      res[j++] = x;
        }
        return res;
    }
}