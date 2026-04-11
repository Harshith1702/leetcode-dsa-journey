class Solution {
    public int countDigitOccurrences(int[] nums, int digit) {
        int res = 0;
        for(int x : nums) {
            int y = x;
            while(y > 0) {
                if (y % 10 == digit)   res++;
                y/=10;
            }
        }
        return res;
    }
}