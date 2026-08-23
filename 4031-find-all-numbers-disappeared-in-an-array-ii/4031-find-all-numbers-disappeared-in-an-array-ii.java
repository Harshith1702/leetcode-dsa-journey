class Solution {
    public List<List<Integer>> findDisappearedNumbers(int[] nums, int lower, int upper) {
        int n = nums.length;
        Arrays.sort(nums);
        int[][] res = new int[n + 1][2];
        long a = (long)lower;
        int c = 0;//count
        for (int  x : nums) {
            if (x > upper)   break;
            if (x < lower)   continue;
            if (x > a) {
                res[c][0] = (int)a;
                res [c][1] = x - 1;
                c++;
            }
            a = (long)x + 1;
        }
        if (a <= upper) {
            res[c][0] = (int)a;
            res [c][1] = upper;
            c++;
        }
        List<List<Integer>> ans = new ArrayList<>();
        for (int i = 0;i < c; i++) {
            List<Integer> tmp = new ArrayList<>();
            tmp.add(res[i][0]);
            tmp.add(res[i][1]);
            ans.add(tmp);
        }
        return ans;
    }
}