class Solution {
    public int minFlips(String s) {
        int n=s.length();
        String str=s+s;
        int diff1=0,diff2=0;
        int res=Integer.MAX_VALUE;
        for(int i=0;i<2*n;i++){
            char r=str.charAt(i); //right character
            if(r!=((i%2)==0 ? '0':'1')) diff1++;
            if(r!=((i%2)==1 ? '0':'1')) diff2++;
            if(i>=n){
                char l=str.charAt(i-n); //left character            
                if(l!=((i-n)%2==0 ? '0':'1')) diff1--;
                if(l!=((i-n)%2==1 ? '0':'1')) diff2--;
            }
            if(i>=n-1){
                res=Math.min(res,Math.min(diff1,diff2));
            }
        }
        return res;
    }
}