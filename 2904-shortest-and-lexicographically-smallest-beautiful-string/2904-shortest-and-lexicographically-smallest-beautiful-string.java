class Solution {
    public String shortestBeautifulSubstring(String s, int k) {
        String res = "";
        int minL = Integer.MAX_VALUE;
        int n = s.length();
        int cO = 0, l = 0;//l - left
        for (int i = 0;i < n; i++) { //i - rght
            if (s.charAt(i) == '1')     cO++;
            while (cO == k) {
                String ss = s.substring(l, i + 1);
                int len = ss.length();
                if (len < minL) {
                    minL = len;
                    res = ss;
                }
                else if (len == minL && (res.equals("") || ss.compareTo(res) < 0)) {
                    res = ss;
                }
                if (s.charAt(l) == '1')   cO--;
                l++;
            }
        }
        return res;
    }
}