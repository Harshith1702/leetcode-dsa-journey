class Solution {
    public String reverseWords(String s) {
        int i=s.length()-1;
        StringBuilder res=new StringBuilder();
        while(i>=0){
            while(i>=0 && s.charAt(i)==' ')     i--;
            if(i<0)     break;
            int end=i;

            while(i>=0 && s.charAt(i)!=' ')     i--;
            int start=i;

            if(res.length()>0)  res.append(" ");
            res.append(s.substring(start+1,end+1));
        }
        return res.toString();
    }
}