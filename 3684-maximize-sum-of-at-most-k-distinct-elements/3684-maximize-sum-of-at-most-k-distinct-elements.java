class Solution {
    public int[] maxKDistinct(int[] nums, int k) {
        Set<Integer> s=new HashSet<>();
        for(int x:nums) s.add(x);
        List<Integer> l=new ArrayList<>(s);
        l.sort(Collections.reverseOrder());
        int n=Math.min(k,l.size());
        int[] res=new int[n];
        for(int i=0;i<n;i++)    res[i]=l.get(i);
        return res;
    }
}