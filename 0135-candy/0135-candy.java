class Solution {
    public int candy(int[] ratings) {
        int n = ratings.length, sum = n;
        int[] c = new int[n];
        for (int i = 1;i < n; i++) {
            if (ratings[i] > ratings[i - 1]) {
                c[i] = c[i - 1] + 1;
            }
        }
        sum += c[n - 1];
        for (int i = n - 2;i >= 0; i--) {
            if (ratings[i] > ratings[i + 1]) {
                c[i] = Math.max(c[i], c[i + 1] + 1);
            }
            sum += c[i];
        }
        return sum;
    }
}