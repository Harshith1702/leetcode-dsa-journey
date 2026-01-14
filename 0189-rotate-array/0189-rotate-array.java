class Solution {
    public void rotate(int[] nums, int k) {
        int n=nums.length;
        k%=n;
        rev(nums,0,n-1);
        rev(nums,0,k-1);
        rev(nums,k,n-1);
    }
    void rev(int[] a,int low,int high){
        while(low<high){
            int x=a[low];
            a[low]=a[high];
            a[high]=x;
            low++;
            high--;
        }
    }
}