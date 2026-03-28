class Solution {
    public int countVisiblePeople(int n, int pos, int k) {
        if(k > n-1)   return 0;
        long res = 1;
        long mod = 1000000007L;
        //C(n-1, k);
        for (int i = 1; i <= k; i++) {
            res = (res * (n-i)) % mod;
            res = res * poww(i, mod-2, mod) % mod;
        }
        return (int)(res * 2 % mod);
    }
    public long poww(long a,long b,long mod) {
        long res = 1;
        while(b > 0) {
            if((b & 1) == 1) res = res * a % mod;
            a = a * a % mod;
            b >>= 1;
        }
        return res;
    }
}