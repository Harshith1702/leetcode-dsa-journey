class Solution {
    public int minimumCost(int[] nums) {
        int min1=Integer.MAX_VALUE,min2=Integer.MAX_VALUE;
        int i=1;
        while(i < nums.length){
            int k=nums[i];
            if(k<min1){
                min2=min1;
                min1=k;
            }
            else if(k<min2)   min2=k;
            i++;
        }
        return nums[0]+min1+min2;
    }
}