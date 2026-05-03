class Solution {
    public int sumOfPrimesInRange(int n) {
        int r = 0,tmp = n;
        while (tmp > 0) {
            r = r * 10 + tmp % 10;
            tmp /= 10;
        }
        int l = Math.min(r, n);
        int h = Math.max(r, n);
        int sum = 0;
        for(int i = l;i <= h; i++) {
            if (isPrime(i))    sum += i;
        }
        return sum;
    }
    public boolean isPrime(int n) {
        if (n < 2)   return false;
        for (int i = 2;i * i <=n; i++) {
            if (n % i == 0)    return false;
        }
        return true;
    }
}