class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int n=nums.length;
        Map<Integer,Integer> freq=new HashMap<>();
        for(int i=0;i<n;i++){
            int x=nums[i];
            if(freq.containsKey(x)) freq.put(x,freq.get(x)+1);
            else freq.put(x,1);
        }
        int[] res=new int[k];
        for(int i=0;i<k;i++){
            int maxKey=0,maxFreq=0;
            for(int key:freq.keySet()){
                if(freq.get(key)>maxFreq){
                    maxFreq=freq.get(key);
                    maxKey=key;
                }
            }
                res[i]=maxKey;
                freq.remove(maxKey);
        }
        return res;
    }
}