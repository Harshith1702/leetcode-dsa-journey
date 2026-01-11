class Solution {
    public int majorityElement(int[] nums) {
        int cand=0,c=0;
        for(int x:nums){
            if(c==0)    cand=x;
            c+=(x==cand)? 1:-1;
        }return cand;
    }
}