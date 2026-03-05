class Solution {
    public int removeAlmostEqualCharacters(String word) {
        int c=0;
        for(int i=0;i<word.length()-1;i++){
            int condition=Math.abs(word.charAt(i)-word.charAt(i+1));
            if(condition<=1){
                c++;
                i++;
            }
        }
        return c;
    }
}