class Solution {
    public int numberOfSpecialChars(String word) {
        Set<Character> hs = new HashSet<>();
        for (char c : word.toCharArray()) {
            hs.add(c);
        }
        int cnt = 0;
        for (char c = 'a';c <= 'z'; c++) {
            if (hs.contains(c) && hs.contains(Character.toUpperCase(c))) {
                cnt++;
            }
        }
        return cnt;
    }
}