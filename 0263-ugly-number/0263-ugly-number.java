class Solution {
    public boolean isUgly(int n) {
        if(n<=0)    return false;
        for(int x:new int[]{2,3,5}){
            while(n%x==0)   n/=x;
        }
        if(n==1)    return true;
        return false;
    }
}