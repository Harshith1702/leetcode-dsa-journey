class Solution {
    public int uniqueXorTriplets(int[] nums) {
        int n = nums.length;
        Set<Integer> hs1 = new HashSet<>();
        Set<Integer> hs2 = new HashSet<>();
        for (int i = 0;i < n; i++) {
            for (int j = i;j < n; j++) {
                    hs1.add(nums[i] ^ nums[j]);
            }
        }
        for (int i : hs1) {
            for (int x : nums) {
                hs2.add(i ^ x);
            }
        }
        return hs2.size();
    }
}