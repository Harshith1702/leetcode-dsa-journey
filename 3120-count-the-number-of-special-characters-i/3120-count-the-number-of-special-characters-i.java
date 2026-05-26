class Solution {
    public int numberOfSpecialChars(String word) {
        int[] a = new int[26];
        int[] b = new int[26];
        for (int i = 0;i < word.length(); i++) {
            char ch = word.charAt(i);
            if (ch >= 'a' && ch <= 'z')     a[ch - 'a'] = 1;
            else if (ch >= 'A' && ch <= 'Z')    b[ch - 'A'] = 1;
        }
        int c = 0;
        for (int i = 0;i < 26; i++) {
            if (a[i] == 1 && b[i] == 1) {
                c++;
            }
        }
        return c;
    }
}