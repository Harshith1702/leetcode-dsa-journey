class Solution {
    public int compareBitonicSums(int[] nums) {
        int n = nums.length;
        int peakidx = 0;
        for (int i = 1;i < n; i++) {
            if (nums[i] > nums[peakidx])   peakidx = i;
        }
        long sum1 = 0,sum2 = 0;
        for(int i = 0;i < n; i++) {
            if (i <= peakidx)   sum1 += nums[i];
            if(i >= peakidx)   sum2 += nums[i];
        }
        if (sum1 > sum2)    return 0;
        if (sum2 > sum1)    return 1;
        return -1;
    }
}