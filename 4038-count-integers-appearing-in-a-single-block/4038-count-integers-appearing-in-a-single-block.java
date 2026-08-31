class Solution {
    public int countSpecialIntegers(int[] nums) {
        Set<Integer> visited = new HashSet<>();
        int cnt = 0;
        int n = nums.length;
        for (int i = 0;i < n; i++) {
            int x = nums[i];
            if (visited.contains(x))   continue;
            visited.add(x);
            int first = i, last = i;
            for (int j = i;j < nums.length; j++) {
                if (nums[j] == x)   last = j;
            }
            boolean valid = true;
            for (int j = first;j <= last; j++) {
                if (nums[j] != x) {
                    valid = false;
                    break;
                }
            }
            if (valid)   cnt++;
        }
        return cnt;
    }
}