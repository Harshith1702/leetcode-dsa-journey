class Solution {
    public String shortestBeautifulSubstring(String s, int k) {
        String res = "";
        int minL = Integer.MAX_VALUE;
        int n = s.length();
        for (int i = 0;i < n; i++) {
            for (int j = i + 1;j <= n; j++) {
                String ss = s.substring(i,j);
                int cnt = 0;
                for (int c = 0;c < ss.length(); c++) {
                    if (ss.charAt(c) == '1')    cnt++;
                }
                if (cnt == k) {
                    int l = ss.length();
                    if (l < minL) {
                        minL = l;
                        res = ss;
                    }
                    else if (l == minL && (res.equals("") || ss.compareTo(res) < 0)) {
                        res = ss;
                    }
                }
            }
        }
        return res;
    }
}