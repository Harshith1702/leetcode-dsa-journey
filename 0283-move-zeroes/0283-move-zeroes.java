class Solution {
    public void moveZeroes(int[] nums) {
        int[] a=new int[nums.length];
        int j=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0)  a[j++]=nums[i];
        }
        for(int i=0;i<nums.length;i++){
            if(i>a.length)  nums[i]=0;
            else    nums[i]=a[i];
        }
    }
}