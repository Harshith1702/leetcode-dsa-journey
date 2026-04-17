class Solution {
    public int minMirrorPairDistance(int[] nums) {
        Map<Integer, Integer> hm = new HashMap<>();
        int min = Integer.MAX_VALUE;
        for (int i = 0;i < nums.length; i++) {
            if (hm.containsKey(nums[i])) {
                min = Math.min(min, i - hm.get(nums[i]));
                if (min == 1)    return 1;
            }
            int rev = Rev(nums[i]);
            hm.put(rev,i);
        }
        
        return min == Integer.MAX_VALUE ? -1 : min;
    }
    public int Rev(int i) {
        int res = 0;
        while(i > 0){
            res = res * 10 + (i % 10);
            i /= 10; 
        }
        return res;
    }
}