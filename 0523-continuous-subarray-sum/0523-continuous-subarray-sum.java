class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        Map<Integer,Integer> hm=new HashMap<>();
        hm.put(0,-1);
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            if(k!=0)    sum%=k;
            
            if(hm.containsKey(sum)){
                if(i-hm.get(sum)>1) return true;
            }
            else    hm.put(sum,i);
        }
        return false;
    }
}