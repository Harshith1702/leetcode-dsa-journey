class Solution {
    public int maxDigitRange(int[] nums) {
        int mr = 0, sum = 0;
        for (int x : nums) {
            int i = x, min = 9, max  = 0;
            if (i == 0)     min = max = 0;
            while (i > 0) {
                int y = i % 10;
                min = Math.min(y, min);
                max = Math.max(y, max);
                i /= 10;
            }
            int r = max - min;
            if (r > mr) {
                mr = r;
                sum = x;
            }
            else if (r == mr) {
                sum += x;
            }
        }
        return sum;
    }
}