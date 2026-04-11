class Solution {
    public int minimumDistance(int[] nums) {
        int res = Integer.MAX_VALUE;
        int n = nums.length;
        int[] a = new int[100001];
        int[] b = new int[100001];
        for (int i = 0;i <= 100000;i++){
            a[i] = -1;
            b[i] = -1;
        }
        for (int i = 0;i < n;i++){
            int h = nums[i];
            if (b[h] != -1){
                int d = Math.abs(a[h] - b[h]) + Math.abs(i - a[h]) + Math.abs(i - b[h]);
                if(d < res)   res = d;
            }
            b[h] = a[h];
            a[h] = i;
        }
        if(res == Integer.MAX_VALUE)   return -1;
        return res;
    }
}