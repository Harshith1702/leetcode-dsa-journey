class Solution {
    public String largestEven(String s) {
        for(int i=s.length()-1;i>=0;i--){
            int n=s.charAt(i);
            if(n%2==0)  return s.substring(0,i+1);
        }return "";
    }
}