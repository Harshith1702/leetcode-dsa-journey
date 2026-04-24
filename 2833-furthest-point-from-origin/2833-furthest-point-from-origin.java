class Solution {
    public int furthestDistanceFromOrigin(String moves) {
        int l = 0,r = 0;
        int bar = 0;
        for (char c : moves.toCharArray()) {
            if (c == 'L')   l++;
            else if (c == 'R')  r++;
            else bar++;
        }
        if (l > r)  l += bar;
        else  r += bar;
        return Math.abs(r-l);
    }
}