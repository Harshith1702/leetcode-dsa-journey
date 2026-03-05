class Solution {
    public int removeAlmostEqualCharacters(String word) {
        int c=0;
        int n=word.length();
        for(int i=0;i<n-1;i++){
            if(Math.abs(word.charAt(i)-word.charAt(i+1))<=1){
                c++;
                i++;
            }
        }
        return c;
    }
}