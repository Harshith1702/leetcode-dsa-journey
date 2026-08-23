class Solution {
    public boolean isPalindromic(String s) {
        String a = "";
        for (int i = 0;i < s.length(); i++) {
            int n = s.charAt(i);
            for (int j = 7;j >= 0; j--)
                a += ((n >> j) & 1);
        }
        for (int i = 0, j = a.length() - 1;i < j;i++, j--)
            if (a.charAt(i) != a.charAt(j))
                return false;
        return true;
    }
}