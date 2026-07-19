class Solution {
    public int minAdjacentSwaps(int[] nums, int a, int b) {
        long l = 0, m = 0;
        long res = 0;
        for (int i : nums) {
            if (i > b)   l++;
            else if (i >= a) {
                m++;
                res += l;
            }
            else   res += (l + m);
        }
        return (int)(res % 1000000007);
    }
}