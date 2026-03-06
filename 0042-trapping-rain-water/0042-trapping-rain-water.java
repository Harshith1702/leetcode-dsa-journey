class Solution {
    public int trap(int[] height) {
        int n=height.length;
        int p1=0,p2=n-1;
        int Lm=height[0],Rm=height[n-1];//Left_Max,Right_Max
        int res=0;
        while(p1<p2){
            if(height[p1]<height[p2]){
                Lm=Math.max(Lm,height[p1]);
                res+=(Lm-height[p1]);
                p1++;
            }
            else{
                Rm=Math.max(Rm,height[p2]);
                res+=(Rm-height[p2]);
                p2--;
            }
        }
        return res;
    }
}