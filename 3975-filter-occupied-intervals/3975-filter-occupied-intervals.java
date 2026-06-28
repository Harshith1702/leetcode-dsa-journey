class Solution {
    public List<List<Integer>> filterOccupiedIntervals(int[][] occupiedIntervals, int freeStart, int freeEnd) {
        Arrays.sort(occupiedIntervals,(a,b) -> a[0] - b[0]);
        List<int[]> m = new ArrayList<>();
        int[] curr = occupiedIntervals[0];
        for (int i = 1;i < occupiedIntervals.length; i++) {
            if (occupiedIntervals[i][0] <= curr[1] + 1) {
                curr[1] = Math.max(curr[1],occupiedIntervals[i][1]);
            }
            else {
                m.add(curr);
                curr = occupiedIntervals[i];
            }
        }
        m.add(curr);
        List<List<Integer>> res = new ArrayList<>();
        for (int[] i : m) {
            if (i[0] > freeEnd || i[1] < freeStart) {
                res.add(Arrays.asList(i[0],i[1]));
                continue;
            }
            if (i[0] < freeStart) {
                res.add(Arrays.asList(i[0], freeStart - 1));
            }
            if (i[1] > freeEnd) {
                res.add(Arrays.asList(freeEnd + 1, i[1]));
            }
        }
        return res;
    }
}