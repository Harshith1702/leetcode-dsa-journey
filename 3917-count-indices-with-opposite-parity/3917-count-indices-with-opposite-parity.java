class Solution {
    public int[] countOppositeParity(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];
        int ec = 0,oc = 0; //oddCount, evenCount
        for (int i = n - 1;i >= 0; i--) {
            if (nums[i] % 2 == 0) {
                res[i] = oc;
                ec++;
            }
            else{
                res[i] = ec;
                oc++;
            }
        }
        return res;
    }
}