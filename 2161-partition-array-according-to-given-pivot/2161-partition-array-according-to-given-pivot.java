class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        //  N, N
        List<Integer> l = new ArrayList<>();
        List<Integer> m = new ArrayList<>();
        List<Integer> r = new ArrayList<>();
        for (int i = 0;i < nums.length; i++) {
            if (nums[i] < pivot)    l.add(nums[i]);
            else if (nums[i] == pivot)    m.add(nums[i]);
            else    r.add(nums[i]);
        }
        int[] res = new int[nums.length];
        int j = 0;
        for (int x : l) {
            res[j++] = x;
        }
        for (int x : m) {
            res[j++] = x;
        }
        for (int x : r) {
            res[j++] = x;
        }
        return res;
    }
}