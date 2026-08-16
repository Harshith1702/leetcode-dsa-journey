class Solution {
    public int nearestDrone(int[][] drones, int[] target) {
        int res = -1, max = 1000000007;
        for (int i = 0;i < drones.length; i++) {
            int d = Math.abs(drones[i][0] - target[0]) + Math.abs(drones[i][1] - target[1]);
            if (d <= drones[i][2] && d < max) {
                res = i;
                max = d;
            }
        }
        return res;
    }
}