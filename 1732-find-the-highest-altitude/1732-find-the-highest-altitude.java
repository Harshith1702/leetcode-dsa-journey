class Solution {
    public int largestAltitude(int[] gain) {
        int max = 0, c = 0;
        for (int i = 0;i < gain.length; i++) {
            c += gain[i];
            if (c > max)   max = c;
        }
        return max;
    }
}