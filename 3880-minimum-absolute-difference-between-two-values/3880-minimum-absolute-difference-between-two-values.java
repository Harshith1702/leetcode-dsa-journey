class Solution {
    public int minAbsoluteDifference(int[] nums) {
        int idx1=-1,idx2=-1;
        int res = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]==1){
                idx1 = i;
                if (idx2 != -1){
                    res = Math.min(res, idx1 - idx2);
                }
            }
            else if ( nums[i] == 2) {
                idx2 = i;
                if(idx1 != -1) {
                    res = Math.min(res, idx2 - idx1);
                }
            }
        }
        if (res == Integer.MAX_VALUE)   return -1;
        return res;
    }
}