class Solution {
    public String reverseByType(String s) {
        StringBuilder a=new StringBuilder();
        StringBuilder b=new StringBuilder();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c>='a' && c<='z')  a.append(c);
            else  b.append(c);
        }
        a.reverse();
        b.reverse();
        StringBuilder str=new StringBuilder();
        int l=0,r=0;
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c>='a' && c<='z')  str.append(a.charAt(l++));
            else  str.append(b.charAt(r++));
        }
        return str.toString();
    }
}