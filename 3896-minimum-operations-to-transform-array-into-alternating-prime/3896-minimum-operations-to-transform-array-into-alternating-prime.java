class Solution {
    public int minOperations(int[] nums) {
        int max = 100010;
        int res = 0;
        boolean[] isPrime = new boolean[max];
        for (int i = 2;i < max;i++)   isPrime[i] = true;
        for (int i = 2;i * i < max; i++) {
            if (isPrime[i]) {
                for(int j = i * i;j < max; j += i) {
                    isPrime[j] = false;
                }
            }
        }
        for(int i = 0;i < nums.length;i ++) {
            int x = nums[i];
            if(i % 2 == 0) {
                while (!isPrime[x]) {
                    x++;
                    res++;
                }
            }
            else if (isPrime[x]) {
                if(x == 2)  res += 2;
                else  res++;
            }
        }
        return res;
    }
}