class Solution {
    public int longestCommonPrefix(int[] arr1, int[] arr2) {
        Set<Integer> hs = new HashSet<>();
        for (int x : arr1) {
            while (x > 0) {
                hs.add(x);
                x /= 10;
            }
        }
        int res = 0;
        for (int x : arr2) {
            while (x > 0) {
                if (hs.contains(x)){ 
                    res = Math.max(res, String.valueOf(x).length());
                    break;
                }
                x /= 10;
            }
        }
        return res;
    }
}