class Solution {
    public long sumAndMultiply(int n) {
        long sum = 0, x = 0;
        int[] a = new int[20];
        int k = 0,temp = n;
        if  (n == 0)   return 0;
        while   (temp > 0) {
            a[k++] = temp % 10;
            temp /= 10;
        }

        for(int i = k - 1;i >= 0; i--) {
            int d = a[i];
            if (d != 0)   x = x * 10 + d;
        }

        if (x == 0)  return 0;

        long t = x;
        while (t > 0) {
            sum += t % 10;
            t /= 10;
        }
        return x * sum;
    }
}