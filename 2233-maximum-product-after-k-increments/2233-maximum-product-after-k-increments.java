class Solution {
    public int maximumProduct(int[] nums, int k) {
        PriorityQueue<Integer> p=new PriorityQueue<>();
        for(int x:nums) p.add(x);
        
        while(k-- >0)   p.add(p.poll()+1);
        long res=1;
        int m=1000000007;
        while(!p.isEmpty()){
            res=(res*p.poll())%m;
        }
        return (int)res;
    }
}