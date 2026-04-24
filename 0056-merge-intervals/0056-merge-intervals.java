class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
        List<int[]> res = new ArrayList<>();
        for(int[] i : intervals) { // i -> current
            if (res.isEmpty()) {
                res.add(i);
            }
            else {
                int[] last = res.get(res.size() - 1);
                if (i[0] <= last[1]) {
                    last[1] = Math.max(i[1], last[1]);
                }
                else  {
                    res.add(i);
                }
            }
        }
        return res.toArray(new int[res.size()][]);
    }
}