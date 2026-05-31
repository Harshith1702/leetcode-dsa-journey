class Solution {
    public boolean asteroidsDestroyed(int mass, int[] asteroids) {
        int n = asteroids.length;
        Arrays.sort(asteroids);
        long curr = mass;
        for (int i = 0;i < n; i++) {
            if (asteroids[i] > curr)   
                return false;
            curr += asteroids[i];
        }
        return true;
    }
}