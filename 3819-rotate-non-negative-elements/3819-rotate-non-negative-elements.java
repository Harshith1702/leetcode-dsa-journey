class Solution {
    public int[] rotateElements(int[] nums, int k) {
        ArrayList<Integer> a=new ArrayList<>();
        for(int x:nums) if(x>=0) a.add(x);
        int n=a.size();
        if(n==0)  return nums;
        k=k%n;
        int j=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>=0){
                nums[i]=a.get((j+k)%n);
                j++;
            }
        }
        return nums;
    }
}