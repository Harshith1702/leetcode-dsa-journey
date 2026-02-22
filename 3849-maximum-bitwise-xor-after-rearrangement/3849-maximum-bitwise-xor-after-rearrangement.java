class Solution {
    public String maximumXor(String s, String t) {
        int one=0;
        for(int i=0;i<t.length();i++){
            if(t.charAt(i)=='1') one++;
        }
        StringBuilder res=new StringBuilder();
        int zero=t.length()-one;
        for(int i=0;i<s.length();i++){
            char x=s.charAt(i);
            if(x=='0' &&  one>0){
                res.append('1');
                one--;
            }
            else if(x=='1' && zero>0){
                res.append('1');
                zero--;
            }
            else{
                res.append('0');
                if(x=='1') one--;
                else zero--;
            }
        }
        return res.toString();
    }
}