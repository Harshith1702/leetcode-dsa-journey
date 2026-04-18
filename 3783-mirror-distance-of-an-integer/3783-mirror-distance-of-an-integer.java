class Solution {
    public int mirrorDistance(int n) {
        int rev = 0;
        int tmp = n;
        while(tmp > 0){
            rev = rev * 10 + (tmp % 10);
            tmp /= 10;
        }
        return Math.abs(n - rev);
    }
}