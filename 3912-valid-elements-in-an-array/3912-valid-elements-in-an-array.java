class Solution {
    public List<Integer> findValidElements(int[] nums) {
        int n = nums.length;
        List<Integer> ls = new ArrayList<>();
        if(n == 1){
            ls.add(nums[0]);
            return ls;
        }
        int l = nums[0];
        int[] r = new int[n];
        r[n - 1] = nums[n - 1];
        for (int i = n - 2;i >= 0; i--) {
            r[i] = Math.max(r[i + 1], nums[i]);
        }
        for (int i = 0;i < n; i++) {
            if (i == 0 || i == n - 1) {
                ls.add(nums[i]);
            }
            else if (nums[i] > l || nums[i] > r[i + 1])
                ls.add(nums[i]);
            l = Math.max(l, nums[i]);
        }
        return ls;
    }
}