class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res=new ArrayList<>();
        res.add(new ArrayList<>());
        int p1=0;
        for(int i=0;i<nums.length;i++){
            int p2=(i>0 && nums[i]==nums[i-1])? p1:0;
            p1=res.size();
            for(int j=p2;j<p1;j++){
                List<Integer> tmp=new ArrayList<>(res.get(j));
                tmp.add(nums[i]);
                res.add(tmp);
            }
        }return res;
    }
}