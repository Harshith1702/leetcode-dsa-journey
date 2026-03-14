class Solution {
    public String getHappyString(int n, int k) {
        int choices=3*(1<<(n-1));//3 characters*2 options as we cant repeat simultaneously
        if(k>choices)   return "";
        StringBuilder res=new StringBuilder();
        char prev=' ';
        for(int x=0;x<n;x++){
            int cnt=1<<(n-x-1);
            for(char i='a';i<='c';i++){
                if(i==prev) continue;
                if(k>cnt)   k-=cnt;
                else{
                    res.append(i);
                    prev=i;
                    break;
                }
            }
        }
        return res.toString();
    }
}