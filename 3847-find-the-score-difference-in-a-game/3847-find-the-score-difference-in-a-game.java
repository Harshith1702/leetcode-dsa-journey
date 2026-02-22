class Solution {
    public int scoreDifference(int[] nums) {
        int n=nums.length;
        int p1=0,p2=0;
        int pactive=1;
        for(int i=0;i<n;i++){
            if(nums[i]%2!=0){
                if(pactive==0) pactive=1;
                else pactive=0;
            }
            if((i+1)%6==0){
                if(pactive==0) pactive=1;
                else pactive=0;
            }
            if(pactive==1){
                p1+=nums[i];
            }
            else{
                p2+=nums[i];
            }
        }
        return p1-p2;
    }
}