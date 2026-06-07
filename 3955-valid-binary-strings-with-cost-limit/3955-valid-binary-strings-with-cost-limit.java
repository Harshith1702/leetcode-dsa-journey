class Solution {
    public List<String> generateValidStrings(int n, int k) {
        List<String> res = new ArrayList<>();
        for (int i = 0;i < (1 << n); i++) {
            String s = "";
            int c = 0, f = 1;
            for (int j = 0;j < n; j++) {
                if ((i & (1 << j)) != 0) {
                    s += "1";
                    c += j;
                    if (j > 0 && (i & (1 << (j - 1))) != 0) {
                        f = 0;
                        break;
                    }
                }
                else {
                    s += "0";
                }
            }
            if (f == 1 & c <= k) {
                res.add(s);
            }
        }
        return res;
    }
}