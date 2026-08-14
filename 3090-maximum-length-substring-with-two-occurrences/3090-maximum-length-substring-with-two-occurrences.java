class Solution {
    public int maximumLengthSubstring(String s) {
        int[] cnt = new int[26];
        int l = 0, mLen = 0;
        int n = s.length();
        for (int r = 0;r < n; r++) {
            cnt[s.charAt(r) - 'a']++;
            while (cnt[s.charAt(r) - 'a'] > 2) {
                cnt[s.charAt(l) - 'a']--;
                l++;
            }
            mLen = Math.max(mLen,r - l + 1);
        }
        return mLen;
    }
}