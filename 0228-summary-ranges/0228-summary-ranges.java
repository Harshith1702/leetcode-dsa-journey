class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> res=new ArrayList<String>();
        int n=nums.length;
        for(int i=0;i<n;i++){
            int strt=nums[i];
            while(i+1<n && nums[i+1]==nums[i]+1)    i++;
            if(strt==nums[i])   res.add(String.valueOf(strt));
            else res.add(strt+"->"+nums[i]);
        }return res;
    }
}