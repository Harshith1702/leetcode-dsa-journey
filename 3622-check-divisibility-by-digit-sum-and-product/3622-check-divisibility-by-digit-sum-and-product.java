class Solution {
    public boolean checkDivisibility(int n) {
        int x = n;
        int sum = 0, prod = 1;
        while (n > 0) {
            int t = n % 10;
            n /= 10;
            sum += t;
            prod *= t;
        }
        if (x % (sum + prod) == 0)      return true;
        return false;
    }
}