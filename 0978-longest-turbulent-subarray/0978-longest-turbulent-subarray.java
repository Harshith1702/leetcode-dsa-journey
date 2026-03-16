class Solution {
    public int maxTurbulenceSize(int[] arr) {
        int top=1,bottom=1,res=1;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1]){
                top=bottom+1;
                bottom=1;
            }
            else if(arr[i]<arr[i+1]){
                bottom=top+1;
                top=1;
            }
            else    top=bottom=1;
            res=Math.max(res,Math.max(top,bottom));
        }
        return res;
    }
}