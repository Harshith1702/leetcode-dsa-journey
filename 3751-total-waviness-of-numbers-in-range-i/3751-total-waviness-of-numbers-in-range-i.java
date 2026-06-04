class Solution {
    public int totalWaviness(int num1, int num2) {
        int sum = 0;
        for (int i = num1;i <= num2; i++) {
            String s = Integer.toString(i);
            for (int j = 1;j < s.length() - 1; j++) {
                char a = s.charAt(j - 1), b = s.charAt(j), c = s.charAt(j + 1);
                if ((b > a && b > c) || (b < a && b < c))
                    sum++;
            }
        }
        return sum;
    }
}