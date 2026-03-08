class Solution {
    public int smallestBalancedIndex(int[] nums) {
        int n=nums.length;
        long[] suff=new long[n+1];
        long max=(long)1e14;
        suff[n]=1;
        for(int i=n-1;i>=0;i--){
            if(suff[i+1]>max/nums[i]){
                while(i>=0){
                    suff[i]=max+1;
                    i--;
                }
                break;
            }
            else{
                suff[i]=suff[i+1]*nums[i];
            }
        }
        long ls=0;//left sum
        for(int i=0;i<n;i++){
            if(ls==suff[i+1])   return i;
            ls+=nums[i];
        }
        return -1;
    }
}