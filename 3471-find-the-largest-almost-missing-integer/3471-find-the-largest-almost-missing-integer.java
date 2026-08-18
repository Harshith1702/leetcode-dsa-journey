class Solution {
    public int largestInteger(int[] nums, int k) {
        for (int x = 50;x >= 0; x--) {
            int cnt = 0;
            for (int i = 0;i <= nums.length - k; i++) {
                int f = 0;
                for (int j = i;j < i + k; j++) {
                    if (nums[j] == x)   f = 1;
                }
                if (f == 1)     cnt++;
            }
            if(cnt == 1)    return x;
        }
        return -1;
    }
}