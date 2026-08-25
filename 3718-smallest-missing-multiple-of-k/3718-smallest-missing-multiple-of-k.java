class Solution {
    public int missingMultiple(int[] nums, int k) {
        int i = 1,f = 0;
        int m = k * i;
        for (i = 1; ; i++){
            m = k * i;
            f = 0;
            for (int j = 0;j < nums.length; j++) {
                if (m == nums[j]){
                    f = 1;
                    break;
                } 
            }
            if(f == 0)   return m;
        }
        //return -1;
    }
}