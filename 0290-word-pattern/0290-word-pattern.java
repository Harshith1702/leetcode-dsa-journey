class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] word=s.split(" ");
        if(word.length!=pattern.length()) return false;
        HashMap<Character,String> hm=new HashMap<>();
        for(int i=0;i<pattern.length();i++){
            char x=pattern.charAt(i);
            String y=word[i];
            if(hm.containsKey(x)){
                if(!hm.get(x).equals(y))    return false;
            }
            else{
                if(hm.containsValue(y))   return false;
                hm.put(x,y);
            }
        }return true;
    }
}