class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n=nums.length;
        HashMap<Integer,Integer> freq=new HashMap<>();
        for(int x:nums){
            freq.put(x,freq.getOrDefault(x,0)+1);
        }
        List<Integer> res=new ArrayList<>();
        for(int k:freq.keySet()){//key
            if(freq.get(k)>n/3) res.add(k);
        }
        return res;
    }
}