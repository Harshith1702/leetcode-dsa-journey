class Solution {
    public int firstUniqueEven(int[] nums) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        int n=nums.length;
        for(int i=0;i<n;i++){
            int x=nums[i];
            hm.put(x,hm.getOrDefault(x,0)+1);
        }
        for(int i=0;i<n;i++){
            int x=nums[i];
            if(x%2==0 && hm.get(x)==1) 
                return x;
        }
        return -1;
    }
}