class Solution {
    public int minOperations(int[][] grid, int x) {
        int n = grid.length, m = grid[0].length;
        int[] a = new int[n * m];
        int idx = 0;
        for(int[] row : grid){
            for(int num : row){
                a[idx++] = num;
            }
        }
        int rem = a[0] % x;
        for(int i : a){
            if (i % x != rem)
                return -1;
        }
        Arrays.sort(a);
        int avg = a[(n * m) / 2];
        int c = 0;
        for (int i : a){
            c += Math.abs(i - avg) / x;
        }
        return c;
    }
}