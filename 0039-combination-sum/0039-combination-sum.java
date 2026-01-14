class Solution {
    List<List<Integer>> res=new ArrayList<>();
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        find(candidates,target,0,new ArrayList<>());
        return res;
    }
    void find(int[] a,int target,int i,List<Integer> curr){
        if(target==0){
            res.add(new ArrayList<>(curr));
            return;
        }
        if(target<0 || i==a.length) return;
        curr.add(a[i]);
        find(a,target-a[i],i,curr);
        curr.remove(curr.size()-1);
        find(a,target,i+1,curr);
    }
}