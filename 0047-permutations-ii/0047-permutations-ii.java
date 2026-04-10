class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        res.add(new ArrayList<>());
        for (int x : nums) {
            List<List<Integer>> res2 = new ArrayList<>();
            for (List<Integer> i : res) {
                for (int j = 0;j <= i.size();j++) {
                    if (j > 0 && i.get(j - 1) == x)     break;
                    List<Integer> tmp = new ArrayList<>(i);
                    tmp.add(j, x);
                    res2.add(tmp);
                }
            }
            res = res2;
        }
        return res;
    }
}