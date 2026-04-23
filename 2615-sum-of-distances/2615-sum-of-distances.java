class Solution {
    public long[] distance(int[] nums) {
        int n = nums.length;
        long[] arr = new long[n];
        Map<Integer, List<Integer>> map = new HashMap<>();

        for (int i = 0;i < n; i++) {
            map.putIfAbsent(nums[i],new ArrayList<>());
            map.get(nums[i]).add(i);
        }
        for (List<Integer> l : map.values()) {
            int m = l.size();
            long[] ps = new long[m + 1];
            for (int i = 0;i < m; i++) {
                ps[i + 1] = ps[i] + l.get(i);
            }
            for (int i = 0;i < m; i++) {
                int idx = l.get(i);
                long left = (long) idx * i - ps[i];
                long right = (ps[m] - ps[i + 1]) -  (long)(m - i - 1) * idx;

                arr[idx] = left + right;
            }
        }
        return arr;
    }
}