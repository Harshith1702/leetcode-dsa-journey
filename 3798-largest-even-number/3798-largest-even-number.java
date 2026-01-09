class Solution {
    public String largestEven(String s) {
        int n=s.length()-1;
        while(n>=0){
            if(s.charAt(n)=='2')  return s.substring(0,n+1);
            n--;
        }
        return "";
    }
}