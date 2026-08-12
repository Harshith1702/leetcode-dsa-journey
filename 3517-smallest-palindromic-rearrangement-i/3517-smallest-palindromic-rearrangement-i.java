class Solution {
    public String smallestPalindrome(String s) {
        char[] a = s.toCharArray();
        int n = s.length();
        Arrays.sort(a, 0, n / 2);
        for (int i = 0;i < n / 2; i++) {
            a[n - i - 1] = a[i];
        }
        return new String(a);
    }
}