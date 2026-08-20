class Solution {
    public int[] resultArray(int[] nums) {
        int n = nums.length;
        int[] a = new int[n];
        int[] b = new int[n];
        int[] res = new int[n];
        int x = 1,y = 1,z = 0;
        a[0] = nums[0];
        b[0] = nums[1];
        for (int i = 2;i < n; i++) {
            if (a[x - 1] > b[y - 1])
                a[x++] = nums[i];
            else
                b[y++] = nums[i];
        }
        for (int i = 0;i < x; i++) 
            res[z++] = a[i];
        for (int i = 0;i < y; i++)
            res[z++] = b[i];
        return res;
    }
}