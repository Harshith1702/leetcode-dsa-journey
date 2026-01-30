class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> r=new ArrayList<>();
        r.add("");
        for(int i=0;i<n;i++){
            List<String> t=new ArrayList<>();
            for(String s:r)
                for(int j=0;j<=s.length();j++){
                    String res=s.substring(0,j)+"()"+s.substring(j);
                    if(!t.contains(res))    t.add(res);
                }r=t;
        }
        return r;
    }
}