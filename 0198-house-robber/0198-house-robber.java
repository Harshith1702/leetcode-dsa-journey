class Solution {
    public int rob(int[] nums) {
        int a=0,b=0;
        for(int i:nums){
            int curr=Math.max(a,b+i);
            b=a;
            a=curr;
        }
        return a;
    }
}