class Solution {
    public int maximum69Number (int num) {
        char[] d=String.valueOf(num).toCharArray();
        boolean c=false;
        int res=0;
        for(char x:d){
            if(!c && x=='6'){
                res=res*10+9;
                c=true;
            }
            else    res=res*10+(x-'0');
        }
        return res;
    }
}