class Solution {
    public int maxProduct(int n) {
        int l1 = 0,l2 = 0;
        while (n > 0) {
            int d = n % 10;
            n /= 10;
            if (d > l1) {
                l2 = l1;
                l1 = d;
            }
            else if (d > l2) {
                l2 = d;
            }
        }
        return l1 * l2;
    }
}