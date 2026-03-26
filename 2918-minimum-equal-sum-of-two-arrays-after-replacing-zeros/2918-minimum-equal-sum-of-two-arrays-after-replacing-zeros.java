class Solution {
    public long minSum(int[] nums1, int[] nums2) {
        int zeroes1 = 0, zeroes2 = 0;
        long sum1 = 0, sum2 = 0;

        for (int x : nums1) {
            if(x == 0)  zeroes1++;
            sum1 += x; 
        }

        for (int x : nums2) {
            if(x == 0)  zeroes2++;
            sum2 += x; 
        }

        long min1 = sum1 + zeroes1;
        long min2 = sum2 + zeroes2;

        if((zeroes1 == 0 && sum1 < min2) || (zeroes2 == 0 && sum2 < min1))    return -1;

        return Math.max(min1, min2);
    }
}