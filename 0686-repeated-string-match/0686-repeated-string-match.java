class Solution {
    public int repeatedStringMatch(String a, String b) {
        StringBuilder s=new StringBuilder(a);
        int c=1;
        while(s.length()<b.length()+a.length()){
            s.append(a);
            c++;
            if(s.indexOf(b)!=-1)   return c;
        }
        return -1;
    }
}