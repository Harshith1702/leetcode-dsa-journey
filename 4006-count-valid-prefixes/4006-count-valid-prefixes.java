class Solution {
    public int countValidPrefixes(String s) {
        int res = 0;
        int c1 = 0, c2 = 0;
        for (char x : s.toCharArray()) {
            if (x == '0')   c1++;
            else   c2++;
            if (Math.abs(c1 - c2) < 2)     res++;
        }
        return res;
    }
}