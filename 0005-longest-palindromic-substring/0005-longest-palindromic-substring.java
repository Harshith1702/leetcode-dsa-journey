class Solution {
    public String longestPalindrome(String s) {
        int n=s.length();
        int maxlen=0;
        int start=0,end=0;
        for(int i=0;i<n;i++){
            //Odd 
            int p1=i,p2=i;
            while(p1>=0 && p2<n && (s.charAt(p1)==s.charAt(p2))){
                if(p2-p1+1>maxlen){
                    start=p1;
                    end=p2+1;
                    maxlen=p2-p1+1;
                }
                p1--;
                p2++;
            }


            //Even
            p1=i;
            p2=i+1;
            while(p1>=0 && p2<n && (s.charAt(p1)==s.charAt(p2))){
                if(p2-p1+1>maxlen){
                    start=p1;
                    end=p2+1;
                    maxlen=p2-p1+1;
                }
                p1--;
                p2++;
            }
        }
        return s.substring(start,end);
    }
}