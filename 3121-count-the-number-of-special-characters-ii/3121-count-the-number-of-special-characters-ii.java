class Solution {
    public int numberOfSpecialChars(String word) {
        int[] lower = new int[26];
        int[] upper = new int[26];
        Arrays.fill(lower, -7);
        Arrays.fill(upper, -7);
        int cnt = 0;
        for (int i = 0;i < word.length(); i++) {
            char c = word.charAt(i);
            if (Character.isLowerCase(c)) {
                lower[c - 'a'] = i;
            }
            else if (upper[c - 'A'] == -7){
                upper[c - 'A'] = i;
            }
        }
        for (int i = 0;i < 26; i++) {
            if (lower[i] != -7 && upper[i] != -7 && lower[i] < upper[i])
                cnt++;
        }
        return cnt;
    }
}