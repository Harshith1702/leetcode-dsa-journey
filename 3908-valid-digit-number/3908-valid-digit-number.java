class Solution {
    public boolean validDigit(int n, int x) {
        int i = n;
        int f = 0;
        int last = 0;
        while (i > 0) {
            if (i % 10 == x)  f = 1;
            last = i; 
            i /= 10;
        }
        if (last != x  &&  f == 1)    return true;
        return false;
    }
}