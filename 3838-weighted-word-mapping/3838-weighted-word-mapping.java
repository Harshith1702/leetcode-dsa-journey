class Solution {
    public String mapWordWeights(String[] words, int[] weights) {
        StringBuilder sb = new StringBuilder();
        for (String w : words){
            int sum = 0;
            for (int i = 0;i < w.length(); i++){
                sum += weights[w.charAt(i) - 'a'];
            }
            int m = sum % 26;
            sb.append((char)('z' - m));
        }
        return sb.toString();
    }
}