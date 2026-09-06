class Solution {
    public int countRotations(String s, int k) {
        int n = s.length();
        if (n <= 1) {
            if (k == 0)   return 1;
            if (k == 1)   return 0;
        }
        String s1 = s + s;
        int[] a = new int[2 * n - 1];
        for (int i = 0;i < s1.length() - 1; i++)
            if (s1.charAt(i) == s1.charAt(i + 1))   a[i] = 1;
        int size = n - 1, curr = 0, cnt = 0;
        for (int i = 0;i < size; i++)
            curr += a[i];
        if (curr == k)   cnt++;
        for (int i = 1;i < n; i++) {
            curr -= a[i - 1];
            curr += a[i + size - 1];
            if (curr == k)   cnt++;
        }
        return cnt;
    }
}